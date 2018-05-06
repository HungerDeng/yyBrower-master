package com.gdut.dkmfromcg.yybrower.view.main;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gdut.dkmfromcg.commonlib.widget.pullextend.ExtendListHeader;
import com.gdut.dkmfromcg.commonlib.widget.pullextend.PullExtendLayout;
import com.gdut.dkmfromcg.commonlib.fragments.ProxyFragment;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.R2;
import com.gdut.dkmfromcg.yybrower.adapter.CommonWebsiteAdapter;
import com.gdut.dkmfromcg.yybrower.entities.CommonWebsiteEntity;
import com.gdut.dkmfromcg.yybrower.model.commonwebsites.CommonWebsiteModel;
import com.gdut.dkmfromcg.yybrower.presenter.main.HomePagePresenterImpl;
import com.gdut.dkmfromcg.yybrower.text.SpringBackFragment;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;


public class HomePageFragment extends ProxyFragment implements IHomePageView {

    private HomePagePresenterImpl mPresenter = null;
    private CommonWebsiteModel model = null;

    @BindView(R2.id.extend_list_head)
    ExtendListHeader extendListHead;
    @BindView(R2.id.url_edit)
    View urlEdit;
    @BindView(R2.id.scan)
    ImageView scan;
    @BindView(R2.id.ly_pull_extend)
    PullExtendLayout lyPullExtend;


    private RecyclerView headerRv = null;
    private CommonWebsiteAdapter adapter = null;

    @Override
    public Object setLayout() {
        return R.layout.fragment_home_page;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        model = new CommonWebsiteModel(this);
        mPresenter = new HomePagePresenterImpl(this, model);
        mPresenter.getCommonWebsites();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        model.detachLifecycleProvider();
        mPresenter.detachView();
    }

    @OnClick(R2.id.url_edit)
    public void onUrlEditClicked() {
    }

    @OnClick(R2.id.scan)
    public void onScanClicked() {
    }

    @OnClick(R2.id.toLeft)
    public void onIvToLeftClicked() {
    }

    @OnClick(R2.id.toRight)
    public void onIvToRightClicked() {
    }

    @OnClick(R2.id.home)
    public void onIvHomeClicked() {

    }

    @OnClick(R2.id.pageNum)
    public void onIvPageNumClicked() {
        SpringBackFragment.getInstance(getContext(), getChildFragmentManager())
                .show(getChildFragmentManager(), SpringBackFragment.class.getName());
    }

    @OnClick(R2.id.more)
    public void onIvMoreClicked() {
        BottomSettingDialogFragment.getInstance(getContext(), getChildFragmentManager())
                .show(getChildFragmentManager(), BottomSettingDialogFragment.class.getName());
    }

    @Override
    public void initRecv(final List<CommonWebsiteEntity> entities) {
        headerRv = extendListHead.getRecyclerView();
        headerRv.setLayoutManager(
                new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        adapter = new CommonWebsiteAdapter(getContext(), entities);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                CommonWebsiteEntity entity = entities.get(position);

            }
        });
        headerRv.setAdapter(adapter);
    }

    @Override
    public void toast(String s) {
        Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
    }
}
