package com.wuyiz.MyTest.img;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Img1 {
    //目标文件夹
    private static final String inputPath = "C:\\Users\\AllureLove\\Desktop\\工作\\装备图片";
    //输出文件夹
    private static final String outputPath = "C:\\Users\\AllureLove\\Desktop\\工作\\123";
    private Image img;
    private int width;
    private int height;

    public Img1(String filename) throws IOException {
        File file = new File(filename);
        img = ImageIO.read(file);
        width = img.getWidth(null);
        height = img.getHeight(null);
    }

    public static void main(String[] ags) throws IOException {
        System.out.println(new Date());

        readFile(inputPath);


        System.out.println(new Date());
    }

    private static void readFile(String inputPath) throws IOException {
        File file = new File(inputPath);
        if (file.isDirectory()) {
            System.out.println("文件夹名称：" + file.getName());
            String[] fileList = file.list();
            for (String s : fileList) {
                System.out.println(file.getName() + "下的图片名称：" + s);
                String newFilePath = inputPath + File.separator + s;
                File file1 = new File(newFilePath);
                if (file1.isDirectory()) {
                    readFile(newFilePath);
                } else {
                    //构建写如果图片
                    Img1 img1 = new Img1(newFilePath);
                    img1.resize(1000, 1000, s);
                }

            }
        }
    }

    private void resize(int w, int h, String fileName) throws IOException {
        if (width / height > w / h) {
            //resizeByWidth(w);
            h = height * w / width;
            writeImage(w, h, fileName);
        } else {
            // resizeByHeight(h);
            w = width * h / height;
            writeImage(w, h, fileName);
        }
    }

    private void writeImage(int w, int h, String fileName) throws IOException {

        //生成图片的平滑度优先级比速度高，生成的图片质量好
        BufferedImage bufferedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        //绘制缩小后的图
        bufferedImage.getGraphics().drawImage(img, 0, 0, w, h, null);

        //将文件夹下面的所有图片写到一个指定的文件夹下面
        String pathname = outputPath + File.separator + "newFile";
        File file = new File(pathname);
        if (!file.exists()) {
            file.mkdirs();
        }

        File tempFile = new File(pathname + File.separator + fileName);
        //输出到文件流
        FileOutputStream fos = new FileOutputStream(tempFile);
        //转码
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(fos);
        //使用JPEG转码
        encoder.encode(bufferedImage);
        //关闭流
        fos.close();
    }
}
