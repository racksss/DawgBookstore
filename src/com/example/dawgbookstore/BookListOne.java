package com.example.dawgbookstore;

import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;


public class BookListOne extends Activity {

    
  private ListView mainListView ;  
  private ArrayAdapter<String> listAdapter ;  
    
  /** Called when the activity is first created. */  
  @Override  
  public void onCreate(Bundle savedInstanceState) {  
    super.onCreate(savedInstanceState);  
    setContentView(R.layout.activity_book_list_one);  
      
    // Find the ListView resource.   
    mainListView = (ListView) findViewById( R.id.bookOneListView );  
    
    // Create and populate a List of course names.  
    String[] courses = new String[] { "Elementary Principles of Chemical Processes, 3rd Ed", "Elementary Principles of Chemical Processes, 2nd Ed"};    
    ArrayList<String> courseList = new ArrayList<String>();  
    courseList.addAll( Arrays.asList(courses) );  
      
    // Create ArrayAdapter using the course list.  
    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, courseList);  
      
    // Set the ArrayAdapter as the ListView's adapter.  
    mainListView.setAdapter( listAdapter );        
    
    // When clicked on, goes to a new page.
    mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick( AdapterView<?> parent, View item, 
                               int position, long id) {
	       String course = listAdapter.getItem( position );
	       if (course.equals("Elementary Principles of Chemical Processes, 3rd Ed")) {
	    	   Intent intent = new Intent(BookListOne.this, BookOne.class);
	    	   startActivity(intent);
	       } 
	       
      }
    });
    
  }
}
