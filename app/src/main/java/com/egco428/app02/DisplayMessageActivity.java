package com.egco428.app02;

import android.graphics.Color;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    ImageView logoImage;
    Button sendButton;
    TextView showTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        showTxt = (TextView)findViewById(R.id.showMsgText);
        logoImage = (ImageView)findViewById(R.id.imageView2);
        sendButton = (Button)findViewById(R.id.sendBtn);

        Bundle intentData = getIntent().getExtras();

        if(intentData == null){
        return;
        }

        String message = intentData.getString(MainActivity.EXTRA_MESSAGE);
        TextView showMessage = (TextView)findViewById(R.id.showMsgText);
        //showMessage.setText(message);
        //showMessage.setTextSize(50);

        int num = Integer.parseInt(message);

        if (num % 2 == 0){
            showMessage.setText("2");
            showMessage.setTextSize(50);
            logoImage.setImageResource(R.drawable.android2);
            showTxt.setTextColor(Color.RED);
        }
        else{
            showMessage.setText("1");
            showMessage.setTextSize(50);
            logoImage.setImageResource(R.drawable.android1);
            showTxt.setTextColor(Color.GREEN);
        }

    }
}
