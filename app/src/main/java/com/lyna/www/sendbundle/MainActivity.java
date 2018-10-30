package com.lyna.www.sendbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonSendBundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSendBundle = (Button)findViewById(R.id.buttonSendBundle);
        buttonSendBundle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String text = ((Button)v).getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("singleName", text);
        Intent intent = new Intent(this, ExplicitActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
