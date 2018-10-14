package aliasproject.com.alias;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import aliasproject.com.alias.game.Complexity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRules(View view) {
        Intent rules = new Intent(MainActivity.this, Rules.class);
        startActivity(rules);
    }

    public void selectDifficulty(int numMembers){
        Intent difficulty = new Intent (MainActivity.this, Complexity.class);
        difficulty.putExtra("numberOfMembers", numMembers);
        startActivity(difficulty);
    }

    public void setTwoMembers(View view){
        selectDifficulty(2);
    }

    public void setFourMembers(View view){
        selectDifficulty(4);
    }
}
