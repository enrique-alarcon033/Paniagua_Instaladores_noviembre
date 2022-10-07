package com.yonusa.paniaguainstaladores.ui.createAccount.create;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;
import com.yonusa.paniaguainstaladores.R;

public class Activar_cuenta extends AppCompatActivity {
    EditText codigo;
    Button activar;
    LottieAnimationView loader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activar_cuenta2);
    }
}