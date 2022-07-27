package com.example.androiddatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.androiddatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ClickEventHandler mClickEventHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mClickEventHandler = new ClickEventHandler(this);

        activityMainBinding.setMyviewmodel(new MyViewModel());

        activityMainBinding.getMyviewmodel().taskName = "Programming";

        activityMainBinding.setTaskCategory("Business");

        activityMainBinding.txtTaskColor.setText("RED");

        //activityMainBinding.setLifecycleOwner(this);

        activityMainBinding.setClickEventHandler(mClickEventHandler);

    }

    public class ClickEventHandler {

        private Context mContext;

        public ClickEventHandler(Context context) {
            mContext = context;
        }

        public void textViewClick(View view) {
            Toast.makeText(mContext, "TextView clicked", Toast.LENGTH_SHORT).show();
        }

        public void textViewClickWithParams(View view, String category) {
            Toast.makeText(mContext, category, Toast.LENGTH_SHORT).show();
        }

    }

}