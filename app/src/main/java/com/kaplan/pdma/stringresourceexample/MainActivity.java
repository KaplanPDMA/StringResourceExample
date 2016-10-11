package com.kaplan.pdma.stringresourceexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get value from string.xml
        String greeting = getString(R.string.greeting);
        Toast.makeText(this, greeting, Toast.LENGTH_LONG).show();
    }
}
