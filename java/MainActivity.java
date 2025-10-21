package com.example.myjavaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText; // 버튼과 에딧텍스트 사용하려면 추가 해야함

/*
<<<<<<< HEAD
public class MainActivity extends AppCompatActivity { // 버튼과에딧텍스트 쳅터
=======
public class MainActivity extends AppCompatActivity { // 버튼과에딧텍스트 1,2강
>>>>>>> 7195102 (6강 주석처리)

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
<<<<<<< HEAD
public class MainActivity extends AppCompatActivity { // 화면 전환 쳅터
=======
public class MainActivity extends AppCompatActivity { // 화면 전환 3강
>>>>>>> 7195102 (6강 주석처리)

	
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
/*
public class MainActivity extends AppCompatActivity { // 이미지뷰와 토스트(알림) 4강

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
<<<<<<< HEAD
}*/
=======
}
public class MainActivity extends AppCompatActivity { //리스트뷰 목록6강

	private ListView lv_list;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv_list = (ListView)findViewById(R.id.lv_list);

		List<String> data1 = new ArrayList<>(); //리스트뷰에 데이터를 넣으려면 리스트라는 자료형을 선언해야함/ String 형식으로 값을 넣겠다는 뜻

		ArrayAdapter<String adapter = new ArrayAdapter<>(context: this,android.R.layout.simple_list_item_1, data1);//리스트뷰와 값을저장하는 리스트를 연결해줄려면 어뎁터가 필요함
		lv_list.setAdapter(adapter);

		data1.add("내가 넣고싶은 데이터");
		data1.add("남호영");
		data1.add("파인애플");
		adapter.notifyDataSetChanged(); // 이상태를 저장을 하겠다는 뜻
	}
	
}*/

>>>>>>> 7195102 (6강 주석처리)
