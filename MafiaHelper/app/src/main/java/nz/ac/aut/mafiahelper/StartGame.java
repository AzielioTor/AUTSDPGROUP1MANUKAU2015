package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class StartGame extends Activity {

    private GameState state;
    EditText numOfPlayers;
    Button button;

    ArrayList<String> playerNames = new ArrayList<String>();
    //playerNames.add();

    Scanner input = new Scanner(System.in);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        numOfPlayers = (EditText) findViewById(R.id.editPlayers);
    }
    public void startMafiaGameClick(View v){
        Intent startMafiaIntent = new Intent(getApplicationContext(), MafiaGame.class);
        startActivity(startMafiaIntent);

        int noPlayers = Integer.parseInt(numOfPlayers.getText().toString());
    }

    public void startNewGame() {
        state = GameState.PLAYING;
    }
}
