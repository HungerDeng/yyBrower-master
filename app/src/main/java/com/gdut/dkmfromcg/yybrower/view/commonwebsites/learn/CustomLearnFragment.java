package com.gdut.dkmfromcg.yybrower.view.commonwebsites.learn;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gdut.dkmfromcg.commonlib.fragments.ProxyFragment;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.adapter.GankIoAdapter;
import com.gdut.dkmfromcg.yybrower.entities.GankIoDataEntity;
import com.gdut.dkmfromcg.yybrower.model.gankio.GankIoModel;
import com.gdut.dkmfromcg.yybrower.presenter.commonwebsites.learn.CustomLearnPresenterImpl;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomLearnFragment extends ProxyFragment implements ICustomLearnView {

    private static final String TAG = CustomLearnFragment.class.getName();

    RecyclerView mRecyclerView;
    String mLearnType = null;

    private GankIoModel mGankIoModel;
    private CustomLearnPresenterImpl mPresenter;

    public static CustomLearnFragment newInstance(String learnType) {
        CustomLearnFragment fragment = new CustomLearnFragment();
        Bundle args = new Bundle();
        args.putString(TAG, learnType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            mLearnType = bundle.getString(TAG);
        }
        if (mLearnType == null) {
            mLearnType = "all";
        }
    }

    @Override
    public Object setLayout() {
        return R.layout.fragment_recyclerview;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        mRecyclerView = rootView.findViewById(R.id.recycler_view);
        mGankIoModel=new GankIoModel(this);
        mPresenter=new CustomLearnPresenterImpl(this,mGankIoModel);
        mPresenter.initRecyclerView(mLearnType);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        mGankIoModel.detachLifecycleProvider();
        mPresenter.detachView();
    }


    @Override
    public void initRecyclerView(List<GankIoDataEntity.ResultBean> resultBeans) {
        final GankIoAdapter adapter=new GankIoAdapter(getContext(),resultBeans);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }
}
