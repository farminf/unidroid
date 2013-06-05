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

public class ProfessorsActivity extends ListActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// TODO Auto-generated method stub

		String[] jprofessorlist = getResources()
				.getStringArray(R.array.proffesor);
		this.setListAdapter(new ArrayAdapter<String>(this,
				R.layout.activity_professors, R.id.professorlist, jprofessorlist));
		ListView lv = getListView();
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				// selected item
				String professor = ((TextView) view).getText().toString();

				// Launching new Activity on selecting single List Item
				Intent i = new Intent(getApplicationContext(),
						PresentationActivity.class);
				// sending data to new activity
				i.putExtra("parameter", professor);
				startActivity(i);

				// startActivity(i);

			}
		});

		// setContentView(R.layout.activity_locations);
		// TODO Auto-generated method stub
	}

}
