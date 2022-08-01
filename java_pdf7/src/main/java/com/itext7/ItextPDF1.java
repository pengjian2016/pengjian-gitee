package com.itext7;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.utils.FileUtil;
import com.utils.PathUtil;

import java.io.FileNotFoundException;

/**
 * @author pengjian
 * @since 2022-07-29
 * Hello World
 */
public class ItextPDF1 {
    public static void main(String[] args) throws FileNotFoundException {
        String dest = PathUtil.getDemoFilePath() + "ItextPDF1.PDF";
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        document.add(new Paragraph("Hello World!"));
        document.close();
        FileUtil.open_directory(dest);
    }

}
