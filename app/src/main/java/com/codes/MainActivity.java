package com.codes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.codes.R;

import static com.codes.R.string.ok;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout Layout=new LinearLayout(this);
        super.setContentView(Layout);
        Layout.setOrientation(LinearLayout.VERTICAL);
        final TextView show=new TextView(this);
        Button bn=new Button(this);
        bn.setText(R.string.ok);
        bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Layout.addView(show);
        Layout.addView(bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("Hello,android," + new java.util.Date());
            }
        });

    }
}
