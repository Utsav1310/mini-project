package com.example.project.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.project.databinding.ActivitySignUpBinding;
import com.example.project.fragments.BottomSheet_AddImage;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners() {
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
        binding.btnAddImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheet_AddImage addImage = new BottomSheet_AddImage();
                addImage.show(getSupportFragmentManager(),"BottomSheet");
            }
        });
    }

}