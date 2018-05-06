package com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function: 视频的几种播放选择
 */

public class PlayInfo {
    private int height; // 视频高度
    private int width;  // 视频宽度
    private String name; //视频清晰度
    private String url; //播放地址

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "{  \n" +
                "   \"height\" : " + height + ";\n" +
                "   \"width\" : " + width + ";\n" +
                "   \"name\" : " + name + ";\n" +
                "   \"url\" : " + url + ";\n" +
                "}";
    }
}
