package aa101.x501.linkedmedia;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class JabberwockyActivity extends Activity {
	
	WebView jabWebView = (WebView) findViewById(R.id.jabWebView1);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jabberwocky);
		jabWebView.getSettings().setBuiltInZoomControls(true);
		jabWebView.loadUrl("file:///android_asset/jabberwocky.html");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// Check if the key event was the Back button and if there's history
		if ((keyCode == KeyEvent.KEYCODE_BACK) && jabWebView.canGoBack()) {
			jabWebView.goBack();
			return true;
		}
		// If it wasn't the Back key or there's no web page history, bubble up
		// to the default
		// system behavior (probably exit the activity)
		return super.onKeyDown(keyCode, event);
	}
	
	@Override
	protected void onResume(){
		
	}
	
	@Override
	protected void onPause() {
		
	}
}
