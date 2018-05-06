package com.gdut.dkmfromcg.yybrower.model.gankio;

import com.gdut.dkmfromcg.yybrower.entities.GankIoDataEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by dkmFromCG on 2018/4/18.
 * function:
 */

public interface GankIoServices {

    @GET("data/{type}/{pre_page}/{page}")
    Observable<GankIoDataEntity> getGankIoData(@Path("type") String id, @Path("page") int page, @Path("pre_page") int pre_page);

}
