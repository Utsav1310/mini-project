package com.example.project.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.project.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_AddImage extends BottomSheetDialogFragment {

    ActivityResultLauncher<Intent> pickImage;

    public BottomSheet_AddImage(ActivityResultLauncher<Intent> pickImage) {
        this.pickImage = pickImage;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_for_add_image,container,false);

        ImageButton imgBtn_Camera = view.findViewById(R.id.imgBtn_Camera);
        ImageButton imgBtn_Gallery = view.findViewById(R.id.imgBtn_Gallery);

        imgBtn_Camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Camera clicked.", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        imgBtn_Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
pickImage.launch(intent);
                dismiss();
            }
        });

        return view;
    }
}
