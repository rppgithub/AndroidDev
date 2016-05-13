package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView cookieView = (ImageView)findViewById(R.id.before_cookie);
        cookieView.setTranslationX(-1000f);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView cookieView = (ImageView)findViewById(R.id.after_cookie);
        //cookieView.animate().translationYBy(1000f).setDuration(2000);
        cookieView.animate().translationXBy(-1000f).setDuration(2000);
        //cookieView.animate().alpha(0f).setDuration(2000);
        //ImageView cookieView2 = (ImageView)findViewById(R.id.after_cookie);
        //cookieView2.animate().alpha(1f).setDuration(2000);
        //cookieView.setImageResource(R.drawable.after_cookie);

        TextView cookieText = (TextView)findViewById(R.id.status_text_view);
        cookieText.setText("I am so full!");




    }
}
