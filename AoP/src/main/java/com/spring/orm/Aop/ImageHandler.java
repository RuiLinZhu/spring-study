package com.spring.orm.Aop;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by User on 2019/3/11.
 */
@Aspect
public class ImageHandler {
    private  static final Logger logger = LoggerFactory.getLogger(ImageHandler.class);
//    切点函数，必须为空
    @Pointcut("execution(* com.spring.orm.Aop.ImageCopy.copyImage())")
    public void handleImage(){

    }
    @Before(value = "handleImage()")
    public void pressTextOnImage()throws IOException{
        logger.info("开始给图片添加水印");
        File srcFile = new File("D:/img.jpg");
        InputStream input= new FileInputStream(srcFile);
        BufferedImage srcImg = ImageIO.read(input);
        int width=srcImg.getWidth();
        int height=srcImg.getHeight();
        System.out.println("原图宽："+width+",原图高："+height);
        File destFile=new File("D:/img1.jpg");
        Color color =new Color(211,71,38);
        int size=20;
        Font font =new Font("微软雅黑",Font.BOLD,size);
        String text="zrl";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width-text.length()*size)/2,height/2-size,1.0F);

    }
    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始将图片转成黑白");
        File srcFile=new File("E:/img1.jpg");
        File destFile=new File("E:/img2.jpg");
        ImageUtil.gray(srcFile,destFile);
    }
}
