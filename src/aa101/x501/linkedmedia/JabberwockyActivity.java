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
//		jabPoint.getSettings().setLoadWithOverviewMode(true);
//		jabPoint.getSettings().setUseWideViewPort(true);
		jabPoint.getSettings().setBuiltInZoomControls(true);
		jabPoint.loadUrl("file:///android_asset/jabberwocky.html");
	}

	public void clickToWiki(View v) {
		Log.e("Jabberwocky", "clickWiki");
		// String jabURL = "http://en.wikipedia.org/wiki/Jabberwocky";
		Uri jabURL = Uri.parse("http://en.wikipedia.org/wiki/Jabberwocky");
		Intent jabWiki = new Intent(Intent.ACTION_VIEW, jabURL);
		// jabWiki.setData(Uri.parse(jabURL));
		startActivity(jabWiki);
	}

	public void click2Beast(View v) {
		Log.e("Jabberwocky", "clickWafflingBeast");
		String catURL = "file:///android_res/grumpycat.xml";
		Intent catPoint = new Intent(Intent.ACTION_VIEW);
		catPoint.setData(Uri.parse(catURL));
//		catPoint.setType(catURL);
//		startActivity(catPoint);
//		
		jabPoint.loadUrl(catURL);
//		
//		jabPoint.loadUrl("file:///android_asset/grumpycat_hdpi");
	}

	@Override
	protected void onResume() {
		Log.e("Jabberwocky", "onResume");
		jabPlayer = MediaPlayer.create(this, R.raw.jm2halloween);
		// jabPlayer = MediaPlayer.create(this, R.assets.jm2halloween);
		jabPlayer.start();
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("Jabberwocky", "onPause");
		jabPlayer.pause();
		super.onPause();
	}

	protected void onStop() {
		Log.e("Jabberwocky", "onStop");
		jabPlayer.stop();
		jabPlayer.release();
		super.onStop();
	}
}
