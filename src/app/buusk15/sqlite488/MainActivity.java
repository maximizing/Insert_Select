package app.buusk15.sqlite488;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.R.string;


public class MainActivity extends Activity {
public class Control488DB {

	}
private Button btninsert,btnshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        control488DB control488db = new control488DB(this);
        control488db.getWritableDatabase();
        btninsert = (Button) findViewById(R.id.btninsert);
        btninsert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent2 = new Intent(getApplicationContext(),AddActivity.class);
				startActivity(intent2);
				
			}
		});
        btnshow = (Button) findViewById(R.id.btnshow);
        btnshow.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {				
				Intent intent = new Intent(getApplicationContext(),ShowDataActivity.class);
				startActivity(intent);	
			}
		});
        
    }
}
