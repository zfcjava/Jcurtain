package com.example.zfc.jcurtain;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.zfc.jcurtain.comp.HoritionalView;
import com.example.zfc.jcurtain.comp.IResizeer;
import com.example.zfc.jcurtain.comp.SimpleResizeView;

public class MainActivity extends AppCompatActivity {

    private HoritionalView hsv_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        hsv_container = findViewById(R.id.hsv_container);
        hsv_container.addView(new SimpleResizeView(setId(new TextView(this),1)));
        hsv_container.addView(new SimpleResizeView(setId(new TextView(this),2)));
        hsv_container.addView(new SimpleResizeView(setId(new TextView(this),3)));
        hsv_container.requestLayout();
    }

    private View setId(TextView textView, int i) {
        textView.setId(i);
        switch (i) {
            case 1:
                textView.setBackgroundColor(Color.BLACK);
                break;
            case 2:
                textView.setBackgroundColor(Color.RED);
                break;
            case 3:
                textView.setBackgroundColor(Color.BLUE);
                break;
        }
        textView.setOnClickListener(onClickListener);
        return textView;
    }


    public View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            hsv_container.setSelectId(view.getId());
        }
    };
}
