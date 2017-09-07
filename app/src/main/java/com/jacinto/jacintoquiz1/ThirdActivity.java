package com.jacinto.jacintoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.jacinto.jacintoquiz1.R;
public class ThirdActivity extends AppCompatActivity {
    Button btn_Home;
    Button btn_CS;
    Button btn_IS;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_CS = (Button) findViewById(R.id.btnCS);
        btn_IS = (Button) findViewById(R.id.btnIS);
    }
    public void callSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void callMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void callFourthActivity(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}
