package javaToPdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import utils.FileUtil;
import utils.PathUtil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author pengjian
 * @since 2022-07-28
 */

public class JavaToPdfHtml {

    private static final String DEST = PathUtil.getDemoFilePath()+"HelloWorld_CN_HTML.pdf";
    private static final String HTML = PathUtil.getTemplatePath()+"template.html";
    private static final String FONT = PathUtil.getTemplatePath()+"simhei.ttf";


    public static void main(String[] args) throws IOException, DocumentException {
        FileUtil.open_directory(HTML);
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(DEST));
        // step 3
        document.open();
        // step 4
        XMLWorkerFontProvider fontImp = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
        fontImp.register(FONT);
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(HTML), null, Charset.forName("UTF-8"), fontImp);
        // step 5
        document.close();

        FileUtil.open_directory(DEST);
    }
}
