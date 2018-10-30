package com.lyna.www.sendbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExplicitActivity extends AppCompatActivity {

    TextView textViewExplicitBundle;
    TextView textViewExplicitId, textViewExplicitPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        Bundle bundle = getIntent().getExtras();
        textViewExplicitBundle = (TextView)findViewById(R.id.textViewExplicitBundle);
        textViewExplicitId = (TextView)findViewById(R.id.textViewExplicitId);
        textViewExplicitPass = (TextView)findViewById(R.id.textViewExplicitPass);

        textViewExplicitBundle.setText(bundle.getString("singleName", "No Data"));
        textViewExplicitId.setText(bundle.getString("login_id", "No Data"));
        textViewExplicitPass.setText(bundle.getString("login_pass", "No Data"));
    }
}
