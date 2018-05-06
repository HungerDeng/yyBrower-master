package com.gdut.dkmfromcg.yybrower.view.main;

import com.gdut.dkmfromcg.commonlib.mvp.IView;
import com.gdut.dkmfromcg.yybrower.entities.CommonWebsiteEntity;


import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/5.
 * function:
 */

public interface IHomePageView extends IView {

    void initRecv(List<CommonWebsiteEntity> entities);

    void toast(String s);
}
