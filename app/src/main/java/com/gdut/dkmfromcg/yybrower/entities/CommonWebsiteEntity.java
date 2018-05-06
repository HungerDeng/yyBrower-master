package com.gdut.dkmfromcg.yybrower.entities;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.gdut.dkmfromcg.yybrower.app.RvItemType;

/**
 * Created by dkmFromCG on 2018/4/5.
 * function:
 */

public class CommonWebsiteEntity implements MultiItemEntity{

    private String tvDescription;
    private int ivCommonWebsite;

    public CommonWebsiteEntity(String tvDescription, int ivCommonWebsite) {
        this.tvDescription = tvDescription;
        this.ivCommonWebsite = ivCommonWebsite;
    }

    public String getTvDescription() {
        return tvDescription;
    }

    public int getIvCommonWebsite() {
        return ivCommonWebsite;
    }

    @Override
    public int getItemType() {
        return RvItemType.COMMON_WEBSITE;
    }
}
