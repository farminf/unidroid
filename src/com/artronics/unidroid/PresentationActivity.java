package com.artronics.unidroid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class PresentationActivity extends ListActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// TODO Auto-generated method stub
		Intent i = getIntent();
		// getting attached intent data
		String parameter = i.getStringExtra("parameter");
		// displaying selected product name
		if (parameter.equals("classes")) {

			String[] jclasslist = getResources()
					.getStringArray(R.array.Classes);
			this.setListAdapter(new ArrayAdapter<String>(this,
					R.layout.activity_presentation, R.id.universitylist,
					jclasslist));

		} else if (parameter.equals("labs")) {

			String[] jlabslist = getResources().getStringArray(R.array.labs);
			this.setListAdapter(new ArrayAdapter<String>(this,
					R.layout.activity_presentation, R.id.universitylist,
					jlabslist));

		} else if (parameter.equals("library")) {

			String[] jlibrarylist = getResources().getStringArray(
					R.array.library);
			this.setListAdapter(new ArrayAdapter<String>(this,
					R.layout.activity_presentation, R.id.universitylist,
					jlibrarylist));

		} else if (parameter.equals("Giovanni Corazza")) {

			String[] jprofessorlist = getResources().getStringArray(
					R.array.proffesor);
			this.setListAdapter(new ArrayAdapter<String>(this,
					R.layout.activity_presentation, R.id.universitylist,
					jprofessorlist));

		}
		ListView lv = getListView();
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				// selected item
				String clickitem = ((TextView) view).getText().toString();

				// Launching new Activity on selecting single List Item
				if (clickitem.equals("Main Library")) {

					Intent i = new Intent(getApplicationContext(),
							MapActivity.class);
					// sending data to new activity
					//i.putExtra("parameter", location);
					startActivity(i);
				}
				// startActivity(i);

			}
		});
	}

}
