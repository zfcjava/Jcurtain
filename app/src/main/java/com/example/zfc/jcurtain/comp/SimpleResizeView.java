package com.example.zfc.jcurtain.comp;

import android.view.View;

/**
 * Created by zfc on 2018/4/25.
 */

public class SimpleResizeView implements IResizeer {

    public View view;

    @Override
    public int getComputeUnit() {
        return 1;
    }

    @Override
    public int getSelectWidth() {
        return 200;
    }

    @Override
    public int getSelectHeight() {
        return 200;
    }

    @Override
    public int getUnSelectWidht() {
        return 100;
    }

    @Override
    public int getUnSelectHeight() {
        return 150;
    }

    @Override
    public View getView() {
        return view;
    }

    public SimpleResizeView(View view) {
        this.view = view;
    }
}
