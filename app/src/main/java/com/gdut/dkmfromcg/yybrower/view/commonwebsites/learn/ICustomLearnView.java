package com.gdut.dkmfromcg.yybrower.view.commonwebsites.learn;

import com.gdut.dkmfromcg.commonlib.mvp.IView;
import com.gdut.dkmfromcg.yybrower.entities.GankIoDataEntity;

import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public interface ICustomLearnView extends IView {
    void initRecyclerView(List<GankIoDataEntity.ResultBean> resultBeans);
}
