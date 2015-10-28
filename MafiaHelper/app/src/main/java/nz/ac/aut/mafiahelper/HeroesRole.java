package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HeroesRole extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
    }

    public void nextClick(View v){
        Intent nxtIntent = new Intent(getApplicationContext(), HeroesRole2.class);
        startActivity(nxtIntent);
    }

    public void exitClick(View v){
        Intent exitIntent = new Intent(getApplicationContext(), Role.class);
        startActivity(exitIntent);
    }
}
