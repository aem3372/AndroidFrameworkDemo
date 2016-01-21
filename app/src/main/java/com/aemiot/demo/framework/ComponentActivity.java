package com.aemiot.demo.framework;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aemiot.demo.framework.component.FiveNestedFrameActivity;
import com.aemiot.demo.framework.component.FiveNestedLinearActivity;
import com.aemiot.demo.framework.component.FiveNestedLinearWithWeightActivity;
import com.aemiot.demo.framework.component.FiveNestedRelativeActivity;
import com.aemiot.demo.framework.component.WidgetService;

public class ComponentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_component);
    }

    public void onClickWidgetService(View view) {
        Intent intent = new Intent(this, WidgetService.class);
        startService(intent);
    }

    public void onClickFiveNestedFrame(View view) {
        Intent intent = new Intent(this, FiveNestedFrameActivity.class);
        startActivity(intent);
    }

    public void onClickFiveNestedRelative(View view) {
        Intent intent = new Intent(this, FiveNestedRelativeActivity.class);
        startActivity(intent);
    }

    public void onClickFiveNestedLinear(View view) {
        Intent intent = new Intent(this, FiveNestedLinearActivity.class);
        startActivity(intent);
    }

    public void onClickFiveNestedLinearWithWeight(View view) {
        Intent intent = new Intent(this, FiveNestedLinearWithWeightActivity.class);
        startActivity(intent);
    }
}
