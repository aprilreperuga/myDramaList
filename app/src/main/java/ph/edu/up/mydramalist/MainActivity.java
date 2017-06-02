package ph.edu.up.mydramalist;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String TITLE = "ph.edu.up.mydramalist.TITLE";
    public final static String DESCRIPTION = "ph.edu.up.mydramalist.DESCRIPTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        EditAddActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_edit) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void viewDrama(View view) {
        String viewString = view.toString();
        int id = view.getId();
        String idString = view.getResources().getResourceName(view.getId());
        Log.w("SENDER", viewString);
        Log.e("SENDER", String.valueOf(id));
        if (id == R.id.list_item_1) {
            Log.i("SENDER", "First Item is Pressed");
            Log.e("SENDER", idString);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list_item_1);
            int childrenCount = linearLayout.getChildCount();
            Log.v("SENDER", String.valueOf(childrenCount)+ "children");
            ImageView imageView = (ImageView) linearLayout.getChildAt(0);
            String imageString = imageView.getDrawable().toString();
            Log.v("SENDER", "image: "+imageString);
            LinearLayout linearLayout1 = (LinearLayout) linearLayout.getChildAt(1);
            int grandChildrenCount = linearLayout1.getChildCount();
            Log.v("SENDER", String.valueOf(grandChildrenCount)+" grand children");
            TextView textView = (TextView) linearLayout1.getChildAt(0);
            String title = textView.getText().toString();
            TextView textView1 = (TextView) linearLayout1.getChildAt(1);
            String description = textView1.getText().toString();
            Log.v("SENDER", "title: " + title);
            Log.v("SENDER", "description: "+description);

            Intent intent = new Intent(this, ViewDramaActivity.class);
            intent.putExtra(TITLE, title);
            intent.putExtra(DESCRIPTION, description);
            startActivity(intent);

        }
        if (id == R.id.list_item_13) {
            Log.i("SENDER", "Last item is pressed");
            Log.e("SENDER", idString);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list_item_13);
            int childrenCount = linearLayout.getChildCount();
            Log.v("SENDER", String.valueOf(childrenCount)+" children");
        }


    }
}
