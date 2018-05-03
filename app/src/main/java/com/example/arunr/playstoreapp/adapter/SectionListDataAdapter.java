package com.example.arunr.playstoreapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arunr.playstoreapp.R;
import com.example.arunr.playstoreapp.model.SingleItemModel;

import java.util.ArrayList;

/**
 * Created by arun.r on 02-05-2018.
 */

public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder> {

    private ArrayList<SingleItemModel> itemsList;
    private Context context;

    public SectionListDataAdapter(Context context, ArrayList<SingleItemModel> itemsList) {
        this.itemsList = itemsList;
        this.context = context;
    }

    @NonNull
    @Override
    public SectionListDataAdapter.SingleItemRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_single_card, null);
        SingleItemRowHolder mh = new SingleItemRowHolder(view);
        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull SectionListDataAdapter.SingleItemRowHolder holder, int position) {
        SingleItemModel singleItem = itemsList.get(position);
        holder.tvTitle.setText(singleItem.getName());
    }

    @Override
    public int getItemCount() {
        return (itemsList != null ? itemsList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;
        protected ImageView itemImage;

        public SingleItemRowHolder(View view) {
            super(view);
             this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
             this.itemImage = (ImageView) view.findViewById(R.id.itemImage);

             view.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Toast.makeText(view.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show();
                 }
             });
        }
    }
}
