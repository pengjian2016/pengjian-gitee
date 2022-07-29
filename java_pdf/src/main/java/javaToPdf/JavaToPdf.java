package javaToPdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import utils.FileUtil;

import java.io.FileOutputStream;

/**
 * @author pengjian
 * @since 2022-07-28
 */
public class JavaToPdf {

    public static void main(String[] args) throws Exception {
        String filePath = "E:\\IDEA_workspace\\pengjian-gitee\\java_pdf\\file\\helloPdf.pdf";
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();
        document.add(new Paragraph("hello world"));
        document.close();
        writer.close();
        FileUtil.open_directory(filePath);
    }


}
