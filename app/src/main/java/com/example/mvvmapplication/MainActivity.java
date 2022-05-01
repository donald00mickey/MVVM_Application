package com.example.mvvmapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Observable;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    AppViewModel appViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        textView = findViewById ( R.id.textView );
        button = findViewById ( R.id.button );


        button.setOnClickListener ( view -> {
            appViewModel.getMeNewName ();
        } );

        appViewModel = new ViewModelProvider ( this ).get ( AppViewModel.class );
        appViewModel.mutableLiveData.observe ( this , new Observer<String> () {
            @Override
            public void onChanged(String s) {
                textView.setText ( s );
            }
        } );
    }
}