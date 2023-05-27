package com.sata.izonovel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText etFirstname, etLastName, etPassword, etEmail;
    Button btnRegister, btnCancelRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFirstname = findViewById(R.id.et_firs_name);
        etLastName = findViewById(R.id.et_last_name);
        etPassword = findViewById(R.id.et_password);
        etEmail = findViewById(R.id.et_email);
        btnRegister = findViewById(R.id.btn_register_submit);
        btnCancelRegister = findViewById(R.id.btn_cancel_register);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmitRegister();
            }
        });
    }

    private  void  onSubmitRegister(){
        Log.d("FIRST_NAME",etFirstname.getText().toString());
        Log.d("LAST_NAME",etLastName.getText().toString());
        Log.d("EMAIL",etEmail.getText().toString());
        Log.d("PASSWORD",etPassword.getText().toString());

        String pesan = etFirstname.getText().toString();
        Toast.makeText(this,pesan,Toast.LENGTH_LONG ).show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("INFO")
                .setMessage("isi pesan")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.show();
    }

}