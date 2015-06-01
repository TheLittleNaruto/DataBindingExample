package com.thelittlenaruto.databindingexample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.thelittlenaruto.databindingexample.R;
import com.thelittlenaruto.databindingexample.databinding.ActivityMainBinding;
import com.thelittlenaruto.databindingexample.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("First Name: Baby", "Last Name: Naruto");
        binding.setUser(user);
    }


}
