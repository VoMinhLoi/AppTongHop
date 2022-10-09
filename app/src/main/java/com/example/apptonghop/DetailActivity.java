package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView nameAX, desAX;
    ImageView imageView;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        AnhXa();
        Intent intent = getIntent();
        Item item = (Item) intent.getSerializableExtra("Item");

        imageView.setImageResource(item.getImage());
        nameAX.setText(item.getName() + "\n" + item.getDate());
        desAX.setText(item.getDescription());
    }
    public void AnhXa(){
        imageView = (ImageView) findViewById(R.id.imageView);
        nameAX = (TextView) findViewById(R.id.nameTVDetail);
        desAX = (TextView) findViewById(R.id.dateTV);
    }
}
