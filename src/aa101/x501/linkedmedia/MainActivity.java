package aa101.x501.linkedmedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("Main", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Log.e("Main", "onOptionsItemsSelected");
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	// public void clickJabber(View view) {
	// Log.e("Main", "clickJabber");
	// Intent jabIntent = new
	// Intent(MainActivity.this,JabberwockyActivity.class);
	// MainActivity.this.startActivity(jabIntent);
	// }

	public void clickPiano(View view) {
		Log.e("Main", "clickPiano");
		Intent pianoIntent = new Intent(MainActivity.this, PianoActivity.class);
		MainActivity.this.startActivity(pianoIntent);
	}

	public void clickGrumpy(View view) {
		Log.e("Main", "clickGrumpy");
		Intent grumpyIntent = new Intent(MainActivity.this,GrumpyActivity.class);
		MainActivity.this.startActivity(grumpyIntent);
	}
		
		public void clickCheese(View view) {
			Log.e("Main", "clickCheese");
			Intent cheeseIntent = new Intent(MainActivity.this,CheezActivity.class);
			MainActivity.this.startActivity(cheeseIntent);
	}
		
		public void clickChip(View view) {
			Log.e("Main", "clickChip");
			Intent chipIntent = new Intent(MainActivity.this,ChipmunkActivity.class);
			MainActivity.this.startActivity(chipIntent);
	}
}
