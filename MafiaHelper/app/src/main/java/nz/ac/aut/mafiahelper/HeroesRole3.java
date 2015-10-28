package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HeroesRole3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_role3);
    }

    public void bckClick2(View v){
        Intent bckClickIntent2 = new Intent(getApplicationContext(), HeroesRole2.class);
        startActivity(bckClickIntent2);
    }

    public void extClick2(View v){
        Intent extClickIntent2 = new Intent(getApplicationContext(), HeroesRole2.class);
        startActivity(extClickIntent2);
    }
}
