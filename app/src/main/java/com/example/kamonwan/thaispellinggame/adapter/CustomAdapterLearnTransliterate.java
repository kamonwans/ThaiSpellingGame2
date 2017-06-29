package com.example.kamonwan.thaispellinggame.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.model.TransliterateLearn;
import java.util.List;

public class CustomAdapterLearnTransliterate extends RecyclerView.Adapter<CustomAdapterLearnTransliterate.ViewHolder> {
   ViewHolder viewHolder;
    Context context;
    View view;
    private List<TransliterateLearn> transliterateLearnListList;

    public CustomAdapterLearnTransliterate(Context context, List<TransliterateLearn> transliterateLearnListList) {
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
    public CustomAdapterLearnTransliterate.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_learn, parent, false);
        viewHolder = new CustomAdapterLearnTransliterate.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapterLearnTransliterate.ViewHolder holder, int position) {
        holder.tvWordOne.setText(transliterateLearnListList.get(position).getWordOne());
        holder.tvWordTwo.setText(transliterateLearnListList.get(position).getWordTwo());
    }

    @Override
    public int getItemCount() {
        return transliterateLearnListList.size();
    }
}