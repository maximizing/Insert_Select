package app.buusk15.sqlite488;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ShowDataActivity extends Activity {
private ListView ListView;
@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show);
		ListView = (ListView) findViewById(R.id.listView1);
		control488DB control488db = new control488DB(this);
		ArrayList<HashMap<String, String>> MyArrayList = control488db.SelectAllData();
		SimpleAdapter adapter;
		adapter = new SimpleAdapter(ShowDataActivity.this, MyArrayList, R.layout.show_item, new String[]{"MemberId","Name","Tel"},new int[]{R.id.ColMemberId,R.id.ColName,R.id.ColTel});
		ListView.setAdapter(adapter);
		
	}
}
