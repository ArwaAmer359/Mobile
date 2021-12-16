package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class FictionCategory extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoBack =(ImageButton)findViewById( R.id.GoBack );
        Scintific =(Button)findViewById( R.id.Scintific );
        Man =(Button)findViewById( R.id.Man );
        History =(Button)findViewById( R.id.History );
        TheAlchemist =(ImageButton)findViewById( R.id.TheAlchemist );
        TheHobbit =(ImageButton)findViewById( R.id.TheHobbit );
        Alice =(ImageButton)findViewById( R.id.Alice );

        GoBack.setOnClickListener(this);
        Scintific.setOnClickListener(this);
        Man.setOnClickListener(this);
        History.setOnClickListener(this);
        TheAlchemist.setOnClickListener(this);
        TheHobbit.setOnClickListener(this);
        Alice.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == Scintific){
            startActivity(new Intent( this, ScintificCategory.class ) );
        }

//      else if(view == GoBack){
//            startActivity(new Intent( this, 'the name of the home page here'.class ) );}
        else if (view == Man){
            startActivity(new Intent( this, ManCategory.class ) );
        }
        else if (view == History){
            startActivity(new Intent( this, HistoryCategory.class ) );
        }
        else if (view == TheAlchemist){
            startActivity(new Intent( this, Book1Info.class ) );
        }
        else if (view == TheHobbit){
            startActivity(new Intent( this, Book2Info.class ) );
        }
        else if (view == Alice){
            startActivity(new Intent( this, Book3Info.class ) );
        }


    }
}