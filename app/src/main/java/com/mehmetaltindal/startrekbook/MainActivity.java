package com.mehmetaltindal.startrekbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        USSEnterpriseCrew picard = new USSEnterpriseCrew("Jean Luc Picard","Captain of USS Enterprise",R.drawable.picard);
        USSEnterpriseCrew riker = new USSEnterpriseCrew("Riker","Lieutenant",R.drawable.riker);
        USSEnterpriseCrew data = new USSEnterpriseCrew("Data","Lieutenant",R.drawable.data);
        USSEnterpriseCrew troi = new USSEnterpriseCrew("Troi","Counselor",R.drawable.troi);

        final ArrayList<USSEnterpriseCrew> enterpriseList = new ArrayList<>();
        enterpriseList.add(picard);
        enterpriseList.add(riker);
        enterpriseList.add(data);
        enterpriseList.add(troi);

       CustomAdapter customAdapter = new CustomAdapter(enterpriseList,MainActivity.this);
       listView.setAdapter(customAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
               intent.putExtra("selectedMember",enterpriseList.get(i));
               startActivity(intent);
           }
       });

    }
}