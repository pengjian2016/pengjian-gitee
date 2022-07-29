package javaToPdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import utils.FileUtil;
import utils.PathUtil;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author pengjian
 * @since 2022-07-28
 */
public class ImageToPdf {
    public static  boolean image2PDF(String source, String target) {
        try {
            Image image = Image.getInstance(source);
            //获取图片尺寸
            float img_width = image.getWidth();
            float img_height = image.getHeight();
            float percent = PageSize.A4.getWidth()/img_width;
            Document imgToPdfDoc = new Document(new Rectangle(PageSize.A4.getWidth()+20, img_height * percent+20), 10, 10, 10, 10);
            imgToPdfDoc.newPage();
            PdfWriter.getInstance(imgToPdfDoc, new FileOutputStream(target));
            imgToPdfDoc.open();
            image.setAlignment(Image.MIDDLE);
            image.scalePercent(PageSize.A4.getWidth()/img_width*100);
            imgToPdfDoc.add(image);
            imgToPdfDoc.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (DocumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        String src = PathUtil.getTemplatePath()+"logo.png";
        String dest =  PathUtil.getDemoFilePath()+"logo.pdf";
        image2PDF(src, dest);
        FileUtil.open_directory(dest);

    }

}
