package com.robert.assignment1_prep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText _txtUser, _txtPass;
    Button _btnLogin;
    Spinner _spinType;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _txtPass=(EditText) findViewById(R.id.txtPass);
        _txtUser=(EditText) findViewById(R.id.txtUser);
        _btnLogin=(Button) findViewById(R.id.btnLogin);
        _spinType=(Spinner) findViewById(R.id.spinType);
        ArrayAdapter <CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.usertype, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        _spinType.setAdapter(adapter);
    }
}