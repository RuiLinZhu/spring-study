package com.spring.orm.Aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

/**
 * Created by User on 2019/3/11.
 */
public class QrCode {
    public static void main(String[] args) {
       QrConfig config=new QrConfig(300,300);
       config.setImg("d:/img.jpg");
       config.setMargin(3);
        Color foreColor=new Color(173,255,47);
        Color bgColor=new Color(240,255,240);
        int foreColorRGB=foreColor.getRGB();
        int bgColorRGB=bgColor.getRGB();
        config.setForeColor(foreColorRGB);
        config.setBackColor(bgColorRGB);
        QrCodeUtil.generate("https://www.jianshu.com/u/ce6045cb864d",config,FileUtil.file("E:/Logo.jpg"));
    }
}
