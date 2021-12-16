package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Go =(ImageButton)findViewById( R.id.Go );
            Go.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            startActivity(new Intent( this, FictionCategory.class ) );

    }
}