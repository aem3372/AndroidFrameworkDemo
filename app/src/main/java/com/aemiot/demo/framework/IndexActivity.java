package com.aemiot.demo.framework;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.aemiot.demo.framework.adapter.SimpleButtonAdapter;
import com.aemiot.demo.framework.databinding.ActivityIndexBinding;

import java.util.ArrayList;

public class IndexActivity extends AppCompatActivity {

    ArrayList<SimpleButtonAdapter.Delegate> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIndexBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_index);

        datas = new ArrayList<>();
        datas.add(new ServiceDelegate(WidgetService.class));

        SimpleButtonAdapter adapter = new SimpleButtonAdapter();
        adapter.setDatas(datas);
        binding.setAdapter(adapter);
        binding.setLayoutManager(new LinearLayoutManager(this));
    }

    private static class ActivityDelegate implements SimpleButtonAdapter.Delegate{
        private Class<? extends Activity> mClazz;

        public ActivityDelegate(Class<? extends Activity> clz) {
            mClazz = clz;
        }

        @Override
        public String getName() {
            return mClazz.getSimpleName();
        }

        @Override
        public void execute(View view) {
            Context context = view.getContext();
            context.startActivity(new Intent(context, mClazz));
        }
    }

    private static class ServiceDelegate implements SimpleButtonAdapter.Delegate{
        private Class<? extends Service> mClazz;

        public ServiceDelegate(Class<? extends Service> clz) {
            mClazz = clz;
        }

        @Override
        public String getName() {
            return mClazz.getSimpleName();
        }

        @Override
        public void execute(View view) {
            Context context = view.getContext();
            context.startService(new Intent(context, mClazz));
        }
    }
}
