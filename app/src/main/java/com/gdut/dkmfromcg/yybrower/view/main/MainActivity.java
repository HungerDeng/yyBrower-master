package com.gdut.dkmfromcg.yybrower.view.main;

import com.gdut.dkmfromcg.commonlib.activities.ProxyActivity;
import com.gdut.dkmfromcg.commonlib.fragments.ProxyFragment;


public class MainActivity extends ProxyActivity {

    @Override
    public ProxyFragment setRootFragment() {
        return new HomePageFragment();
    }

}
