package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class ManCategory extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_category);

        GoBack =(ImageButton)findViewById( R.id.GoBack );
        Fiction =(Button)findViewById( R.id.Fiction );
        Scintific =(Button)findViewById( R.id.Scintific );
        History =(Button)findViewById( R.id.History );
        ZeroToOne =(ImageButton)findViewById( R.id.ZeroToOne );
        Habit =(ImageButton)findViewById( R.id.TheHobbit );
        Talk =(ImageButton)findViewById( R.id.Alice );

        GoBack.setOnClickListener(this);
        Scintific.setOnClickListener(this);
        Fiction.setOnClickListener(this);
        History.setOnClickListener(this);
        ZeroToOne.setOnClickListener(this);
        Habit.setOnClickListener(this);
        Talk.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == Fiction){
            startActivity(new Intent( this, FictionCategory.class ) );
        }

//      else if(view == GoBack){
//            startActivity(new Intent( this, 'the name of the home page here'.class ) );}
        else if (view == Scintific){
            startActivity(new Intent( this, ScintificCategory.class ) );
        }
        else if (view == History){
            startActivity(new Intent( this, HistoryCategory.class ) );
        }
        else if (view == ZeroToOne){
            startActivity(new Intent( this, Book6Info.class ) );
       }
        else if (view == Habit){
            startActivity(new Intent( this, Book7Info.class ) );
        }
        else if (view == Talk){
            startActivity(new Intent( this, Book8Info.class ) );
        }

    }
    }
}