package com.thelittlenaruto.databindingexample.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.thelittlenaruto.databindingexample.R;
import com.thelittlenaruto.databindingexample.adapter.RecyclerAdapter;
import com.thelittlenaruto.databindingexample.databinding.ActivityLauncherBinding;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLauncherBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_launcher);

    }

    public void onSimple(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onList(View view){
        startActivity(new Intent(this, ListActivity.class));
    }

    public void onRecycler(View view){
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }
}
