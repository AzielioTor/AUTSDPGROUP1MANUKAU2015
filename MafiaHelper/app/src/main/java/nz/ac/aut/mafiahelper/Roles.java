package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Roles extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roles);
        }

    public void heroClick(View v){
        Intent heroIntent = new Intent(getApplicationContext(), Heroes.class);
        startActivity(heroIntent);
    }

    public void villClick(View v){
        Intent villIntent = new Intent(getApplicationContext(), Villans.class);
        startActivity(villIntent);

    }

    public void neutClick(View v){
        Intent neutClick = new Intent(getApplicationContext(), Neutrals.class);
        startActivity(neutClick);

    }
}

