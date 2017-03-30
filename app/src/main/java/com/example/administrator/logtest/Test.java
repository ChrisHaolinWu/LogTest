package com.example.administrator.logtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Test extends AppCompatActivity {
private static final String ACTIVITY_TAG="Test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        Button btn=(Button)findViewById(R.id.press);
        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.v(Test.ACTIVITY_TAG,"This is Verbose.");
                Log.d(Test.ACTIVITY_TAG,"This is Debug.");
                Log.i(Test.ACTIVITY_TAG,"This is Info");
                Log.w(Test.ACTIVITY_TAG,"This is Warn");
                Log.e(Test.ACTIVITY_TAG,"This is Error");
            }
    });
    }
}
