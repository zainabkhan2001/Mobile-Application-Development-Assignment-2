package com.example.task2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    int ch=1;
    int ch1 = 1;
    float font=30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t= (TextView) findViewById(R.id.textView);
        Button b1= (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { t.setTextSize(font); font = font + 5;
                if (font == 50) font = 30;
            }
        });
        Button b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { switch (ch) {
                case 1:
                    t.setTextColor(Color.RED);
                    break;
                case 2:
                    t.setTextColor(Color.GREEN);
                    break;
                case 3:
                    t.setTextColor(Color.BLUE);
                    break;
                case 4:
                    t.setTextColor(Color.CYAN);
                    break;
                case 5:
                    t.setTextColor(Color.YELLOW);
                    break;
                case 6:
                    t.setTextColor(Color.MAGENTA);
                    break;
            }
                ch++;
                if (ch == 7)
                    ch = 1;


            } });

            Button b3 = (Button) findViewById(R.id.button3);
            b3.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    switch (ch1) {

                        case 1:

                            t.setTypeface(Typeface.MONOSPACE);
                            break;

                        case 2:

                            t.setTypeface(Typeface.SANS_SERIF);
                            break;

                        case 3:
                            t.setTypeface(Typeface.DEFAULT_BOLD);
                            break;

                        case 4:
                            t.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                            break;
                    }

                    ch1++;
                    if (ch1 == 5)
                        ch1 = 1;

                }

            });
        }
    }
