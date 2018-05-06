package com.gdut.dkmfromcg.yybrower.text;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;

import com.gdut.dkmfromcg.commonlib.widget.PullSpringBackView;
import com.gdut.dkmfromcg.brower_ui.videoview.CustomVideoView;
import com.gdut.dkmfromcg.commonlib.fragments.BaseDialogFragment;
import com.gdut.dkmfromcg.yybrower.R;
import com.trello.rxlifecycle2.components.support.RxAppCompatDialogFragment;

/**
 * Created by dkmFromCG on 2018/4/11.
 * function:
 */

public class SpringBackFragment extends BaseDialogFragment {

    private static final String TAG = SpringBackFragment.class.getName();

    public static SpringBackFragment getInstance(Context context, FragmentManager fm) {
        Fragment fragment = fm.findFragmentByTag(TAG);
        if (fragment == null) {
            fragment = Fragment.instantiate(context, TAG);
            SpringBackFragment dialogFragment = (SpringBackFragment) fragment;
            dialogFragment.setStyle(RxAppCompatDialogFragment.STYLE_NO_TITLE, 0);
            return dialogFragment;
        } else {
            return (SpringBackFragment) fragment;
        }
    }

    @Override
    public Object setLayout() {
        return R.layout.fargment_spring_back;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        PullSpringBackView springBackView=findViewById(R.id.spring_back_fl);
        if (springBackView!=null){
            springBackView.bindToDialog(getDialog());
        }
        RelativeLayout layout=rootView.findViewById(R.id.layout);
        if (layout!=null){
            CustomVideoView customVideoView=new CustomVideoView(getContext(),layout);
            customVideoView.setDataSource("http://ali.cdn.kaiyanapp.com/1524279875998_e44783b0.mp4?" +
                    "auth_key=1524319507-0-0-17f53cbc5668f55e87437d0852e4422e");
            layout.addView(customVideoView);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        final Dialog dialog=getDialog();
        final Window window = dialog.getWindow();
        assert window != null;
        window.setGravity(Gravity.BOTTOM);
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        window.setWindowAnimations(R.style.animate_dialog);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);
    }

}
