package nz.ac.aut.mafiahelper;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * @author Aziel Shaw
 * @version 1.2 - Added for EJ my friend.
 */
public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Removal of Action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main_menu, menu);
       return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       // if (id == R.id.action_settings) {
       //     return true;
       // }

        return super.onOptionsItemSelected(item);
    }

    //Button for Start Game Activity
    public void startGameClick(View v){
        Intent startGmeIntent = new Intent(getApplicationContext(), StartGame.class);
        startActivity(startGmeIntent);
    }

    //Button for Options Fragment
    public void optionsClick(View v){

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction ft = fragmentManager.beginTransaction();
        Options optFrag = new Options();

        ft.add(R.id.main_id, optFrag);
        ft.commit();

    }

    //Button for roles Activity
    public void rolesClick(View v){
        Intent rolesIntent = new Intent(getApplicationContext(), Roles.class);
        startActivity(rolesIntent);
    }


}
