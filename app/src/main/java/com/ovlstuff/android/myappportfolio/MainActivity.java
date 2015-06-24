package com.ovlstuff.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays a message with the Button text appended to it
     * @param view instance of android.widget.Button that was clicked
     * @throws IllegalArgumentException if View is not an instance of an android.widget.Button
     */
    public void showMessage(View view) {
        if (view instanceof Button) {
            Button button = (Button)view;
            Context context = getApplicationContext();
            CharSequence text = "This button will launch my "
                    + button.getText().toString().toLowerCase()
                    +  " app!";
            int duration = Toast.LENGTH_SHORT;

            Toast.makeText(context, text, duration).show();
        } else {
            throw new IllegalArgumentException("View of type android.widget.Button expected");
        }

    }
}
