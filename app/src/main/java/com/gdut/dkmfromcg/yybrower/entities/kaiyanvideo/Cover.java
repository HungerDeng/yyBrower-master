package com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function: 背景图
 */

public class Cover {
    private String feed;
    private String detail;
    private String blurred;
    private String homepage;

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBlurred() {
        return blurred;
    }

    public void setBlurred(String blurred) {
        this.blurred = blurred;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Override
    public String toString() {
        return "{  \n" +
                "   \"feed\" : " + feed + ";\n" +
                "   \"detail\" : " + detail + ";\n" +
                "   \"blurred\" : " + blurred + ";\n" +
                "   \"homepage\" : " + homepage + ";\n" +
                "}";
    }
}
