package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    private ImageButton like;
    private Switch sw;
    private ImageView img;
    private RadioButton rb;
    private RadioButton rb2;
    private Button ref;
    private CheckBox cb;
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        like = findViewById(R.id.imageButton);
        sw = findViewById(R.id.switch1);
        img = findViewById(R.id.dc_iv);
        rb = findViewById(R.id.radioButton);
        rb2 = findViewById(R.id.radioButton2);
        Button ref;
        cb = findViewById(R.id.checkBox);
        rg = findViewById(R.id.radioGroup);
        sw.setChecked(true);
        rb.setChecked(true);
        cb.setChecked(true);
    }

    boolean choose=false;

    public void ImButton(View view) {


        if (!choose) {
            like.setImageResource(R.drawable.pause1);
            choose = true;
        } else {
            like.setImageResource(R.drawable.play1);
            choose = false;
        }


    }



    public void refresh(View view) {
        boolean status = sw.isChecked();
        if (status) {
            img.setVisibility(View.VISIBLE);
        } else {
            img.setVisibility(View.INVISIBLE);
        }

        if (rb.isChecked())
            like.setClickable(true);
        else if (rb2.isChecked())
            like.setClickable(false);

        if (!cb.isChecked())
            like.setVisibility(View.INVISIBLE);
        else {

            like.setVisibility(View.VISIBLE);
        }

    }

}
