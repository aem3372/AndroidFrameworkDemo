package com.aemiot.demo.framework.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aemiot.demo.framework.R;
import com.aemiot.demo.framework.databinding.IndexItemBinding;

import java.util.ArrayList;

public class SimpleButtonAdapter extends RecyclerView.Adapter<SimpleButtonAdapter.ViewHolder>{

    ArrayList<Delegate> mDatas;

    public void setDatas(ArrayList<Delegate> datas) {
        mDatas = datas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.index_item, parent, false);
        ViewHolder holder = new ViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public interface Delegate {
        String getName();
        void execute(View view);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private IndexItemBinding mBinding;

        public ViewHolder(View itemView) {
            super(itemView);
            mBinding = IndexItemBinding.bind(itemView);
        }

        public void bind(Delegate data) {
            mBinding.setDelegate(data);
        }
    }
}
