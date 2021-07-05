package com.example.ch4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.BindException;

public class SecondScreen extends AppCompatActivity {
    private String[] questions = {"Mount Everest is the highest mountain in the world?","The five rings on the Olympic flag are interlocking?",
    "A dolphin is a fish?", "Dandia is popular dance of Gujarat?","A human sneeze can travel about 100 mph or more?"};
    private boolean[] answers = {true,true,false,true,true};
    private int index = 0;
    int score = 0;
    Button tr;
    Button fl;
    TextView question;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        tr = findViewById(R.id.True);
        fl = findViewById(R.id.False);
        question = findViewById(R.id.question);
        question.setText(questions[index]);

        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index <= questions.length-1){
                    if(answers[index]){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(SecondScreen.this,"Your score is: " +score, Toast.LENGTH_LONG).show();
                    }

                }
                else{
                    Toast.makeText(SecondScreen.this, "Restart the app to play again!", Toast.LENGTH_LONG).show();
                }

                
            }
        });
        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    if(!answers[index]){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(SecondScreen.this, "Your score is: "+score, Toast.LENGTH_LONG).show();
                    }

                }
                else{
                    Toast.makeText(SecondScreen.this, "Restart the app to play again!", Toast.LENGTH_LONG).show();
                }



            }
        });


    }
}