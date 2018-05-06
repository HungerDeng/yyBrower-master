package com.gdut.dkmfromcg.yybrower.app;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by dkmFromCG on 2018/1/20.
 * function:
 */


public abstract class BaseActivity extends AppCompatActivity {

    public BaseActivity mContext;

    abstract protected int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext=this;
        ActivityCollector.addActivity(this);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

}
