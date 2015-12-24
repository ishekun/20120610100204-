package com.listcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Animation animation;
    View coustomview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coustomview = findViewById(R.id.scrollView);
        button = (Button) findViewById(R.id.button);
        animation = AnimationUtils.loadAnimation(MainActivity.this.anim.animatorset);
    }

    public void onClick(View view) {
        coustomview.startAnimation(animationset);
    }
}




