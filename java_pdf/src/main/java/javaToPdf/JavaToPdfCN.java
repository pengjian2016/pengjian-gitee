package javaToPdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import utils.FileUtil;
import utils.PathUtil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author pengjian
 * @since 2022-07-28
 *
 */
public class JavaToPdfCN {

    private static final String FILEPATH = PathUtil.getTemplatePath()+"helloPdf_CN.pdf";
    private static final String FONT = PathUtil.getTemplatePath()+"simhei.ttf";

    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILEPATH));
        document.open();
        Font font = FontFactory.getFont(FONT, BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        document.add(new Paragraph("hello world 是否支持中文：我是中文字体123",font));
        document.close();
        writer.close();
        FileUtil.open_directory(FILEPATH);
    }
}
