package com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class Consumption {

    private int collectionCount; //多少人收藏
    private int shareCount; // 多少人分享
    private int replyCount; // 多少人回复

    public int getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(int collectionCount) {
        this.collectionCount = collectionCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    @Override
    public String toString() {
        return "{  \n" +
                "   \"collectionCount\" : " + collectionCount + ";\n" +
                "   \"shareCount\" : " + shareCount + ";\n" +
                "   \"replyCount\" : " + replyCount + ";\n" +

                "}";
    }

}
