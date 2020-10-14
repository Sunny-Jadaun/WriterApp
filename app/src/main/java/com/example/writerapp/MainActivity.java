package com.example.writerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        String para = ("Text\n\n" +
                "Contains predefined text views for different types of text inputs such as label (TextView), password, date, time, number, and e-mail.\n\n" +
                "Button\n\n" +
                "Represents a push widget that registers when the screen is touched within its bounds. some of eg. are ToggleButton, CheckBox, RadioButton, switch, imageButton.\n\n" +
                "Layouts\n\n" +
                "A layout defines the visual structure for a user interface, such as the UI for an activity or app widget. eg. ConstraintLayout, Linear Layout, Relative Layout, GridLayout, FrameLayout, TableLayout.\n\n" +
                "CheckBox\n\n" +
                "A special type of button with a check mark graphic and description text that has two states: checked or unchecked.\n\n" +
                "RadioButton\n\n" +
                "The RadioButton has two states: either checked or unchecked. A RadioGroup is used to group one or more RadioButton views, thereby allowing only one RadioButton to be checked within the RadioGroup.\n\n" +
                "\n\n" +
                "CheckedTextView\n\n" +
                "This is basically a TextView that can be checked and is sometimes used in a ListView.\n\n" +
                "\n\n" +
                "Spinner\n\n" +
                "A drop-down menu is called spinner. The SpinnerView displays one item at a time from a list and enables users to choose from them.\n\n" +
                "Switch\n\n" +
                "The Switch has two possible states that can be read and responded to. An obvious use for the Switch widget would be to show and hide something.\n\n" +
                "\n\n" +
                "Space\n\n" +
                "This is a very simple class, the sole purpose of which is to create gaps within layouts.\n\n" +
                "\n\n" +
                "Text\n\n" +
                "Contains predefined text views for different types of text inputs such as label (TextView), password, date, time, number, and e-mail.\n\n" +
                "\n\n" +
                "TextView\n\n" +
                "The TextView is used to display text to the users and this text information can't be edited by the users. This is the most basic view and one that you will frequently use when you develop Android applications.");
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}