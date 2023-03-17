package com.example.aosmb3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16, 16, 16, 16);
        textView.setText("SecondActivity");
        setContentView(textView);
    }
    public void onClick2(View view){
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        intent.putExtra("string", textView.getText());
        setResult(RESULT_OK, intent);
        finish();
    }
}