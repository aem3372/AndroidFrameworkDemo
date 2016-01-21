package com.aemiot.demo.framework;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_index);
    }

    public void onClickComponent(View view) {
        Intent intent = new Intent(this, ComponentActivity.class);
        startActivity(intent);
    }
}
