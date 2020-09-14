package com.mehmetaltindal.startrekbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ImageView imageView = findViewById(R.id.imageView);
        TextView nameText = findViewById(R.id.nameText);
        TextView jobText = findViewById(R.id.jobText);

        Intent intent = getIntent();
        USSEnterpriseCrew selectedMember = (USSEnterpriseCrew) intent.getSerializableExtra("selectedMember");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),selectedMember.getPictureId());
        imageView.setImageBitmap(bitmap);

        nameText.setText(selectedMember.getName());
        jobText.setText(selectedMember.getJob());


        /*Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.picard);
        imageView.setImageBitmap(bitmap);*/
    }
}