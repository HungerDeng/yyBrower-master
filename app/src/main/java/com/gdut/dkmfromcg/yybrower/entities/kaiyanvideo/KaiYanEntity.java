package com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo;

import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class KaiYanEntity {

    private List<VideoEntity> itemList;
    private String nextPageUrl;

    public KaiYanEntity(List<VideoEntity> itemList, String nextPageUrl) {
        this.itemList = itemList;
        this.nextPageUrl = nextPageUrl;
    }

    public List<VideoEntity> getItemList() {
        return itemList;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    @Override
    public String toString() {
        return "{  \n" +
                "   \"nextPageUrl\" : " + nextPageUrl + ";\n" +
                "   \"itemList\" : " + itemList + ";\n" +
                "}";
    }
}
