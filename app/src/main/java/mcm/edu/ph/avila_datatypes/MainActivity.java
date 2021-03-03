package mcm.edu.ph.avila_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);

        String firstName = "Mico";
        char middleInitial = ' ';
        String lastName = "Avila";
        int myAge = 17;
        float myDreamTVLGrade = 90.0f;
        double myMoney = 212121.21;

        display.setText("My Name is "+
                firstName+ " "+
                middleInitial+ " "+
                lastName+ "\nand my age is "+
                myAge+".\n i want my grade in TVL3 to be "+
                String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;

    }
}