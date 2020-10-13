package com.example.firstlabmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtMain = findViewById(R.id.txtMain);
    }

    public void BtnChangeText(View view) {
        this.txtMain.setText("Good bye World");
        this.txtMain.setTextColor(getResources().getColor(R.color.purple_200));
    }
}