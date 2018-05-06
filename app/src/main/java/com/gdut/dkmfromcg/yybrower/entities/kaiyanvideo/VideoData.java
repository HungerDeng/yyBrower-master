package com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo;

import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class VideoData {

    private String dataType;
    private int id;
    private String title;
    private String description;
    private String slogan;
    private String playUrl; //默认的播放地址
    private long date;
    private Cover cover;
    private List<PlayInfo> playInfo;
    private Consumption consumption;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public Consumption getConsumption() {
        return consumption;
    }

    public void setConsumption(Consumption consumption) {
        this.consumption = consumption;
    }

    public List<PlayInfo> getPlayInfo() {
        return playInfo;
    }

    public void setPlayInfo(List<PlayInfo> playInfo) {
        this.playInfo = playInfo;
    }

    @Override
    public String toString() {
        return "{  \n" +
                "   \"dataType\" : " + dataType + ";\n" +
                "   \"id\" : " + id + ";\n" +
                "   \"title\" : " + title + ";\n" +
                "   \"description\" : " + description + ";\n" +
                "   \"slogan\" : " + slogan + ";\n" +
                "   \"playUrl\" : " + playUrl + ";\n" +
                "   \"date\" : " + date + ";\n" +
                "   \"cover\" : " + cover + ";\n" +
                "   \"playInfo\" : " + playInfo + ";\n" +
                "   \"consumption\" : " + consumption + ";\n" +
                "}";
    }
}
