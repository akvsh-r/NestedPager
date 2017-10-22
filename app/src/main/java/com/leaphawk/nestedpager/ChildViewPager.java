package com.leaphawk.nestedpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * Created by ghgf on 10/21/2017.
 */

public class ChildViewPager extends ViewPager {

    private int mCurrentPagePosition = 0;

    public ChildViewPager(Context context) {
        super(context);

    }

    public ChildViewPager(Context context, AttributeSet attrs) {

        super(context, attrs);

    }

 /*   @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        if(v != this && v instanceof ViewPager) {
            return true;
        }
        return super.canScroll(v, checkV, dx, x, y);
    }*/

}
