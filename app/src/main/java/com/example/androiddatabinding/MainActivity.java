package com.example.androiddatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.androiddatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.setMyviewmodel(new MyViewModel());

        activityMainBinding.getMyviewmodel().taskName = "Programming";

        activityMainBinding.setTaskCategory("Business");

        activityMainBinding.txtTaskColor.setText("RED");

        activityMainBinding.setLifecycleOwner(this);

    }
}