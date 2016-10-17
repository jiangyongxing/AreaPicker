package cn.mifengkong.areapicker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	private CityPicker cityPicker;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cityPicker = (CityPicker) findViewById(R.id.citypicker);
		Toast.makeText(this, cityPicker.getCity_string(), 0).show();
	}

}
