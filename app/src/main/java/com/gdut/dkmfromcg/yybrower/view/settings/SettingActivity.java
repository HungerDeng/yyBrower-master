package com.gdut.dkmfromcg.yybrower.view.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

import com.gdut.dkmfromcg.commonlib.widget.grouplist.QMUICommonListItemView;
import com.gdut.dkmfromcg.commonlib.widget.grouplist.QMUIGroupListView;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.R2;
import com.gdut.dkmfromcg.yybrower.app.BaseActivity;

import butterknife.BindView;


public class SettingActivity extends BaseActivity implements ISettingView {

    @BindView(R2.id.groupListView)
    QMUIGroupListView mGroupListView;

    public static void startSelf(Context tx) {
        tx.startActivity(new Intent(tx, SettingActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initGroupListView();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_setting;
    }

    private void initGroupListView() {
        final int TAG_BACKGROUND = 0;
        final int TAG_TEXT_SIZE = 1;
        final int TAG_SEARCH_ENG = 2;
        final int TAG_CLEAR_CACHE = 3;
        final int TAG_USER_CALLBACK = 4;
        final int TAG_SOFTWARE_INFO = 5;

        final View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = (int) v.getTag();
                switch (tag) {
                    case TAG_BACKGROUND:

                        break;
                    case TAG_TEXT_SIZE:

                        break;
                    case TAG_SEARCH_ENG:

                        break;
                    case TAG_CLEAR_CACHE:

                        break;
                    case TAG_USER_CALLBACK:

                        break;
                    case TAG_SOFTWARE_INFO:

                        break;
                }
            }
        };


        QMUICommonListItemView itemView = new QMUICommonListItemView(mContext);
        itemView.setText("shakjsas");
        itemView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 100));
        itemView.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        itemView.setTag(TAG_BACKGROUND);


        QMUICommonListItemView background = new QMUICommonListItemView.Builder(mContext)
                .setText("背景设置")
                .setType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON)
                .setTag(TAG_BACKGROUND)
                .build();

        QMUICommonListItemView textSize = new QMUICommonListItemView.Builder(mContext)
                .setText("字体大小")
                .setDetailText("常规")
                .setTag(TAG_TEXT_SIZE)
                .build();

        QMUICommonListItemView searchEng = new QMUICommonListItemView.Builder(mContext)
                .setText("搜索引擎")
                .setDetailText("百度")
                .setTag(TAG_SEARCH_ENG)
                .build();

        QMUICommonListItemView cleverNoPic = new QMUICommonListItemView.Builder(mContext)
                .setText("智能无图")
                .setType(QMUICommonListItemView.ACCESSORY_TYPE_SWITCH)
                .build();
        cleverNoPic.getSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        QMUICommonListItemView yunSpeedUp = new QMUICommonListItemView.Builder(mContext)
                .setText("云端加速")
                .setType(QMUICommonListItemView.ACCESSORY_TYPE_SWITCH)
                .build();
        yunSpeedUp.getSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        QMUICommonListItemView clearCache = new QMUICommonListItemView.Builder(mContext)
                .setText("清除缓存")
                .setType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON)
                .setTag(TAG_CLEAR_CACHE)
                .build();

        QMUICommonListItemView userCallback = new QMUICommonListItemView.Builder(mContext)
                .setText("用户反馈")
                .setType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON)
                .setTag(TAG_USER_CALLBACK)
                .build();

        QMUICommonListItemView softWareInfo = new QMUICommonListItemView.Builder(mContext)
                .setText("软件信息")
                .setType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON)
                .setTag(TAG_SOFTWARE_INFO)
                .build();

        QMUIGroupListView.newSection(mContext)
                .setTitle("常规")
                .addItemView(background, onClickListener)
                .addItemView(textSize, onClickListener)
                .addItemView(searchEng, onClickListener)
                .addItemView(cleverNoPic, null)
                .addItemView(yunSpeedUp, null)
                .addTo(mGroupListView);

        QMUIGroupListView.newSection(mContext)
                .setTitle("更多")
                .addItemView(clearCache, onClickListener)
                .addItemView(userCallback, onClickListener)
                .addItemView(softWareInfo, onClickListener)
                .addTo(mGroupListView);
    }
}
