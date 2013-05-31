package com.example.jumble;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	EditText edt;
	TextView tv;
	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		edt=(EditText)findViewById(R.id.editText1);
		tv=(TextView)findViewById(R.id.textView1);
		btn=(Button)findViewById(R.id.button1);
		
		btn.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String str;
		str = edt.getText().toString();
		char[] arr = str.toCharArray();
		Random r = new Random();
		for(int i = str.length()-1; i>0; i--){
			int rand = r.nextInt(i);
			char c = arr[i];
			arr[i] = arr[rand];
			arr[rand] = c;
		
		}
		String newstr = new String(arr);
		tv.setText(newstr);
		
		
	}

}
