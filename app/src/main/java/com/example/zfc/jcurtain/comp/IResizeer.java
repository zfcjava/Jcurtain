package com.example.zfc.jcurtain.comp;

import android.view.View;

/**
 * Created by zfc on 2018/4/25.
 */

public interface IResizeer<T extends View> {


    /**
     * 获得计算方式  1 像素； 2 权重
     * @return
     */
    int getComputeUnit();

    /**
     * 获取被选中时的宽度
     * @return
     */
    int getSelectWidth();

    /**
     * 获取被选中是的高度
     * @return
     */
    int getSelectHeight();


    /**
     * 获取没有被选中时的高度
     * @return
     */
    int getUnSelectWidht();

    /**
     * 获取没有被选中时的高度
     * @return
     */
    int getUnSelectHeight();

    /**
     * 获取需要的View
     */
    T getView();

}
