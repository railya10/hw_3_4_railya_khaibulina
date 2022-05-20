package com.example.hw_3_4_railya_khaibulina.fragmentwithrecycler;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hw_3_4_railya_khaibulina.OnClickListenerData;
import com.example.hw_3_4_railya_khaibulina.R;
import com.example.hw_3_4_railya_khaibulina.secondActivity.SecondActivity;

import java.util.ArrayList;


public class FragmentTwo extends Fragment implements OnClickListenerData {
    private SecondAdapter adapter;
    private ArrayList<SecondModel> list;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        SecondAdapter adapter = new SecondAdapter(list, this);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new SecondModel("Blank Space", "Taylor Swift", 1, "3:22"));
        list.add(new SecondModel("Watch me", "Silento", 2, "5:36"));
        list.add(new SecondModel("Earned it", "The Weekend", 3, "4:51"));
        list.add(new SecondModel("The hills", "The Weekend", 4, "3:41"));
        list.add(new SecondModel("Writing's on the wall", "The Hills", 5, "5:33"));
        list.add(new SecondModel("Under pressure", "Another Michael", 6, "4:37"));
        list.add(new SecondModel("Ocean Drive", "Duke Dumont", 7, "3:26"));
        list.add(new SecondModel("Iron Sky", "Paolo Nutini", 8, "6:04"));
        list.add(new SecondModel("Castle In The Snow", "Kadebostany", 9, "3:14"));
        list.add(new SecondModel("Jain", "Makeba", 10, "4:17"));

    }

    @Override
    public void onClick(SecondModel secondModel) {
        Intent intent = new Intent(requireActivity(), SecondActivity.class);
        intent.putExtra("text", secondModel.getTextView());
        startActivity(intent);
        Toast.makeText(getActivity(), "This is my Toast message!",
                Toast.LENGTH_LONG).show();
    }
}