package com.example.info_store;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
	private Button logon;
	private Button exit;
	private EditText usr;
	private EditText pwd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		exit=(Button)findViewById(R.id.exit);
		logon=(Button)findViewById(R.id.logon);
		usr=(EditText)findViewById(R.id.usr);
		pwd=(EditText)findViewById(R.id.pwd);
		OnClickListener listener= new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if((usr.getText().toString()).equals(pwd.getText().toString()))
				{
				Intent intent= new Intent(getApplicationContext(), Welcome.class);
				startActivity(intent);
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Wrong Username/Password", Toast.LENGTH_LONG).show();
					
				}
			}
		};
		logon.setOnClickListener(listener);
		
		OnClickListener listener2= new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				
			}
		};
		exit.setOnClickListener(listener2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
