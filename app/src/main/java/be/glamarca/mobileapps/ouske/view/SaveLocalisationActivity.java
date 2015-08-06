package be.glamarca.mobileapps.ouske.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import be.glamarca.mobileapps.ouske.R;

/**
 * Created by sarace on 5/08/15.
 */
public class SaveLocalisationActivity extends Activity{

    private Button btSaveLocalisation;
    private Spinner spinChooseGroupe;
    private EditText editLocalisationName;

    private String localisationName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_localisation);
        setupComponents();
    }

    private void setupComponents() {
        btSaveLocalisation = (Button)findViewById(R.id.btSaveLocalisationNow);
        btSaveLocalisation.setOnClickListener(getBtSaveLocationListener());

        spinChooseGroupe = (Spinner)findViewById(R.id.groupSpinner);

        editLocalisationName = (EditText)findViewById(R.id.localisationName);
    }

    private OnClickListener getBtSaveLocationListener() {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                localisationName = editLocalisationName.getText().toString();
                System.out.println(localisationName);
            }
        };
    }

}
