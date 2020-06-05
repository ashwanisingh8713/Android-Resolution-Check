package com.ash.su_density;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dpiDensityTxt;
    TextView densityTxt;
    TextView dpiTxt;
    TextView osVersionTxt;
    TextView osSdkVersionTxt;
    TextView deviceBrandTxt;
    TextView deviceModelTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dpiDensityTxt = findViewById(R.id.dpiDensityTxt);
        densityTxt = findViewById(R.id.densityTxt);
        dpiTxt = findViewById(R.id.dpiTxt);
        osVersionTxt = findViewById(R.id.osVersionTxt);
        osSdkVersionTxt = findViewById(R.id.osSdkVersionTxt);
        deviceBrandTxt = findViewById(R.id.deviceBrandTxt);
        deviceModelTxt = findViewById(R.id.deviceModelTxt);

        String osVersion = android.os.Build.VERSION.RELEASE;
        int osSdkVersion = android.os.Build.VERSION.SDK_INT;
        String deviceBrand = android.os.Build.MANUFACTURER;
        String deviceModel = android.os.Build.MODEL;


        String dpiDensityStr = dpiDensityTxt.getText().toString();
        String[] dpiDensity = dpiDensityStr.split("-");
        int len = dpiDensity.length;

        dpiDensityTxt.setText("Values res name  = "+dpiDensityStr);

        if(len == 1) {
            dpiTxt.setText("DPI = "+dpiDensity[0]);
        }

        if(len == 2) {
            densityTxt.setText("DENSITY = "+dpiDensity[1]);
            dpiTxt.setText("DPI = "+dpiDensity[0]);
        }

        osVersionTxt.setText("OS Version = "+osVersion);
        osSdkVersionTxt.setText("Os SDK Version = "+osSdkVersion);
        deviceBrandTxt.setText("Device Brand = "+deviceBrand);
        deviceModelTxt.setText("Device Model = "+deviceModel);

        Log.i("", "");

    }
}
