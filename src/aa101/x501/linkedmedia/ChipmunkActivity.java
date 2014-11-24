package aa101.x501.linkedmedia;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

public class ChipmunkActivity extends Activity {
	
	MediaPlayer chipPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chipmunk);
	}

	@Override
	protected void onResume() {
		Log.e("Chipmunk", "onResume");
		chipPlayer = MediaPlayer.create(this, R.raw.chipmunk);
		chipPlayer.start();
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("Chipmunk", "onPause");
		chipPlayer.pause();
		super.onPause();
	}

	protected void onStop() {
		Log.e("Chipmunk", "onStop");
		chipPlayer.stop();
		chipPlayer.release();
		super.onStop();
		finish();
	}
}
