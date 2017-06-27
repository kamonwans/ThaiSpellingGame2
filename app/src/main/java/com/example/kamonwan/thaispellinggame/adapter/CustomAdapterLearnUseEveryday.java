package com.example.kamonwan.thaispellinggame.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.model.UseLearn;

import java.util.List;

public class CustomAdapterLearnUseEveryday extends RecyclerView.Adapter<CustomAdapterLearnUseEveryday.ViewHolder> {
    ViewHolder viewHolder;
    Context context;
    View view;
    private List<UseLearn> useLearnList;


    public CustomAdapterLearnUseEveryday(Context context, List<UseLearn> useLearnList) {
        this.context = context;
        this.useLearnList = useLearnList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvWordOne, tvWordTwo;

        public ViewHolder(View v) {
            super(v);
            tvWordOne = (TextView) v.findViewById(R.id.tvWordOne);
            tvWordTwo = (TextView) v.findViewById(R.id.tvWordTwo);
        }
    }

    @Override
    public CustomAdapterLearnUseEveryday.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_learn, parent, false);
        viewHolder = new CustomAdapterLearnUseEveryday.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapterLearnUseEveryday.ViewHolder holder, int position) {
        holder.tvWordOne.setText(useLearnList.get(position).getWordOne());
        holder.tvWordTwo.setText(useLearnList.get(position).getWordTwo());

    }

    @Override
    public int getItemCount() {
        return useLearnList.size();
    }
}
