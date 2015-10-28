package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HeroesRole2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes2);
    }

    public void nextClick2(View v){
        Intent nextClickIntent2 = new Intent(getApplicationContext(), HeroesRole3.class);
        startActivity(nextClickIntent2);
    }

    public void bckClick(View v){
        Intent bckClickIntent = new Intent(getApplicationContext(), HeroesRole.class);
        startActivity(bckClickIntent);
    }



}
