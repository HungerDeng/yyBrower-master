package com.gdut.dkmfromcg.yybrower.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.app.RvItemType;
import com.gdut.dkmfromcg.yybrower.entities.GankIoDataEntity;

import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class GankIoAdapter extends BaseMultiItemQuickAdapter<GankIoDataEntity.ResultBean, BaseViewHolder> {

    private Context mContext;
    //设置图片加载策略
    private static final RequestOptions RECYCLER_OPTIONS =
            new RequestOptions()
                    .centerCrop()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .dontAnimate();

    public GankIoAdapter(Context context, List<GankIoDataEntity.ResultBean> data) {
        super(data);
        this.mContext = context;
        addItemType(RvItemType.GANK_IO, R.layout.item_gank_io);
    }

    @Override
    protected void convert(BaseViewHolder helper, final GankIoDataEntity.ResultBean bean) {
        final int type = helper.getItemViewType();
        if (type == RvItemType.GANK_IO) {
            final TextView newsContent = helper.getView(R.id.tv_news_content);
            final ImageView newsPic = helper.getView(R.id.iv_news_pic);
            final TextView newsAuthor = helper.getView(R.id.tv_news_who);
            final TextView newsType = helper.getView(R.id.tv_content_type);
            final TextView newsDate = helper.getView(R.id.tv_news_time);

            newsContent.setText(bean.getDesc());
            newsAuthor.setText(bean.getWho());
            newsType.setText(bean.getType());
            newsDate.setText(bean.getPublishedAt());
            if (bean.getImages() != null && bean.getImages().size() > 0) {
                final String imgUrl = bean.getImages().get(0);
                Glide.with(mContext)
                        .load(imgUrl)
                        .apply(RECYCLER_OPTIONS)
                        .into(newsPic);
            }
            helper.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, bean.getUrl(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
