package com.example.myjavaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;


public class SubActivity extends AppCompatActivity { // 화면 전환 쳅터

	private TextView tv_sub;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플 실행시 실해하는 곳
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

		tv_sub = findViewByid(R.id.tv_sub);
		
		Intent intent = getIntent(); //어디선가 intent로 값을 주면 받을 수 있게 해주는 구문
		String str = intent.getStringExtra(name "str"); // 어디선가 날라온 string값을 받겠다는 말 ()안에는 별명 들어가야함

		tv_sub.setText(str);
		
    }
}main