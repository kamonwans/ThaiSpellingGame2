package com.example.kamonwan.thaispellinggame.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.model.TransliterateLearn;
import com.example.kamonwan.thaispellinggame.model.UseLearn;

import java.util.List;

/**
 * Created by kamonwan on 6/27/2017.
 */

public class CustomAdapterLearnTrasliterate extends RecyclerView.Adapter<CustomAdapterLearnTrasliterate.ViewHolder> {
   ViewHolder viewHolder;
    Context context;
    View view;
    private List<TransliterateLearn> transliterateLearnListList;

    public CustomAdapterLearnTrasliterate(Context context, List<TransliterateLearn> transliterateLearnListList) {
        this.context = context;
        this.transliterateLearnListList = transliterateLearnListList;
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
    public CustomAdapterLearnTrasliterate.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_learn, parent, false);
        viewHolder = new CustomAdapterLearnTrasliterate.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapterLearnTrasliterate.ViewHolder holder, int position) {
        holder.tvWordOne.setText(transliterateLearnListList.get(position).getWordOne());
        holder.tvWordTwo.setText(transliterateLearnListList.get(position).getWordTwo());
    }

    @Override
    public int getItemCount() {
        return transliterateLearnListList.size();
    }
}