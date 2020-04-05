package com.wiates.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {

    ImageView profileImage;
    TextView name,mobno,city;
    Button back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileImage = findViewById(R.id.profileImage);
        name = findViewById(R.id.name);
        mobno = findViewById(R.id.mobno);
        city = findViewById(R.id.city);

        back = findViewById(R.id.button);


        Intent intent = getIntent();
        String namee = intent.getStringExtra("name");
        String mobnoo = intent.getStringExtra("mobile");
        String cityy = intent.getStringExtra("place");
        String profile = intent.getStringExtra("profile");


        name.setText(namee);
        mobno.setText(mobnoo);
        city.setText(cityy);

        if(profile.matches("p1"))
            profileImage.setImageResource(R.drawable.p1);
        else if(profile.matches("p2"))
            profileImage.setImageResource(R.drawable.p2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
