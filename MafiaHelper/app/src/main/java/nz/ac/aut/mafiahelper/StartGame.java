package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class StartGame extends Activity {

    private GameState state;

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

}
