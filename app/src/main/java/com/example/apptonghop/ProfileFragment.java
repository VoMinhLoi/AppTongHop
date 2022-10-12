package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.net.URISyntaxException;

public class ProfileFragment extends Fragment {
    @Nullable
    ImageButton imageButtonAX;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);
        imageButtonAX =  view.findViewById(R.id.homeBT);
        imageButtonAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), LogInActivity.class);
                startActivity(intent);
            }
        });
        return view;

    }

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//
//        ImageButton imageButtonAX = (ImageButton) findViewById(R.id.homeBT);
//        imageButtonAX.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
}
