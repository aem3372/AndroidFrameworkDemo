package com.aemiot.demo.framework.component;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aemiot.demo.framework.R;

public class FiveNestedLinearWithWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_five_nested_linear_with_weight);
    }

    public void requestLayout(View view) {
        view.requestLayout();
    }
}
