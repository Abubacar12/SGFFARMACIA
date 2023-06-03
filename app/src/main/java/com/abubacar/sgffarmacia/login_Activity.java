package com.abubacar.sgffarmacia;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.abubacar.sgffarmacia.databinding.ActivityMain2Binding;

public class login_Activity<ActivityMain2> extends AppCompatActivity {

    private ActivityMain2Binding mainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mainBinding.buttonLogin.setOnClickListener(
                v ->{
                    Intent intent = new Intent(login_Activity.this, MainActivity.class);
                    startActivity(intent);

                }
        );
        mainBinding.textViewRegistrar.setOnClickListener(
                v -> {
                    Intent inten = new Intent(login_Activity.this, Register_Activity.class);
                    startActivity(inten);
                }
        );
    }

}