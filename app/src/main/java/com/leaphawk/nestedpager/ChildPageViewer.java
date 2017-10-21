package com.leaphawk.nestedpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * Created by ghgf on 10/21/2017.
 */

public class ChildPageViewer extends ViewPager {

    private int mCurrentPagePosition = 0;

    public ChildPageViewer(Context context) {
        super(context);
    }

    public ChildPageViewer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


}
