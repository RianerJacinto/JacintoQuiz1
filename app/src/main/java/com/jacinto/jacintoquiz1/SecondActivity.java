package com.jacinto.jacintoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.jacinto.jacintoquiz1.R;

public class SecondActivity extends AppCompatActivity {
Button btn_Home;
    Button btn_IT;
    Button btn_IS;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_IT = (Button) findViewById(R.id.btnIT);
        btn_IS = (Button) findViewById(R.id.btnIS);
    }
    public void callThirdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
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
