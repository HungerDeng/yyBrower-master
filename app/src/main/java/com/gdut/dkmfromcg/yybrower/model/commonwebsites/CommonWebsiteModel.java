package com.gdut.dkmfromcg.yybrower.model.commonwebsites;

import com.gdut.dkmfromcg.commonlib.mvp.BaseModel;
import com.gdut.dkmfromcg.commonlib.mvp.datahandler.RxHandler;
import com.gdut.dkmfromcg.commonlib.util.log.Logger;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.entities.CommonWebsiteEntity;
import com.trello.rxlifecycle2.LifecycleProvider;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Function;

/**
 * Created by dkmFromCG on 2018/4/5.
 * function:
 */

public class CommonWebsiteModel extends BaseModel implements ICommonWebsiteModel {




    public CommonWebsiteModel(LifecycleProvider lifecycleProvider) {
        super(lifecycleProvider);
    }

    @Override
    public void queryCollectCommonWebsites(int message) {

        Logger.d("queryCollectCommonWebsites",message);

        RxHandler.getInstance().chainProcess(getLifecycleProvider(), message, new Function() {
            @Override
            public Object apply(Object o) throws Exception {
                final List<CommonWebsiteEntity> entities = new ArrayList<>();
                entities.add(new CommonWebsiteEntity(CommonWebsitesType.LEARN, R.drawable.book));
                entities.add(new CommonWebsiteEntity(CommonWebsitesType.KAI_YAN, R.drawable.eye));
                entities.add(new CommonWebsiteEntity(CommonWebsitesType.WEATHER, R.drawable.weather));
                entities.add(new CommonWebsiteEntity(CommonWebsitesType.BASKETBALL, R.drawable.basketball));
                return entities;
            }
        });
    }
}
