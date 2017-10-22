package com.leaphawk.nestedpager;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager pager=(ViewPager) findViewById(R.id.pager);

        pager.setPageTransformer(false, new VerticalPageTransformer());
        pager.setAdapter(buildAdapter());
    }

    private PagerAdapter buildAdapter() {
        return(new ParentAdapter(this, this.getSupportFragmentManager()));
    }
}


