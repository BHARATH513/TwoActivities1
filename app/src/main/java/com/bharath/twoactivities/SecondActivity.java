package com.bharath.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String LOG_TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(LOG_TAG,"------");
        Log.d(LOG_TAG,"onCreate");
        Intent in=getIntent();
        String msg=in.getStringExtra("message");
        TextView msgView=(TextView)findViewById(R.id.msg_received);
        msgView.setText(msg);
    }
    public void reply_message(View view) {
        EditText replyview=(EditText)findViewById(R.id.reply_msg);
        String reply=replyview.getText().toString();
        Intent replyintent=new Intent();
        replyintent.putExtra("reply",reply);
        setResult(RESULT_OK,replyintent);
        finish();
    }
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"onStart");
    }
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"onPause");
    }
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"onRestart");
    }
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG,"onStop");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG,"onDestroy");
    }
}
