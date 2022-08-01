package com.itext7;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.utils.FileUtil;
import com.utils.PathUtil;


/**
 * @author pengjian
 * @since 2022-07-29
 * 添加图⽚
 */
public class ItextPDF3 {
    public static void main(String[] args) throws Exception {
        String dest = PathUtil.getDemoFilePath() + "ItextPDF3.PDF";
        String foxStr = PathUtil.getTemplatePath() + "meow06.jpg";
        String dogStr  = PathUtil.getTemplatePath() + "meow07.jpg";
        String font  = PathUtil.getTemplatePath() + "font\\simhei.ttf";
        String font2  = PathUtil.getTemplatePath() + "font\\SIMSUN.TTC,1";


        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        //字体1
        PdfFont pdfFont = PdfFontFactory.createFont(font2, PdfEncodings.IDENTITY_H);
        //字体2
        //PdfFont pdfFont = PdfFontFactory.createFont(font, PdfEncodings.IDENTITY_H);


        Paragraph paragraph = new Paragraph("添加图片 这是中文字!");
        paragraph.setFont(pdfFont).setFontSize(12);
        document.add(paragraph);

        Image fox = new Image(ImageDataFactory.create(foxStr ));
        Image dog = new Image(ImageDataFactory.create(dogStr ));
        Paragraph p = new Paragraph("The quick brown ")
                .add(fox)
                .add(" jumps over the lazy ")
                .add(dog);
        document.add(p);


        document.close();
        FileUtil.open_directory(dest);
    }

}
