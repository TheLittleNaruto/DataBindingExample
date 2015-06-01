package com.thelittlenaruto.databindingexample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import com.thelittlenaruto.databindingexample.R;
import com.thelittlenaruto.databindingexample.adapter.ListAdapter;
import com.thelittlenaruto.databindingexample.databinding.ActivityListBinding;
import com.thelittlenaruto.databindingexample.databinding.ActivityMainBinding;
import com.thelittlenaruto.databindingexample.model.Person;
import com.thelittlenaruto.databindingexample.model.User;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list);
        ArrayList<Person> users = new ArrayList<>();
        users.add(new Person("Baby", "Naruto"));
        users.add(new Person("Baby1", "Naruto1"));
        users.add(new Person("Baby2", "Naruto2"));
        users.add(new Person("Baby3", "Naruto3"));
        users.add(new Person("Baby4", "Naruto4"));
        users.add(new Person("Baby5", "Naruto5"));
        users.add(new Person("Baby6", "Naruto6"));
        users.add(new Person("Baby7", "Naruto7"));
        users.add(new Person("Baby8", "Naruto8"));
        users.add(new Person("Baby9", "Naruto9"));

        ListAdapter adapter = new ListAdapter(this, users);
        binding.setAdapter(adapter);
    }


}
