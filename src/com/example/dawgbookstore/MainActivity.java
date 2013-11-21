package com.example.dawgbookstore;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void popUp() {
	       // DialogFragment newFragment = new NotFoundDialogFragment();
	        // newFragment.show(getSupportFragmentManager(), "notfound");
	    	
	    	AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
	        builder1.setMessage("Invalid Department Name");
	        builder1.setCancelable(true);
	        builder1.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int id) {
	                dialog.cancel();
	            }
	        });

	        AlertDialog alert11 = builder1.create();
	        alert11.show();
	 } 
	 /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	if(message.equalsIgnoreCase("CHEM E") || message.equalsIgnoreCase("Chemical Engineering")) {
    	Intent intent = new Intent(MainActivity.this, CourseListOne.class);
 	    startActivity(intent);
    	} else {
    		popUp();
    	}
    }
    
    public void goToSell(View view) {
    	Intent intent = new Intent(MainActivity.this, SellBookPage.class);
 	    startActivity(intent);
    }
    
    public void goToMessage(View view) {
    	Intent intent = new Intent(MainActivity.this, MessageManager.class);
 	    startActivity(intent);
    }
    

}
