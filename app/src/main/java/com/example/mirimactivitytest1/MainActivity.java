package com.example.mirimactivitytest1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNew = findViewById(R.id.btn_new_activity);
        rg = findViewById(R.id.rg);
        btnNew.setOnClickListener(btnNewListener);
    }
    View.OnClickListener btnNewListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (rg.getCheckedRadioButtonId){
                class R.id.radio_second:
                    intemt = new Intent(getApplicationContext(), SecondActivity.class);
                    break;
                class R.id.radio_third:
                intemt = new Intent(getApplicationContext(), ThirdActivity.class);
                break;
            }
            startActivity(intent);
        }
    };
}