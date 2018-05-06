package com.gdut.dkmfromcg.yybrower.view.commonwebsites.learn;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.gdut.dkmfromcg.commonlib.widget.tabsegment.QMUITabSegment;
import com.gdut.dkmfromcg.commonlib.fragments.ProxyFragment;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.model.gankio.IGankIoModel;

import java.util.ArrayList;
import java.util.List;


public class LearnFragment extends ProxyFragment {

    private static final String TAG = LearnFragment.class.getName();

    private QMUITabSegment tabSegment = null;
    private ViewPager viewPager = null;
    private final String[] tabs = {IGankIoModel.sAndroid,IGankIoModel.sIos,IGankIoModel.sWebpage,IGankIoModel.sApp,IGankIoModel.sRecommend};


    @Override
    public Object setLayout() {
        return R.layout.fragment_learn;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        tabSegment = rootView.findViewById(R.id.tab_segment);
        viewPager = rootView.findViewById(R.id.vp_learn);
        initViewPager();
        initTab();
    }

    private void initTab() {
        tabSegment.setHasIndicator(true);
        tabSegment.setIndicatorPosition(false);
        for (String s : tabs) {
            tabSegment.addTab(new QMUITabSegment.Tab(s));
        }
        tabSegment.setupWithViewPager(viewPager);
    }

    private void initViewPager() {
        final List<Fragment> fragments = new ArrayList<>();
        for (String tab : tabs) {
            Fragment fragment = CustomLearnFragment.newInstance(tab);
            fragments.add(fragment);
        }
        final LearnFragmentAdapter adapter = new LearnFragmentAdapter(fragments,getChildFragmentManager());
        viewPager.setAdapter(adapter);
    }

    private class LearnFragmentAdapter extends FragmentPagerAdapter {

        private List<Fragment> mFragments;

        public LearnFragmentAdapter(List<Fragment> fragments, FragmentManager fm) {
            super(fm);
            this.mFragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments != null ? mFragments.size() : 0;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }
    }


}
