package aa101.x501.linkedmedia;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class RollingBallActivity extends Activity {

	WebView ballPoint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rolling_ball);
		ballPoint = (WebView) findViewById(R.id.ballWebView1);
		ballPoint.getSettings().setDomStorageEnabled(true);
		ballPoint.getSettings().setJavaScriptEnabled(true);
		ballPoint.getSettings().setBuiltInZoomControls(true);
		ballPoint.loadUrl("javascript:///android_asset/roundball/roundball.js");
	}
}
