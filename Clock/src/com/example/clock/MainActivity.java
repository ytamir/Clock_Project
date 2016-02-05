package com.example.clock;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
	
	private String class_name;
	
	private Button settings;
	
	private TextView showtime; //Textview to display time
	
	/*
	 * Constructor the stores the Class_Name for debugging purposes 
	 */
	public MainActivity() {
		
		class_name = getClass().getName();
		
	}
	
	

	public void clickedSettings(View view) {
		
		Intent settings = new Intent(getApplicationContext(),Settings.class); // Create the new intent 
		
		startActivity(settings); // Start the activity
		
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Log.d(class_name, "Creating");
        
        settings = (Button) findViewById(R.id.settings_button); // Enable the start variable to hold the start_button
        
        showtime = (TextView) findViewById(R.id.timer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
