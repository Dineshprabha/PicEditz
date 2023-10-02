package com.dineshPrabha.piceditz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dineshPrabha.piceditz.databinding.ActivityEditorBinding;
import com.dineshPrabha.piceditz.databinding.ActivityMainBinding;

public class EditorActivity extends AppCompatActivity {

    private ActivityEditorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}