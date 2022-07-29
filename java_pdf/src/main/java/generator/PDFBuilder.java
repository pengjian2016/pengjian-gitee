package generator;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.IOException;

/**
 * @author pengjian
 * @since 2022-07-29
 * PDF导出页眉、页脚、水印等处理类
 * 设置页面附加属性
 */
public class PDFBuilder extends PdfPageEventHelper {

    /**
     * 页眉
     */
    public String header = "itext测试页眉";
    /**
     * 文档字体大小，页脚页眉最好和文本大小一致
     */
    public int presentFontSize = 12;
    /**
     * 文档页面大小，最好前面传入，否则默认为A4纸张
     */
    public Rectangle pageSize = PageSize.A4;
    /**
     * 模板
     */
    public PdfTemplate pdfTemplate;
    /**
     * 基础字体对象
     */
    public BaseFont baseFont = null;
    /**
     * 利用基础字体生成的字体对象，一般用于生成中文文字
     */
    public Font fontDetail = null;


    public void setHeader(String header) {
        this.header = header;
    }

    public void setPresentFontSize(int presentFontSize) {
        this.presentFontSize = presentFontSize;
    }

    /**
     * 文档打开时创建模板
     * @see PdfPageEventHelper#onOpenDocument(PdfWriter, Document)
     */
    @Override
    public void onOpenDocument(PdfWriter writer, Document document) {
        // 共 页 的矩形的长宽高
        pdfTemplate = writer.getDirectContent().createTemplate(50, 50);
    }

    /**
     * 关闭每页的时候，写入页眉，写入'第几页共'这几个字。
     * @see PdfPageEventHelper#onEndPage(PdfWriter, Document)
     */
    @Override
    public void onEndPage(PdfWriter writer, Document document) {
        this.addPage(writer, document);
        this.addWatermark(writer);
    }

    //加分页
    public void addPage(PdfWriter writer, Document document) {
        // 首页不添加页眉和页脚
        if (writer.getPageNumber() == 1) {
            // 用于添加首页的封面背景图，这里首页添加了两张背景图，一个从左上角一个从左下角，具体位置可修改下面的位置信息
            try {
                // PDF 首页顶部背景图
                Image image = Image.getInstance("https://******");
                // 设置图片的位置 图片位置左边是左下角为0,0
                image.setAbsolutePosition(0, 441);
                // 设置图片的大小
                image.scaleAbsolute(570, 400);

                // PDF 首页底部背景图
                Image instance = Image.getInstance("https://*****");
                instance.setAbsolutePosition(0, 0);
                instance.scaleAbsolute(595, 260);

                document.add(image);
                document.add(instance);
            } catch (IOException | DocumentException e) {
                e.printStackTrace();
            }
            return;
        }

        //设置分页页眉页脚字体
        Image image = null;
        try {
            // 页眉logo图片实例
            image = Image.getInstance("https://******");
            if (baseFont == null) {
                baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", false);
            }
            if (fontDetail == null) {
                // 数据体字体
                fontDetail = new Font(baseFont, presentFontSize, Font.NORMAL);
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }

        PdfContentByte directContent = writer.getDirectContent();


        //1、生成右侧页眉
        // document.right(-20)  方法设置页眉的左右间距
        // document.top(+20)  方法设置页眉的上下间距
        ColumnText.showTextAligned(directContent,
                Element.ALIGN_RIGHT, new Phrase("联系电话：400-000-0000", fontDetail),
                document.right(), document.top(), 0);

        //  ！！！！ 最重要的是这个， 如果页眉需要设置图片的话，需要在Phrase对象中添加一个Chunk对象，在Chunk对象中添加图片信息即可
        Phrase p1 = new Phrase("", fontDetail);
        p1.add(new Chunk(image, 0, -30));
        // 1、写入左侧页眉
        ColumnText.showTextAligned(directContent, Element.ALIGN_LEFT, p1, document.left(), document.top(-20), 0);
        // 2、生成右侧页脚
        ColumnText.showTextAligned(directContent, Element.ALIGN_RIGHT, new Phrase(String.valueOf(document.getPageNumber() - 1), fontDetail), document.right(), document.bottom(-20), 0);

        // 2、生成左侧页脚
        ColumnText.showTextAligned(directContent, Element.ALIGN_LEFT, new Phrase("******有限公司", fontDetail), document.left(), document.bottom(-20), 0);


    }

    /**
     * 加水印
     */
    public void addWatermark(PdfWriter writer) {
        // 水印图片
        Image image;
        try {
            image = Image.getInstance("./web/images/001.jpg");
            PdfContentByte content = writer.getDirectContentUnder();
            content.beginText();
            // 开始写入水印
            for (int k = 0; k < 5; k++) {
                for (int j = 0; j < 4; j++) {
                    image.setAbsolutePosition(150 * j, 170 * k);
                    content.addImage(image);
                }
            }
            content.endText();
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭文档时，替换模板，完成整个页眉页脚组件
     *
     * @see PdfPageEventHelper#onCloseDocument(PdfWriter, Document)
     */
    @Override
    public void onCloseDocument(PdfWriter writer, Document document) {
        // 7.最后一步了，就是关闭文档的时候，将模板替换成实际的 Y 值,至此，page x of y 制作完毕，完美兼容各种文档size。
        pdfTemplate.beginText();
        // 生成的模版的字体、颜色
        pdfTemplate.setFontAndSize(baseFont, presentFontSize);
        //页脚内容拼接  如  第1页/共2页
        String foot2 = " " + (writer.getPageNumber()) + " 页";
        // 模版显示的内容
        pdfTemplate.showText(foot2);
        pdfTemplate.endText();
        pdfTemplate.closePath();
    }
}
