package com.gdut.dkmfromcg.yybrower.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.app.RvItemType;
import com.gdut.dkmfromcg.yybrower.entities.CommonWebsiteEntity;
import com.gdut.dkmfromcg.yybrower.view.commonwebsites.CommonWebsitesActivity;


import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/5.
 * function:
 */

public class CommonWebsiteAdapter extends BaseMultiItemQuickAdapter<CommonWebsiteEntity, BaseViewHolder> {

    private Context mContext;

    public CommonWebsiteAdapter(Context context, List<CommonWebsiteEntity> data) {
        super(data);
        this.mContext = context;
        addItemType(RvItemType.COMMON_WEBSITE, R.layout.item_common_website);
    }

    @Override
    protected void convert(BaseViewHolder helper, CommonWebsiteEntity item) {
        final int type = helper.getItemViewType();
        if (type == RvItemType.COMMON_WEBSITE) {
            final ImageView imageView = helper.getView(R.id.iv_common_website);
            final TextView textView = helper.getView(R.id.tv_common_website);
            imageView.setImageResource(item.getIvCommonWebsite());
            final String websiteType = item.getTvDescription();
            textView.setText(websiteType);
            helper.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CommonWebsitesActivity.startSelf(mContext, websiteType);
                }
            });
        }
    }

}
