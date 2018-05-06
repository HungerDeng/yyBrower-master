package com.gdut.dkmfromcg.yybrower.view.main;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.gdut.dkmfromcg.commonlib.fragments.BaseDialogFragment;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.R2;
import com.gdut.dkmfromcg.yybrower.view.settings.SettingActivity;
import com.trello.rxlifecycle2.components.support.RxAppCompatDialogFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by dkmFromCG on 2018/4/10.
 * function:
 */

public class BottomSettingDialogFragment extends BaseDialogFragment {

    private static final String TAG = BottomSettingDialogFragment.class.getName();

    @BindView(R2.id.tv_day_night_mode)
    AppCompatTextView tvDayNightMode;
    @BindView(R2.id.iv_exit)
    ImageView ivExit;


    public static BottomSettingDialogFragment getInstance(Context context, FragmentManager fm) {
        Fragment fragment = fm.findFragmentByTag(TAG);
        if (fragment == null) {
            fragment = Fragment.instantiate(context, TAG);
            BottomSettingDialogFragment dialogFragment = (BottomSettingDialogFragment) fragment;
            dialogFragment.setStyle(RxAppCompatDialogFragment.STYLE_NO_TITLE, 0);
            return dialogFragment;
        } else {
            return (BottomSettingDialogFragment) fragment;
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog=new BottomSheetDialog(mContext, getTheme());
        WindowManager.LayoutParams lp=dialog.getWindow().getAttributes();
        lp.horizontalMargin=5;
        lp.verticalMargin=5;
        return dialog;
    }


    @Override
    public Object setLayout() {
        return R.layout.fragment_bottom_setting_dialog;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }


    @OnClick(R2.id.iv_sign_up)
    public void onIvSignUpClicked() {
    }

    @OnClick(R2.id.tv_sign_up)
    public void onTvSignUpClicked() {
    }

    @OnClick(R2.id.img_btn_share)
    public void onImgBtnShareClicked() {
    }

    @OnClick(R2.id.iv_bookmark)
    public void onIvBookmarkClicked() {
    }

    @OnClick(R2.id.iv_download)
    public void onIvDownloadClicked() {
    }

    @OnClick(R2.id.iv_more)
    public void onIvMoreClicked() {
        SettingActivity.startSelf(getProxyActivity());
        this.dismiss();
    }

    @OnClick(R2.id.iv_no_history)
    public void onIvNoHistoryClicked() {
    }

    @OnClick(R2.id.iv_day_night_mode)
    public void onIvDayNightModeClicked() {
    }

    @OnClick(R2.id.iv_exit)
    public void onIvExitClicked() {

    }
}
