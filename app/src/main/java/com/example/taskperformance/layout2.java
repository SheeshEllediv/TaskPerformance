package com.example.taskperformance;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class layout2 extends Activity {
    TextView t;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        Intent secondActivity = getIntent();
        t = (TextView) findViewById(R.id.msg_text_view);
        String result = secondActivity.getStringExtra("same");
        t.setText(result);

    }
}
