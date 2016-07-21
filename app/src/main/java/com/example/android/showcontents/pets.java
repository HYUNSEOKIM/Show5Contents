package com.example.android.showcontents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class pets extends AppCompatActivity {

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
            Message += "\nTitle : The Secret Life of Pets\n";
        }

        if (genre){
            Message += "\nGenre : Comedy/Animation\n";
        }

        if (story){
            Message += "\nStory : Max (Louis C.K.) is a spoiled terrier who enjoys a comfortable life in a New York building until his owner adopts Duke, a giant and unruly canine. " +
                    "\nDuring their walk outside, they encounter a group of ferocious alley cats and wind up in a truck that's bound for the pound." +
                    "\n Luckily, a rebellious bunny named Snowball swoops in to save the doggy duo from captivity. " +
                    "\nIn exchange, Snowball demands that Max and Duke join his gang of abandoned pets on a mission against the humans who've done them wrong.\n";
        }

        if (release){
            Message += "\nInitial Relase : July 8, 2016 (USA)\n";
        }
        if (production){
            Message += "\nProduction Company : Illumination Entertainment\n";
        }

        return Message;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.text_view);
        orderSummaryTextView.setText(message);
    }
}
