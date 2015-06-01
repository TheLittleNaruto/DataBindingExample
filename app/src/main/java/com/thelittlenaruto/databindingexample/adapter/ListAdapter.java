package com.thelittlenaruto.databindingexample.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.thelittlenaruto.databindingexample.R;
import com.thelittlenaruto.databindingexample.databinding.ListItemBinding;
import com.thelittlenaruto.databindingexample.model.Person;
import java.util.List;

/**
 * Created by Gaurav on 6/1/2015.
 */
public class ListAdapter extends ArrayAdapter<Person> {

    private Context context;
    private List<com.thelittlenaruto.databindingexample.model.Person> users;

    public ListAdapter(Context context, List<Person> users){
        super(context, android.R.layout.simple_dropdown_item_1line, users);
        this.context = context;
        this.users = users;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.list_item, parent, false);
        Person person = users.get(position);
        binding.setPerson(person);
        return binding.getRoot();
    }
}
