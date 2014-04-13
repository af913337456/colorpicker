package com.style.colorpicker;

import com.style.colorpicker.ColorPickerView.onColorChangedListener;

import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity; 

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorPickerView colorPickerView = (ColorPickerView) findViewById(R.id.cpv);
        colorPickerView.setColorChangedListener(new onColorChangedListener() {
			
			@Override
			public void colorChanged(int red, int blue, int green) {
				Toast.makeText(MainActivity.this, "red="+red+"  blue="+blue+"   green="+green,
						Toast.LENGTH_SHORT).show();
				
			}
		});
    }

 
}
