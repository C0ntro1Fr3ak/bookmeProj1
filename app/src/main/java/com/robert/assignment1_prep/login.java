package com.robert.assignment1_prep;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class login extends Activity {

    EditText _txtUser, _txtPass;
    Button _btnLogin;
    Spinner _spinType;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        _txtPass = (EditText) findViewById(R.id.txtPass);
        _txtUser = (EditText) findViewById(R.id.txtUser);
        _btnLogin = (Button) findViewById(R.id.btnLogin);
        _spinType = (Spinner) findViewById(R.id.spinType);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.usertype, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        _spinType.setAdapter(adapter);
        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = _spinType.getSelectedItem().toString();
                if (_txtUser.getText().toString().equals("admin") && _txtPass.getText().toString().equals("admin") && item.equals("admin")) {
                    Intent intentAdmin = new Intent(login.this, adminmain.class);
                    startActivity(intentAdmin);

                } else if (_txtUser.getText().toString().equals("user") && _txtPass.getText().toString().equals("user") && item.equals("user")) {
                    Intent intentUser = new Intent(login.this, usermain.class);
                    startActivity(intentUser);
                } else {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
