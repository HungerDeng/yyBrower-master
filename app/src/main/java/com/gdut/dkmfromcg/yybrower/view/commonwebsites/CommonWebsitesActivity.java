package com.gdut.dkmfromcg.yybrower.view.commonwebsites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.gdut.dkmfromcg.commonlib.activities.ProxyActivity;
import com.gdut.dkmfromcg.commonlib.fragments.ProxyFragment;
import com.gdut.dkmfromcg.yybrower.model.commonwebsites.CommonWebsitesType;
import com.gdut.dkmfromcg.yybrower.view.commonwebsites.kaiyan.KaiYanFragment;
import com.gdut.dkmfromcg.yybrower.view.commonwebsites.learn.LearnFragment;

public class CommonWebsitesActivity extends ProxyActivity {

    private static final String TAG = CommonWebsitesActivity.class.getName();
    private String mFragmentTag = null;

    public static void startSelf(Context context, String fragmentTag) {
        final Intent intent = new Intent(context, CommonWebsitesActivity.class);
        intent.putExtra(TAG, fragmentTag);
        context.startActivity(intent);
    }

    @Override
    public ProxyFragment setRootFragment() {
        if (mFragmentTag != null) {
            if (CommonWebsitesType.LEARN.equals(mFragmentTag)) {
                return new LearnFragment();
            } else if (CommonWebsitesType.KAI_YAN.equals(mFragmentTag)) {
                return new KaiYanFragment();
            } else if (CommonWebsitesType.WEATHER.equals(mFragmentTag)) {

            } else if (CommonWebsitesType.BASKETBALL.equals(mFragmentTag)) {

            }
        }
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = getIntent();
        mFragmentTag = intent.getStringExtra(TAG);
        super.onCreate(savedInstanceState);
    }

}
