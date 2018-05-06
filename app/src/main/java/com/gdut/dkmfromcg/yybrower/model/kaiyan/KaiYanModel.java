package com.gdut.dkmfromcg.yybrower.model.kaiyan;


import android.support.annotation.NonNull;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gdut.dkmfromcg.commonlib.mvp.BaseModel;
import com.gdut.dkmfromcg.commonlib.mvp.datahandler.RxHandler;
import com.gdut.dkmfromcg.commonlib.net.RestClient;
import com.gdut.dkmfromcg.commonlib.net.callback.RxObserver;
import com.gdut.dkmfromcg.commonlib.net.exception.ApiException;
import com.gdut.dkmfromcg.yybrower.app.Api;
import com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo.KaiYanEntity;
import com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo.VideoEntity;
import com.trello.rxlifecycle2.LifecycleProvider;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class KaiYanModel extends BaseModel implements IKaiYanModel {

    public KaiYanModel(@NonNull LifecycleProvider lifecycleProvider) {
        super(lifecycleProvider);
    }

    @Override
    public void getVideoData(final int messageId) {
        RestClient.builder()
                .url(Api.KAI_YAN_HOME_PAGE)
                .setLifecycleProvider(getLifecycleProvider())
                .build()
                .get(new RxObserver<String>() {
                    @Override
                    protected void onStart(Disposable d) {

                    }

                    @Override
                    protected void onSuccess(final String response) {

                        RxHandler.getInstance()
                                .chainProcess(getLifecycleProvider(), messageId, new Function() {
                                    @Override
                                    public Object apply(Object o) throws Exception {

                                        final List<VideoEntity> videoEntityList = new ArrayList<>();

                                        JSONObject object = JSONObject.parseObject(response);
                                        // nextPageUrl
                                        final String nextPageUrl = object.getString("nextPageUrl");
                                        // itemList
                                        JSONArray itemList = object.getJSONArray("itemList");
                                        final int size = itemList.size();
                                        for (int i = 0; i < size; i++) {
                                            final JSONObject item = itemList.getJSONObject(i);
                                            final String type = item.getString("type");
                                            if (type != null && "video".equals(type)) {
                                                final VideoEntity videoEntity = JSON.parseObject(item.toJSONString(), VideoEntity.class);
                                                videoEntityList.add(videoEntity);
                                            }
                                        }
                                        final KaiYanEntity kaiYanEntity = new KaiYanEntity(videoEntityList, nextPageUrl);
                                        return kaiYanEntity;
                                    }
                                });
                    }

                    @Override
                    protected void onError(ApiException e) {

                    }
                });
    }
}
