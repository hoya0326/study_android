package com.example.myjavaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText; // 버튼과 에딧텍스트 사용하려면 추가 해야함

/*


public class MainActivity extends AppCompatActivity { // 버튼과에딧텍스트 1,2강


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

public class MainActivity extends AppCompatActivity { // 화면 전환 3강

	
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

}

}
public class MainActivity extends AppCompatActivity { //리스트뷰 목록 6강

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
	
}

public class MainActivity extends AppCompatActivity //네비게이션 메뉴 7강 / 처음 프로젝트 만들때 네비게이션 팜플렛 선택시 기본 코드
	implements NavigationView.OnNavigationItemSelectedListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab); // FloatingActionButton은 우측하단에 버튼을 띄우는거임(ai상담버튼같은)
		fab.setOnClickListener((view) -> {
				Snackbar.make(view, text: "Replace with your own action", Snackbar.LENGTH_LONG) // 토스트 알림이랑 비슷한데 최신버전 좀더 세련됨
						.setAction(text: "Action", listener.null).show();
		});

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id. drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
			activity: this, drawer, toolbar, "Open navigation drawer", "Close navigation drawer");
		drawer.addDrawerListener(toggle);
		toggle.syncState();
		
		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);
	}
	@Override
	public void onBackPressed() { // 뒤로가기 버튼을 누르면 실행
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		if(drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) { //앱을 시작 할때 미리 만들어놓은 옵션메뉴 템플릿 가져오기
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) { // 메뉴 버튼 눌렀을때 나오는 동작
		int id = item.getItemId();
		if(id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@SuppressWarnings("StatementWithEmptyBody")
	@Override
	public boolean onNavigationItemSelected(MenuItem item) { // 메뉴 버튼을 눌렀을때 나오는 아이콘 누르면 나오는 동작
		int id = item.getItemId();

		if(id == R.id.nav_camera){// 메뉴 아이콘 눌렀을때 / 아이콘 바꾸고 싶으면 res폴더-activity main drawer 들어가서 수정
			// 카메라 버튼 눌렀을때 나오는 동작
		}else if(id == R.id.nav_gallery){
			// 갤러리 버튼 눌렀을때 나오는 동작
		}else if(id == R.id.nav_slideshow){
			// 슬라이드쇼 버튼 눌렀을때 나오는 동작 /이하 같음
		}else if(id == R.id.nav_manage){
			
		}else if(id == R.id.nav_share){
			
		}else if(id == R.id.nav_send){
			
		}

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START); // if문 끝나면 들어온 레이아웃 닫겠다는 뜻
		return true;
	}
}*/