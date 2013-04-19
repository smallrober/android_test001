package com.example.test001;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		this.getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClickButton(View view)
	{
		// show the textview
		TextView textView = (TextView) this.findViewById(R.id.textView1);
		
		Button button = (Button) this.findViewById(R.id.button1);
		
		if (textView.getVisibility() == View.VISIBLE)
		{
			textView.setVisibility(View.INVISIBLE);
			
			button.setText(R.string.button1_show);
		}
		else
		{
			textView.setVisibility(View.VISIBLE);
			
			button.setText(R.string.button1_hide);
		}
	}
}
