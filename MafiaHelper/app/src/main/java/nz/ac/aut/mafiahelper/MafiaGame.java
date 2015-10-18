package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MafiaGame extends Activity {

    private static final int NUM_COLS = 1;
    private GameState state;
    //private int NUM_ROWS = numOfPlayers;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafia_game);
        Intent startMafiaIntent = getIntent();
        int numOfPlayers = startMafiaIntent.getIntExtra("", 0);
        playerSetButtons(numOfPlayers);
    }

    public void playerSetButtons(int numOfPlayers){
        //Table, making of new table
        TableLayout table = (TableLayout) findViewById(R.id.playerTable);
        for(int row = 0; row < numOfPlayers; row++){
            TableRow playerRow = new TableRow(this);
            playerRow.setLayoutParams(new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.MATCH_PARENT, 1.0f
            ));
            table.addView(playerRow);

          for(int col = 0; col < NUM_COLS; col++){
                //Buttons, Scaling on the new table
                Button playerBttns = new Button(this);
                playerBttns.setLayoutParams(new TableRow.LayoutParams(
                        TableRow.LayoutParams.MATCH_PARENT,
                        TableRow.LayoutParams.MATCH_PARENT, 1.0f
                ));
                playerRow.addView(playerBttns);
            }
        }
    }

   public MafiaGame (){
       state = GameState.NOT_PLAYING;
   }

    public void startingGame(){
        state = GameState.PLAYING;
    }



}
