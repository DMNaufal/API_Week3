package com.example.dmnaufal.ukm_tugas_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_next)
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Home");

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_next)
    public void OnClick(View v){
        Intent nextIntent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(nextIntent);
    }
}
