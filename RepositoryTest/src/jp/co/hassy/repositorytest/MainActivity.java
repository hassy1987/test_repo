package jp.co.hassy.repositorytest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
		// HelloWorld
		TextView textView = (TextView) findViewById(R.id.textview_helloworld);
		textView.setText(R.string.hello_world);
	}
}
