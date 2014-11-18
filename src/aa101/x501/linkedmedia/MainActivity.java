package aa101.x501.linkedmedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import apps101.javabook.MainActivity;
import apps101.javabook.NasaActivity;

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

	public void clickJabber(View view) {
		/*
		 * The following 4 lines of code are provided from android.com as a
		 * example of how to call another activity
		 */
		// Intent intent = new Intent(this, DisplayMessageActivity.class);
		// EditText editText = (EditText) findViewById(R.id.edit_message);
		// String message = editText.getText().toString();
		// intent.putExtra(EXTRA_MESSAGE, message);
		// startActivity(intent);
		
		// Remember Emily's app which also used Intents?
		// - You could start a new activity when responding to a button click.
		// By taking this code and putting inside your onClick method
		Intent intent = new Intent();
		intent.setClass(this, NasaActivity.class);
		if (Math.random() > 0.5) {
			// Open the Java Book instead!
			intent.setClass(this, MainActivity.class);
		}
		// Soon (but not immediately) 
		// a new Activity will be created and shown to the user ...
		startActivity(intent);
		// As part of starting another activity
		// onPause() and onStop() will soon be called on this Surprise Activity

		finish(); // Experiment! - I wonder what finish() does :-)
		// e.g. What happens if you remove it by either adding  '//' before it
		// or deleting the entire line
	}
}
