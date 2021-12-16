package com.example.myapplication;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class Book8Info extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book8_info);

        Download =(ImageButton)findViewById( R.id.Download );
        //       Buy =(Button)findViewById( R.id.Buy );
        Play =(Button)findViewById( R.id.play );
        Pause =(Button)findViewById( R.id.pause );

        Download.setOnClickListener(this);
        //      Buy.setOnClickListener(this);
        Play.setOnClickListener(this);
        Pause.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        //       if (view == Buy){
        //         startService(new Intent( this, BackgroundSound1.class ) );
        //    }

      else if(view == Download){
            manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse("file:///D:/android/project/app/src/main/res/raw/Talk.pdf");
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
            long reference = manager.enqueue(request);
        else if (view == Play){
                startActivity(new Intent( this, BackgroundSound3.class ) );
            }
            else if (view == Pause){
                stopService(new Intent( this, BackgroundSound3.class ) );

            }
        }
    }
    }
}