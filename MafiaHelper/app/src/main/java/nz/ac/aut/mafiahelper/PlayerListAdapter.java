package nz.ac.aut.mafiahelper;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Aziel on 28-Oct-15.
 */
public class PlayerListAdapter extends ArrayAdapter {
    private String playerName;
    private Role playerRole;
    private boolean alive;

    public PlayerListAdapter(Context context, int resource, String name, Role role) {
        super(context, resource);
        this.playerName = name;
        this.playerRole = role;
        this.alive = true;
    }

    public void killButton() {
        this.alive = !alive;
    }

    public void changeName(String name) {
        if(name != null || !name.equals(""))
            this.playerName = name;
    }

    public void assignRole(Role role) {
        this.playerRole = role;
    }
}
