package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Scanner;

public class StartGame extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
    }


    public void startMafiaGameClick(View v){
        EditText numPlayers = (EditText) findViewById(R.id.editPlayers);
        String playerData = numPlayers.getText().toString();
        int noOfPlayers = Integer.parseInt(playerData);

        Intent startMafiaIntent = new Intent(StartGame.this, MafiaGame.class);
        startMafiaIntent.putExtra("passNumPlayer", noOfPlayers);
        startActivity(startMafiaIntent);
    }
}
