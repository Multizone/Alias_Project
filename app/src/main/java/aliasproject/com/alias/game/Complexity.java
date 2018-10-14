package aliasproject.com.alias.game;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import aliasproject.com.alias.R;

public class Complexity extends AppCompatActivity {

    TextView tvView;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complexity);

        tvView = (TextView) findViewById(R.id.quantityOfMembers);

        Bundle arguments = getIntent().getExtras();
        number = arguments.getInt("numberOfMembers");
        tvView.setText("Количество участников: " + number);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void startGame(View view){
        Intent beginning = new Intent(Complexity.this, Game.class);
        startActivity(beginning);
    }
}
