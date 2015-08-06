package be.glamarca.mobileapps.ouske.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import be.glamarca.mobileapps.ouske.R;


public class MainActivity extends Activity {

    private Button btSaveLocalisation;
    private Button btLocalise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupComponents();
    }

    private void setupComponents(){
        btSaveLocalisation = (Button)findViewById(R.id.btSavePosition);
        btSaveLocalisation.setOnClickListener(getBtSaveLocalisationListener());

        btLocalise = (Button)findViewById(R.id.btLocalise);
        btLocalise.setOnClickListener(getBtLocaliseListener());
    }

    private OnClickListener getBtLocaliseListener() {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showSaveLocalisationIntent = new Intent(MainActivity.this,ChooseLocalisationActivity.class);
                startActivity(showSaveLocalisationIntent);
            }
        };
    }

    private OnClickListener getBtSaveLocalisationListener(){
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showChooseLocalisationIntent = new Intent(MainActivity.this,SaveLocalisationActivity.class);
                startActivity(showChooseLocalisationIntent);
            }
        };
    }

}
