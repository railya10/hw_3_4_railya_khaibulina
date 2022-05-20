package com.example.hw_3_4_railya_khaibulina.fragmentwithrecycler;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_4_railya_khaibulina.OnClickListenerData;
import com.example.hw_3_4_railya_khaibulina.R;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondViewHolder> {
    ArrayList<SecondModel> list;
    private OnClickListenerData listenerData;


    public SecondAdapter(ArrayList<SecondModel> list, OnClickListenerData onClickListenerData) {
        this.list = list;
        this.listenerData = onClickListenerData;
    }

    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(list.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listenerData.onClick(list.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class SecondViewHolder extends RecyclerView.ViewHolder {
        private TextView singer, textView, time, number;
        public SecondViewHolder(@NonNull View itemView) {
            super(itemView);
            singer = itemView.findViewById(R.id.text2);
            textView = itemView.findViewById(R.id.text1);
            time = itemView.findViewById(R.id.time);
            number = itemView.findViewById(R.id.number);


        }

        public void bind(SecondModel secondModel) {
            singer.setText(secondModel.getSinger());
            textView.setText(secondModel.getTextView());
            time.setText(secondModel.getTime());
            number.setText(String.valueOf(secondModel.getNumber()));
        }
    }
}
