package com.example.zfc.jcurtain.comp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zfc on 2018/4/25.
 */

public class HoritionalView extends ViewGroup {

    List<IResizeer> childs = new ArrayList<>();

    public HoritionalView(Context context) {
        this(context, null);
    }

    public HoritionalView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public HoritionalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        //1.0 默认从最简单开始
        doSimpleHoriLayout();
    }

    int selectId;

    private void doSimpleHoriLayout() {
        int left = 0;
        for (int index = 0; index < childs.size(); index++) {
            IResizeer tmp = childs.get(index);
            if (tmp.getView().getId() == selectId) {
                tmp.getView().layout(left, 0, left += tmp.getSelectWidth(), tmp.getSelectHeight());
            } else {
                tmp.getView().layout(left, 0, left += tmp.getUnSelectWidht(), tmp.getUnSelectHeight());
            }
        }
    }




    @Override
    public void requestLayout() {
        super.requestLayout();
    }

    public void clear(){
        removeAllViews();
        childs.clear();
    }

    public void addView(IResizeer childView){
        childs.add(childView);
    }


    public void setSelectId(int selectId) {
        this.selectId = selectId;
        requestLayout();
    }
}
