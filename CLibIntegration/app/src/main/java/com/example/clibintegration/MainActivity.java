package com.example.clibintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Load the native library
    static {
        System.loadLibrary("native-lib");
    }

    // Declare the native method
    public native String stringFromJNI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call the native method
        String message = stringFromJNI();

        // Display the result
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}