package com.taskesnoad.outlub.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.taskesnoad.outlub.R;
import com.taskesnoad.outlub.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_details);

        binding.collapsing.setTitle("Hallo");

        binding.imgFood.setImageResource(R.drawable.logo);
        binding.collapsing.setExpandedTitleTextAppearance(R.style.Exrpendappbar);
        binding.collapsing.setCollapsedTitleTextAppearance(R.style.collapesappbar);
    }







}