package com.example.yurika_endou.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadionButton;
    private Button mBtnCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_editText);
        mBtnRadionButton = findViewById(R.id.btn_radioButton);
        mBtnCheckBox = findViewById(R.id.btn_checkBox);
        setListeners();
    }

    public void setListeners(){
        Onclick onclick = new Onclick();
        mBtnEditText.setOnClickListener(onclick);
        mBtnTextView.setOnClickListener(onclick);
        mBtnButton.setOnClickListener(onclick);
        mBtnRadionButton.setOnClickListener(onclick);
        mBtnCheckBox.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    //Jump tp Text
                    intent = new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //Jump tp button
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_editText:
                    //Jump tp EditText
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radioButton:
                    //Jump tp RadioButton
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkBox:
                    //Jump to checkbox demo
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
            }
            startActivity(intent);
        }

    }

}
