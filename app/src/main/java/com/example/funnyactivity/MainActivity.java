package com.example.funnyactivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TextView mTextViewMessage;
    private Button mButton;
    private Group mGroupVisibility;
    private Button mButtonYes;
    private Button mButtonNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void displayText(View view) {
        mTextViewMessage.setText(getString(R.string.teapa));
        mGroupVisibility.setVisibility(View.VISIBLE);
    }


    private void initView() {
        mButton = findViewById(R.id.button_press);
        mTextViewMessage = findViewById(R.id.text_view_message);
        mGroupVisibility = findViewById(R.id.group_visibility);
        mButtonYes = findViewById(R.id.button_yes);
        mButtonNo = findViewById(R.id.button_no);
    }

    public void yesAction(View view) {
        mButtonYes.setText(getString(R.string.button_teapa));
        mButtonYes.setTypeface(Typeface.DEFAULT_BOLD);
        mButtonYes.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        mButtonYes.setBackgroundColor(Color.parseColor(getString(R.string.red)));
        mButtonYes.setTextColor(Color.parseColor(getString(R.string.white)));
    }

    public void noAction(View view) {
        this.recreate();
    }
}
