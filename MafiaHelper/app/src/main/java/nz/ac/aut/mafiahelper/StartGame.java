package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class StartGame extends Activity {

    private GameState state;

    ArrayList<String> playerNames = new ArrayList<String>();
    //playerNames.add();

    Scanner input = new Scanner(System.in);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
    }

    public StartGame(){
        state = GameState.NOT_PLAYING;
    }

    public void startNewGame(){
        state = GameState.PLAYING;

    }

    public void startMafiaGameClick(View v){
        Intent startMafiaIntent = new Intent(getApplicationContext(), MafiaGame.class);
        startActivity(startMafiaIntent);
    }
}
