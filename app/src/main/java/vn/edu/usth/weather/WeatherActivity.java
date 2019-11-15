package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("1", "This is onCreate");
        //Create a new Fragment
        ForecastFragment ForecastFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.container, ForecastFragment).commit();
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i("2","This is onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("3","This is onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("4","This is onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("5","This is onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("6","This is onDestroy");
    }
}

