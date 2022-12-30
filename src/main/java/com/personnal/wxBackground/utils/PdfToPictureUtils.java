package com.personnal.wxBackground.utils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import com.lowagie.text.pdf.PdfReader;

/**
  * @classname PdfToPictureUtils
  * @desc PDF转图片
 *  使用icepdf
  * @author lvdong
  * @version 1.0.0
  * @since：2022/6/23 10:01
*/
public class PdfToPictureUtils {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PdfToPictureUtils.class);
    /***
     * PDF文件转PNG图片，全部页数
     *
     * @param pdfFilePath pdf完整路径
     * @param dpi dpi越大转换后越清晰，相对转换速度越慢
     */
    public static void pdf2Image(String pdfFilePath, int dpi) {
        File file = new File(pdfFilePath);
        PDDocument pdDocument;
        try {
            String imgPdfPath = file.getParent();
            int dot = file.getName().lastIndexOf('.');
            // 获取图片文件名
            String imagePdfName = file.getName().substring(0, dot);

            pdDocument = PDDocument.load(file);
            PDFRenderer renderer = new PDFRenderer(pdDocument);
            /* dpi越大转换后越清晰，相对转换速度越慢 */
            PdfReader reader = new PdfReader(pdfFilePath);
            int pages = reader.getNumberOfPages();
            StringBuffer imgFilePath;
            for (int i = 0; i < pages; i++) {
                String imgFilePathPrefix = imgPdfPath + File.separator + imagePdfName;
                imgFilePath = new StringBuffer();
                imgFilePath.append(imgFilePathPrefix);
                imgFilePath.append("_");
                imgFilePath.append((i + 1));
                imgFilePath.append(".png");
                File dstFile = new File(imgFilePath.toString());
                BufferedImage image = renderer.renderImageWithDPI(i, dpi);
                ImageIO.write(image, "png", dstFile);
            }
            log.info("PDF文档转PNG图片成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        pdf2Image("D:\\upload\\人力资源总监工具书（950页）.pdf",130);
    }
}
