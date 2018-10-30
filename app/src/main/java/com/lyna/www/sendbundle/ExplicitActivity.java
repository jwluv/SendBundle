package com.lyna.www.sendbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitActivity extends AppCompatActivity {

    TextView textViewExplicitBundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        Bundle bundle = getIntent().getExtras();
        textViewExplicitBundle = (TextView)findViewById(R.id.textViewExplicitBundle);
        textViewExplicitBundle.setText(bundle.getString("singleName", "No Data"));
    }
}
