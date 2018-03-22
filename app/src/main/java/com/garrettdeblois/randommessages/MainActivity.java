package com.garrettdeblois.randommessages;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initialize Button

        final Button button1 = (Button) findViewById(R.id.button);

        // Initialize TextView

        final TextView Message = (TextView) findViewById(R.id.textView);

        // Implementing code into button

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //Declaring the string array for the quotes and authors
               String[] Quotes;
               //Declaring the size of the array
               Quotes = new String[10];
               //Formatting and putting the quotes into each string of the array
               Quotes[0] = "\"To succeed in life, you need two things: \nignorance and confidence\" \n\n- Mark Twain";
               Quotes[1] = "\"Success consists of going from failure to failure \nwithout loss of enthusiasm\" \n\n– Winston Churchill";
               Quotes[2] = "\"The starting point of all achievement is desire\" \n\n– Napoleon Hill";
               Quotes[3] = "\"I’ve failed over and over and over again in my life and \nthat is why I succeed\" \n\n– Michael Jordan";
               Quotes[4] = "\"Happiness lies in the joy of achievement and the thrill \nof creative effort\" \n\n– Franklin D. Roosevelt";
               Quotes[5] = "\"In order to succeed, your desire for success should be greater than your fear of failure\" \n\n– Bill Cosby";
               Quotes[6] = "\"Success is a lousy teacher. It seduces smart people \ninto thinking they can’t lose\" \n\n– Bill Gates";
               Quotes[7] = "\"Success depends upon previous preparation, and \nwithout such preparation there is sure to be failure\" \n\n– Confucius";
               Quotes[8] = "\"Action is the foundational key to all success\" \n\n– Pablo Picasso";
               Quotes[9] = "\"Strive not to be a success, but rather to be of value\" \n\n– Albert Einstein";


               //Creating the code to make the random selection possible
               Random random = new Random();
               int index = random.nextInt(Quotes.length);

               // setting the TextView to a random quote from the string array
               Message.setText(Quotes[index]);



               //  **Color Portion of the Code**



               //Assigning the RelativeLayout a name
               RelativeLayout RL = (RelativeLayout)findViewById(R.id.RelativeLayout);


               //Declaring the Integer array for the background colors
               Integer[] Colors;
               //Declaring the size of the array
               Colors = new Integer[13];


               //Parsing the colors from hex values into the actual color and then putting the colors into the array

               Colors[0] = Color.parseColor("#39add1"); // Light Blue
               Colors[1] = Color.parseColor("#3079ab"); // Dark Blue
               Colors[2] = Color.parseColor("#c25975"); // Mauve
               Colors[3] = Color.parseColor("#e15258"); // Red
               Colors[4] = Color.parseColor("#f9845b"); // Orange
               Colors[5] = Color.parseColor("#838cc7"); // Lavender
               Colors[6] = Color.parseColor("#7d669e"); // Purple
               Colors[7] = Color.parseColor("#53bbb4"); //Aqua
               Colors[8] = Color.parseColor("#51b46d"); //Green
               Colors[9] = Color.parseColor("#e0ab18"); // Mustard
               Colors[10] = Color.parseColor("#637a91"); // Dark Gray
               Colors[11] = Color.parseColor("#f092b0"); // Pink
               Colors[12] = Color.parseColor("#b7c0c7"); // Light Gray

               //Reusing the code from above to make the random color selection possible
               int colorIndex = random.nextInt(Colors.length);

               // Setting the random relative layout background color

               RL.setBackgroundColor(Colors[colorIndex]);

           }
       });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
