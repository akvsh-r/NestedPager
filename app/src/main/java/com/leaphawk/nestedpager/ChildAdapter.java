package com.leaphawk.nestedpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by ghgf on 10/21/2017.
 */

public class ChildAdapter extends FragmentPagerAdapter {
    Context ctxt=null;

    public ChildAdapter(Context ctxt, FragmentManager mgr) {
        super(mgr);
        this.ctxt=ctxt;
    }

    @Override
    public int getCount() {
        return(10);
    }

    @Override
    public Fragment getItem(int position) {
        Log.e("CHILD ADAPTER", "getItem: "+position );
        return(new ChildFragment());
    }

    @Override
    public String getPageTitle(int position) {
        return("title");
    }
}
