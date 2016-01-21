package com.aemiot.demo.framework.component;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aemiot.demo.framework.R;

public class FiveNestedFrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_five_nested_frame);
    }

    public void requestLayout(View view) {
        view.requestLayout();
    }
}
