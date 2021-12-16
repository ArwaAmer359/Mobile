package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class HistoryCategory extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_category);

        GoBack =(ImageButton)findViewById( R.id.GoBack );
        Fiction =(Button)findViewById( R.id.Fiction );
        Man =(Button)findViewById( R.id.Man );
        Scintific =(Button)findViewById( R.id.Scintific );
        WorldWar =(ImageButton)findViewById( R.id.WorldWar );
        Egypt =(ImageButton)findViewById( R.id.Egypt );
        Battles =(ImageButton)findViewById( R.id.Battles );

        GoBack.setOnClickListener(this);
        Scintific.setOnClickListener(this);
        Man.setOnClickListener(this);
        Fiction.setOnClickListener(this);
        WorldWar.setOnClickListener(this);
        Egypt.setOnClickListener(this);
        Battles.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == Fiction){
            startActivity(new Intent( this, FictionCategory.class ) );
        }

//      else if(view == GoBack){
//            startActivity(new Intent( this, 'the name of the home page here'.class ) );}
        else if (view == Man){
            startActivity(new Intent( this, ManCategory.class ) );
        }
        else if (view == Scintific){
            startActivity(new Intent( this, ScintificCategory.class ) );
        }
        else if (view == WorldWar){
            startActivity(new Intent( this, Book9Info.class ) );
        }
        else if (view == Egypt){
            startActivity(new Intent( this, Book10Info.class ) );
        }
        else if (view == Battles){
            startActivity(new Intent( this, Book11Info.class ) );
        }

    }
    }
}