package com.example.dawgbookstore;
 
import java.util.ArrayList;  
import java.util.Arrays;  
import android.app.Activity;  
import android.content.Intent;
import android.os.Bundle;  
import android.widget.ArrayAdapter;  
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;
  
public class CourseListOne extends Activity {  
    
  private ListView mainListView ;  
  private ArrayAdapter<String> listAdapter ;  
    
  /** Called when the activity is first created. */  
  @Override  
  public void onCreate(Bundle savedInstanceState) {  
    super.onCreate(savedInstanceState);  
    setContentView(R.layout.activity_course_list_one);  
      
    // Find the ListView resource.   
    mainListView = (ListView) findViewById( R.id.courseOneListView );  
    
    // Create and populate a List of course names.  
    String[] courses = new String[] { "CHEM E 310", "CHEM E 325", "CHEM E 330", "CHEM E 341", "CHEM E 375", 
    			"CHEM E 436", "CHEM E 465", "CHEM E 480"};    
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
	       if (course.equals("CHEM E 310")) {
	    	   Intent intent = new Intent(CourseListOne.this, BookListOne.class);
	    	   startActivity(intent);
	       } else if (course.equals("CHEM E 341")) {
	    	   Intent intent = new Intent(CourseListOne.this, BookListTwo.class);
	    	   startActivity(intent);
	       } 
	       
      }
    });
    
  }
}

