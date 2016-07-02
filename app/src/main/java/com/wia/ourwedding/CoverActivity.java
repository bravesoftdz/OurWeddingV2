package com.wia.ourwedding;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class CoverActivity extends Activity {

    TextView slideHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);
        slideHere = (TextView) findViewById(R.id.slideHere);
        slideHere.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            @Override
            public void onSwipeLeft() {
                Intent location = new Intent(CoverActivity.this, Location.class);
                CoverActivity.this.startActivity(location);
            }
        });
    }

}
