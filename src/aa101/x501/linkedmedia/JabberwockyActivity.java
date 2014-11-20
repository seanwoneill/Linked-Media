package aa101.x501.linkedmedia;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

public class JabberwockyActivity extends Activity {

	WebView jabPoint;
	MediaPlayer jabPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("Jabberwocky", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jabberwocky);
		WebView jabPoint = (WebView) findViewById(R.id.jabWebView1);
		jabPoint.getSettings().setBuiltInZoomControls(true);
		jabPoint.loadUrl("file:///android_asset/jabberwocky.html");
	}

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// Log.e("Jabberwocky", "onCreateOptionsMenu");
	// // Inflate the menu; adds items to the action bar if it is parent
	// getMenuInflater().inflate(R.menu.main, menu);
	// return true;
	// }

	@Override
	protected void onResume() {
		Log.e("Jabberwocky", "onResume");
		jabPlayer = MediaPlayer.create(this, R.raw.jm2halloween);
		jabPlayer.start();
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("Jabberwocky", "onPause");
		// jabPlayer.stop();
		// jabPlayer.release();
		jabPlayer.pause();
		super.onPause();
	}

	protected void onStop() {
		Log.e("Jabberwocky", "onStop");
		jabPlayer.stop();
		jabPlayer.release();
		super.onStop();
	}

	protected void click2Wiki(View view) {
		Log.e("Jabberwocky", "clickWiki");
		String jabURL = "http://en.wikipedia.org/wiki/Jabberwocky";
		Intent jabWiki = new Intent(Intent.ACTION_VIEW);
		jabWiki.setData(Uri.parse(jabURL));
		startActivity(jabWiki);
	}

	protected void click2Beast() {
		Log.e("Jabberwocky", "clickWafflingBeast");
		jabPoint.loadUrl("file:///android_asset/grumpycat_hdpi");
	}
}
