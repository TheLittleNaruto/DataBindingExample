package com.thelittlenaruto.databindingexample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thelittlenaruto.databindingexample.R;
import com.thelittlenaruto.databindingexample.adapter.ListAdapter;
import com.thelittlenaruto.databindingexample.databinding.ActivityListBinding;
import com.thelittlenaruto.databindingexample.model.Person;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list);
        ArrayList<Person> users = new ArrayList<>();

        for (int i = 0; i <= 20; i++)
            users.add(new Person("Baby", "Naruto"));

        ListAdapter adapter = new ListAdapter(this, users);
        binding.setAdapter(adapter);
    }


}
