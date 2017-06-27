package com.example.kamonwan.thaispellinggame.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.activity.LearnRoyalActivity;
import com.example.kamonwan.thaispellinggame.model.RoyalLearn;

import java.util.List;

/**
 * Created by kamonwan on 6/26/2017.
 */

public class CustomAdapterLearnRoyal extends RecyclerView.Adapter<CustomAdapterLearnRoyal.ViewHolder> {
    Context context;
    List<String> tvWordOne;
    List<String> tvWordTwo;
    View view;
    ViewHolder viewHolder;
    private List<RoyalLearn> royalLearnList;

    public CustomAdapterLearnRoyal(Context context, List<RoyalLearn> royalLearnList) {
        this.context = context;
        this.royalLearnList= royalLearnList;


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
    public CustomAdapterLearnRoyal.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_learn_royal, parent, false);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapterLearnRoyal.ViewHolder holder, int position) {
        holder.tvWordOne.setText(royalLearnList.get(position).getWordOne());
        holder.tvWordTwo.setText(royalLearnList.get(position).getWordTwo());

    }

    @Override
    public int getItemCount() {
        return royalLearnList.size();
    }


}
