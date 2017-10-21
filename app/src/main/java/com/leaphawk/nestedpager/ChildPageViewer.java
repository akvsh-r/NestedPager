package com.leaphawk.nestedpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

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

    private MotionEvent swapTouchEvent(MotionEvent event) {
        float width = getWidth();
        float height = getHeight();

        float swappedX = (event.getY() / height) * width;
        float swappedY = (event.getX() / width) * height;

        event.setLocation(swappedX, swappedY);

        return event;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean intercept = super.onInterceptTouchEvent(swapTouchEvent(event));
        //If not intercept, touch event should not be swapped.
        swapTouchEvent(event);
        return intercept;
    }

    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        if(v != this && v instanceof ViewPager) {
            return true;
        }
        return super.canScroll(v, checkV, dx, x, y);
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        return false;
    }
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return super.onTouchEvent(swapTouchEvent(ev));
    }

}
