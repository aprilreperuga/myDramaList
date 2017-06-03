package ph.edu.up.mydramalist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_add_drama);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        final EditText editTextTitle = (EditText) findViewById(R.id.editTextTitle);
        final EditText editTextGenre = (EditText) findViewById(R.id.editTextGenre);
        final EditText editTextNative = (EditText) findViewById(R.id.editTextNative);
        final EditText editTextCountry = (EditText) findViewById(R.id.editTextCountry);
        final EditText editTextEpisodes = (EditText) findViewById(R.id.editTextEpisodes);
        final EditText editTextDateAired = (EditText) findViewById(R.id.editTextDateAired);
        final EditText editTextDescription = (EditText) findViewById(R.id.editTextDescription);

    }

}

