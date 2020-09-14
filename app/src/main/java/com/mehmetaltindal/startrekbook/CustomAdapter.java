package com.mehmetaltindal.startrekbook;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<USSEnterpriseCrew> {

    private ArrayList<USSEnterpriseCrew> enterprise ;
    private Activity context;

    public  CustomAdapter(ArrayList<USSEnterpriseCrew> enterprise, Activity context){
        super(context,R.layout.custom_view,enterprise);
        this.enterprise = enterprise;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater =  context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view,null,true);

        TextView nameView = customView.findViewById(R.id.customTextView);
        nameView.setText(enterprise.get(position).getName());
        return customView;
    }
}
