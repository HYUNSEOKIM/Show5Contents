package com.example.android.showcontents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class zootopia extends AppCompatActivity {

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
                Message += "\nTitle : Zootopia\n";
        }

        if (genre){
            Message += "\nGenre : Action/Adventure\n";
        }

        if (story){
            Message += "\nStory : From the largest elephant to the smallest shrew, the city of Zootopia is a mammal metropolis where various animals live and thrive." +
                    "\nWhen Judy Hopps (Ginnifer Goodwin) becomes the first rabbit to join the police force, she quickly learns how tough it is to enforce the law." +
                    "\nDetermined to prove herself, Judy jumps at the opportunity to solve a mysterious case." +
                    "\nUnfortunately, that means working with Nick Wilde (Jason Bateman), a wily fox who makes her job even harder.\n";
        }

        if (release){
            Message += "\nFebruary 10, 2016 (Belgium)\n";
        }
        if (production){
            Message += "\nProduction Company : Walt Disney Animation Studios, Walt Disney Pictures\n";
        }

        return Message;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.text_view);
        orderSummaryTextView.setText(message);
    }
}
