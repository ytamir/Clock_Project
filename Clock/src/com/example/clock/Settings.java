package com.example.clock;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

@SuppressLint("NewApi")
public class Settings extends ActionBarActivity {
	
	
	private String class_name;
	
	/*
	 * Constructor the stores the Class_Name for debugging purposes 
	 */
	private Settings() {
		
		class_name = getClass().getName();
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	  @Override
		protected void onStart() {
			
			
			super.onStart(); // Make sure the code in the parent class is used 
			
			
			Log.d(class_name, "Starting");
			
	    }
	    
	    
	    @Override
		protected void onResume() {
			
			
			super.onResume(); // Call code of parent class
			
			Log.d(class_name, "Resuming");
			
		}
	    
	    
	    @Override
		protected void onPause() {
			
			
			super.onPause(); // Call parent code 
			
			Log.d(class_name, "Pausing");
			
		}
	    
	    
	    protected void onStop() {
			
			
			super.onStop(); // Call parent code 
			
			
			Log.d(class_name, "Stopping");
			
		}
	    
	    
	    @Override
		protected void onDestroy() {
			
			
			super.onDestroy();
			
			Log.d(class_name, "Destroying");
			
		}
}
