package com.jacinto.jacintoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.jacinto.jacintoquiz1.R;

public class FourthActivity extends AppCompatActivity {
    Button btn_Home;
    Button btn_CS;
    Button btn_IT;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_CS = (Button) findViewById(R.id.btnCS);
        btn_IT = (Button) findViewById(R.id.btnIT);
    }
    public void callSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void callMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void callThirdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
