package com.huami.wangjingzhou.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent=getIntent();
        String message= intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
//        TextView textView= new TextView(this);
//        textView.setText(message);

        TextView textView_show= (TextView)findViewById(R.id.show);
        textView_show.setText(message);

//        RelativeLayout layout=(RelativeLayout)findViewById(R.id.content);
//        layout.addView(textView);

    }


}
