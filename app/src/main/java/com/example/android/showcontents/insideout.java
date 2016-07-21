package com.example.android.showcontents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class insideout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dory);
        Button button = (Button) findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    public void back(View view) {

                Toast.makeText(insideout.this, "Back button is clicked!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(".MainActivity");
                startActivity(intent);
    }

    public void enter(View view){

        CheckBox Title = (CheckBox) findViewById(R.id.title);
        boolean hasTitle = Title.isChecked();

        CheckBox Genre = (CheckBox) findViewById(R.id.genre);
        boolean hasGenre = Genre.isChecked();

        CheckBox Story = (CheckBox) findViewById(R.id.story);
        boolean hasStory = Story.isChecked();

        CheckBox Initial_Release = (CheckBox) findViewById(R.id.initial_release);
        boolean hasInitialRelease = Initial_Release.isChecked();

        CheckBox Production_Company = (CheckBox) findViewById(R.id.production);
        boolean hasProductionCompany = Production_Company.isChecked();

        String Message = createMessage(hasTitle,hasGenre,hasStory,hasInitialRelease,hasProductionCompany);
        displayMessage(Message);
    }

    private String createMessage(boolean title, boolean genre, boolean story, boolean release, boolean production){
        String Message = "";
        if (title){
            Message += "\nTitle : Inside Out\n";
        }

        if (genre){
            Message += "\nGenre :  Fantasy/Comedy-drama\n";
        }

        if (story){
            Message += "\nStory : Riley (Kaitlyn Dias) is a happy, hockey-loving 11-year-old Midwestern girl, but her world turns upside-down when she and her parents move to San Francisco." +
                    "\n Riley's emotions -- led by Joy (Amy Poehler) -- try to guide her through this difficult, life-changing event." +
                    "\nHowever, the stress of the move brings Sadness (Phyllis Smith) to the forefront." +
                    "\nWhen Joy and Sadness are inadvertently swept into the far reaches of Riley's mind, the only emotions left in Headquarters are Anger, Fear and Disgust.\n";
        }

        if (release){
            Message += "\nInitial Relase : June 17, 2015 (France)\n";
        }
        if (production){
            Message += "\nProduction Company : Pixar, Walt Disney Pictures\n";
        }

        return Message;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.text_view);
        orderSummaryTextView.setText(message);
    }
}
