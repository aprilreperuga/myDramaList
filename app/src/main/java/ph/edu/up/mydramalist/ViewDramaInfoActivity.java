package ph.edu.up.mydramalist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ViewDramaInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_drama_info);
        Intent intent = getIntent();

        String title = intent.getStringExtra(MainActivity.TITLE);
        String description  = intent.getStringExtra(MainActivity.DESCRIPTION);

        TextView titleTextView = (TextView) findViewById(R.id.editTextTitle);
        titleTextView.setText(title);

        TextView descriptionTextView = (TextView) findViewById(R.id.editTextDescription);
        descriptionTextView.setText(description);
    }
}
