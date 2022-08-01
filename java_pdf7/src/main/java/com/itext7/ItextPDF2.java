package com.itext7;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.utils.FileUtil;
import com.utils.PathUtil;


/**
 * @author pengjian
 * @since 2022-07-29
 * 添加缩进⽆序段落
 */
public class ItextPDF2 {
    public static void main(String[] args) throws Exception {
        String dest = PathUtil.getDemoFilePath() + "ItextPDF2.PDF";
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
// Create a PdfFont
        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
// Add a Paragraph
        document.add(new Paragraph("iText is:").setFont(font));
// Create a List
        List list = new List()
                .setSymbolIndent(12)
                .setListSymbol("\u2022")
                .setFont(font);
// Add ListItem objects
        list.add(new ListItem("Never gonna give you up"))
                .add(new ListItem("Never gonna let you down"))
                .add(new ListItem("Never gonna run around and desert you"))
                .add(new ListItem("Never gonna make you cry"))
                .add(new ListItem("Never gonna say goodbye"))
                .add(new ListItem("Never gonna tell a lie and hurt you"));
// Add the list
        document.add(list);
        document.close();
        FileUtil.open_directory(dest);
    }

}
