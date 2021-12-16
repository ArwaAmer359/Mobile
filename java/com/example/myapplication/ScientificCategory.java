package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class ScientificCategory extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_category);

        GoBack =(ImageButton)findViewById( R.id.GoBack );
        Fiction =(Button)findViewById( R.id.Fiction );
        Man =(Button)findViewById( R.id.Man );
        History =(Button)findViewById( R.id.History );
        Herb =(ImageButton)findViewById( R.id.Herp );
        Mind =(ImageButton)findViewById( R.id.Mind );


        GoBack.setOnClickListener(this);
        Fiction.setOnClickListener(this);
        Man.setOnClickListener(this);
        History.setOnClickListener(this);
        Herb.setOnClickListener(this);
        Mind.setOnClickListener(this);

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
        else if (view == History){
            startActivity(new Intent( this, HistoryCategory.class ) );
        }
        else if (view == Herb){
            startActivity(new Intent( this, Book4Info.class ) );
        }
        else if (view == Mind){
            startActivity(new Intent( this, Book5Info.class ) );
        }

    }
    }
}