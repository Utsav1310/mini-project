package com.example.project.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.project.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_AddImage extends BottomSheetDialogFragment {
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
                Toast.makeText(getActivity(), "Gallery clicked.", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        return view;
    }
}
