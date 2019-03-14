package com.bharath.twoactivities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendmessage(View view) {
        EditText msg=(EditText)findViewById(R.id.msg);
        String msg1=msg.getText().toString();
        Intent i=new Intent(getApplicationContext(),SecondActivity.class);
        //startActivity(i);
        i.putExtra("message",msg1);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1)
        {
            if(resultCode==RESULT_OK)
            {
                TextView replyview=(TextView)findViewById(R.id.reply_lable);
                String reply=data.getStringExtra("reply");

                TextView recievedview=(TextView)findViewById(R.id.reply_recieved);
                recievedview.setText(reply);
                recievedview.setVisibility(View.VISIBLE);
                replyview.setVisibility(View.VISIBLE);
            }
        }
    }
}
