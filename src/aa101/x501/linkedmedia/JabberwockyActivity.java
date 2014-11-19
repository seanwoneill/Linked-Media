package aa101.x501.linkedmedia;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class JabberwockyActivity extends Activity {

	WebView jabPoint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("Jabberwocky", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jabberwocky);
		WebView jabPoint = (WebView) findViewById(R.id.jabWebView1);
		jabPoint.getSettings().setBuiltInZoomControls(true);
		jabPoint.loadUrl("file:///android_asset/jabberwocky.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Log.e("Jabberwocky", "onCreateOptionsMenu");
		// Inflate the menu; adds items to the action bar if it is parent
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		Log.e("Jabberwocky", "onKeyDown");
		// Check if the key event was the Back button and if there's history
		if ((keyCode == KeyEvent.KEYCODE_BACK) && jabPoint.canGoBack()) {
			jabPoint.goBack();
			return true;
		}
		// If it wasn't the Back key or there's no web page history, bubble up
		// to the default
		// system behavior (probably exit the activity)
		return super.onKeyDown(keyCode, event);
	}

	@Override
	protected void onResume() {
		Log.e("Jabberwocky", "onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("Jabberwocky", "onPause");
		super.onPause();
	}
}
