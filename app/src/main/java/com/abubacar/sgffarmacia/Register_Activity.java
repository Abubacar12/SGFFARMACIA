package com.abubacar.sgffarmacia;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.abubacar.sgffarmacia.databinding.ActivityRegisterBinding;

public class Register_Activity extends AppCompatActivity {

    private ActivityRegisterBinding mainbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

       mainbinding.textViewVoltar.setOnClickListener(
               v -> {
                   Intent intent = new Intent(Register_Activity.this, login_Activity.class);
                   startActivity(intent);
               }
       );
}

    }

