package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        //Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSelectedLandmark();

        binding.landmarkNameText.setText(selectedLandmark.name);
        binding.countryNameText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);;






    }
}