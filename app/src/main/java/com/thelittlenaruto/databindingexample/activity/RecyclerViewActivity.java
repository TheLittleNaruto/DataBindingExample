package com.thelittlenaruto.databindingexample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.thelittlenaruto.databindingexample.R;
import com.thelittlenaruto.databindingexample.adapter.RecyclerAdapter;
import com.thelittlenaruto.databindingexample.databinding.ActivityRecyclerViewBinding;
import com.thelittlenaruto.databindingexample.model.Employee;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);

        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            employees.add(new Employee("John", "Smith"));

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(this, employees);
        binding.setAdapter(adapter);
    }


}
