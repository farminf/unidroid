package com.artronics.unidroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListItemsActivity extends BaseActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_list_items);
	    // TODO Auto-generated method stub
	    
	     ListView listOfItems = (ListView) findViewById(R.id.listOfItems);
	        
	     String[] items = { "Milk", "Butter", "Yogurt", "Toothpaste", "Ice Cream" };
	        
	     ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, items);
	        
	     listOfItems.setAdapter(adapter);
	     
	     /*
	     listOfItems.setClickable(true);
	     listOfItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {

	       @Override
	       public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

	         //Object o = listOfItems.getItemAtPosition(position);
	    	   //listOfItems.getItemIdAtPosition(position);
	           
	       }
	     });
	     */
	}
	


}
