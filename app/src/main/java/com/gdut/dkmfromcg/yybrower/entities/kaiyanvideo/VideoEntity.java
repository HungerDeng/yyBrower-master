package com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class VideoEntity {

    private String type;
    private VideoData data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VideoData getData() {
        return data;
    }

    public void setData(VideoData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{  \n" +
                "   \"type\" : " + type + ";\n" +
                "   \"data\" : " + data + ";\n" +
                "}";
    }
}
