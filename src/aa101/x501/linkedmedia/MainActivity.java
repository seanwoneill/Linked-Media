package aa101.x501.linkedmedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("Main", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Log.e("Main", "onCreateOptionsMenu");
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Log.e("Main", "onOptionsItemsSelected");
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
		/*
		 * Log.e("Main", "clickJabber");Intent jabIntent = new Intent();
		 * jabIntent.setClass(this, JabberwockyActivity.class); // Soon (but not
		 * immediately) // a new Activity will be created and shown to the user
		 * ...startActivity(jabIntent); // As part of starting another activity
		 * // onPause() and onStop() will soon be called on this Surprise
		 * Activityfinish();
		 */
		Log.e("Main", "clickJabber");
		Intent jabIntent = new Intent(MainActivity.this,
				JabberwockyActivity.class);
		// jabIntent.putExtra("key", value); // Optional parameters
		MainActivity.this.startActivity(jabIntent);
	}
}
