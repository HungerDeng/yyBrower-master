package com.gdut.dkmfromcg.yybrower.view.commonwebsites.kaiyan;

import com.gdut.dkmfromcg.commonlib.mvp.IView;
import com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo.KaiYanEntity;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public interface IKaiYanView extends IView {
    void initRecyclerView(KaiYanEntity kaiYanEntity);
}
