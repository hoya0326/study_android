package com.example.myjavaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText; // 버튼과 에딧텍스트 사용하려면 추가 해야함

/*
public class MainActivity extends AppCompatActivity { // 버튼과에딧텍스트 쳅터

	EditText et_id; // 이건 걍 변수선언
	Button btn_test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플 실행시 실해하는 곳
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		et_id = findViewByid(R.id.et_id); // 실제로 et_id를 연결하는거임(백엔드랑 프론트엔드)
		btn_test = findViewByid(R.id.btn_test);

		btn_test.setOnClickListener(new View.onClickListener(){ // 클릭하면 실행할거
			@Override
			public void onClick(View v){
				et_id.setText("아이디~"); // 버튼을 누르면 et_id에 아이디~라고 글을 띄워라 라는기능
			}					   
		});
    }
}*/
/*
public class MainActivity extends AppCompatActivity { // 화면 전환 쳅터

	
	private Button btn_move;
	private EditText et_test;
	private String str;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플 실행시 실해하는 곳
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // activity_main xml이랑 연결되있다는 뜻

		et_test = findviewByid(R.id.et_test);
		
		
		btn_move = findviewByid(R.id.btn_move) // 메인액티비티안에 있는 이동버튼 찾아와라 라는 뜻
		btn_move.setOnClickListener(new View.OnClickListener(){ // 클릭했을때 여기 안에 구문을 실행해라
			@Override
			public void onClick(view v)
			{
				str = et_test.getText().toString(); // 에딧텍스트 글작성하면 str문자열에 저장 / tostring 써야지 문자열 형태로 저장됨
				Intent intent = new Intent(MainActivity.this, SubActivity.class); //현재 본인 액티비티랑, 전환할 액티비티 인자
				intent.putExtra(name "str", str); /* "str"은 별명 같은거임 다음에도 쓸수 있게 str이 진짜로 값이 들어가는 곳 
													이걸로 sub액티비티에 str값 전송
				startActivity(intent); // 액티비티 이동 구문
			}
		});
    }
}*/
public class MainActivity extends AppCompatActivity { 

	ImageView iv_test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		iv_test = (ImageView)findViewById(R.id.test);// findviewbyid는 저변수를 찾아오는 코드임
		iv_test.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "알림", Toast.LENGTH_SHORT). show(); // 밑에 알림이 뜨게 해주는 코드
			}
		})
    }
}