package com.leaphawk.nestedpager;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by ghgf on 10/21/2017.
 */

public class VerticalPageTransformer  implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View view, float position) {
        float alpha = 0;
        if (0 <= position && position <= 1) {
            alpha = 1 - position;
        } else if (-1 < position && position < 0) {
            alpha = position + 1;
        }
        view.setAlpha(alpha);
        view.setTranslationX(view.getWidth() * -position);
        float yPosition = position * view.getHeight();
        view.setTranslationY(yPosition);
    }
}