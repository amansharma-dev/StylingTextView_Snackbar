package com.example.stylingtextview_snackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onclickSnackbar(View view) {
        Snackbar.make(view,"Follow me On Github",Snackbar.LENGTH_LONG).setAction("Ok !", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastIt();
            }
        }).show();
    }

    private void toastIt(){
        Toast.makeText(getApplicationContext(),"Thank you, Stay Connected.",Toast.LENGTH_SHORT).show();
    }
}
