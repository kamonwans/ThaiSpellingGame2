package com.example.kamonwan.thaispellinggame;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kamonwan on 6/16/2017.
 */

public class CustomerAdapterTest extends RecyclerView.Adapter<CustomerAdapterTest.ViewHolder> {
    Context context;
    List<String> listTitleName;
    List<String> listrdOne;
    List<String> listrdTwo;
    List<String> listrdThere;
    List<String> listrdFour;
    View view;
    ViewHolder viewHolder;
    public CustomerAdapterTest(Context context, List<String> listTitleName,List<String> listrdOne,List<String> listrdTwo,
                               List<String> listrdThere,List<String> listrdFour) {
        this.context = context;
        this.listTitleName = listTitleName;
        this.listrdOne = listrdOne;
        this.listrdTwo = listrdTwo;
        this.listrdThere = listrdThere;
        this.listrdFour = listrdFour;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titileName;
        public RadioButton rdOne,rdTwo,rdThere,rdFour;

        public ViewHolder(View v) {
            super(v);
            titileName = (TextView) v.findViewById(R.id.TitleName);
            rdOne = (RadioButton) v.findViewById(R.id.rdOne);
            rdTwo = (RadioButton) v.findViewById(R.id.rdTwo);
            rdThere = (RadioButton) v.findViewById(R.id.rdThere);
            rdFour = (RadioButton) v.findViewById(R.id.rdFour);
        }
    }

    @Override
    public CustomerAdapterTest.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_test, parent, false);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titileName.setText(listTitleName.get(position));
        holder.rdOne.setText(listrdOne.get(position));
        holder.rdTwo.setText(listrdTwo.get(position));
        holder.rdThere.setText(listrdThere.get(position));
        holder.rdFour.setText(listrdFour.get(position));
    }

    @Override
    public int getItemCount() {
        return listTitleName.size();
    }

}
