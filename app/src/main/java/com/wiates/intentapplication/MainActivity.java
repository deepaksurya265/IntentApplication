package com.wiates.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView p1,p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                intent.putExtra("name","Marcus");
                intent.putExtra("mobile","8564812687");
                intent.putExtra("place","New York");
                intent.putExtra("profile","p1");
                startActivity(intent);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                intent.putExtra("name","Jibin");
                intent.putExtra("mobile","8975302145");
                intent.putExtra("place","London");
                intent.putExtra("profile","p2");
                startActivity(intent);
            }
        });

    }
}
