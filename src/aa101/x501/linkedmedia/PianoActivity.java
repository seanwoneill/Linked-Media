package aa101.x501.linkedmedia;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

public class PianoActivity extends Activity {
	
//	WebView pianoPoint;
	MediaPlayer pianoPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("Piano Cat", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_piano);
//		pianoPoint = (WebView) findViewById(R.id.pianoWebView);
//		pianoPoint.getSettings().setBuiltInZoomControls(true);
//		pianoPoint.loadUrl("file:///android_asset/pianocat.avi");
	}

	@Override
	protected void onResume() {
		Log.e("Piano Cat", "onResume");
		pianoPlayer = MediaPlayer.create(this, R.raw.pianocat);
		pianoPlayer.start();
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("Piano Cat", "onPause");
		pianoPlayer.pause();
		super.onPause();
	}

	protected void onStop() {
		Log.e("Piano Cat", "onStop");
		pianoPlayer.stop();
		pianoPlayer.release();
		super.onStop();
		finish();
	}
}
