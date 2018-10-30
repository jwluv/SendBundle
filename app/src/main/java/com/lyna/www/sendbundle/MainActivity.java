package com.lyna.www.sendbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonSendBundle, buttonLogin;
    EditText editTextId, editTextPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSendBundle = (Button)findViewById(R.id.buttonSendBundle);
        buttonSendBundle.setOnClickListener(this);

        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);

        editTextId = (EditText)findViewById(R.id.editTextId);
        editTextPass = (EditText)findViewById(R.id.editTextPass);
    }

    @Override
    public void onClick(View v) {

        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, ExplicitActivity.class);
        switch(v.getId()) {

            case R.id.buttonSendBundle:
                String text = ((Button) v).getText().toString();
                bundle.putString("singleName", text);
                break;
            case R.id.buttonLogin:
                bundle.putString("login_id", editTextId.getText().toString());
                bundle.putString("login_pass", editTextPass.getText().toString());
                break;
        }
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
