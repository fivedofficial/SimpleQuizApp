package www.fived.pk.simplequizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static www.fived.pk.simplequizapp.CategorySelection.selectedcategory;

public class MainActivity extends AppCompatActivity {


    Button answer1, answer2, answer3, answer4;

    TextView score, question;


    private Question mQuestion =  new Question();
    private QuestionTwo mQuestionTwo = new QuestionTwo();

    private String mAnswer;
    private int mScore = 0;


    private int mQuestionLength = mQuestion.myQuestion.length;
    private int mQuestionLengthTwo = mQuestionTwo.myQuestionTwo.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);


        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);



        score.setText("Score: " + mScore);

        if (selectedcategory == "category1"){
            updateCurrentQuestion(r.nextInt(mQuestionLength));
        }else if(selectedcategory == "category2"){
            updateCurrentQuestionTwo(r.nextInt(mQuestionLengthTwo));
        }



        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer1.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);

                    if (selectedcategory == "category1"){
                        updateCurrentQuestion(r.nextInt(mQuestionLength));
                    }else if(selectedcategory == "category2"){
                        updateCurrentQuestionTwo(r.nextInt(mQuestionLengthTwo));
                    }

                }else{
                    gameisover();
                }
            }
        });


        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);

                    if (selectedcategory == "category1"){
                        updateCurrentQuestion(r.nextInt(mQuestionLength));
                    }else if(selectedcategory == "category2"){
                        updateCurrentQuestionTwo(r.nextInt(mQuestionLengthTwo));
                    }

                }else{
                    gameisover();
                }

            }
        });


        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);

                    if (selectedcategory == "category1"){
                        updateCurrentQuestion(r.nextInt(mQuestionLength));
                    }else if(selectedcategory == "category2"){
                        updateCurrentQuestionTwo(r.nextInt(mQuestionLengthTwo));
                    }

                }else{
                    gameisover();
                }

            }
        });


        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer4.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);

                    if (selectedcategory == "category1"){
                        updateCurrentQuestion(r.nextInt(mQuestionLength));
                    }else if(selectedcategory == "category2"){
                        updateCurrentQuestionTwo(r.nextInt(mQuestionLengthTwo));
                    }

                }else{
                    gameisover();
                }

            }
        });
    }

    private void gameisover() {
        AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogbuilder
                .setMessage("Your Game is over " + mScore + " Score")
                .setCancelable(false)
                .setPositiveButton("Start New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }
                })
                .setNegativeButton("Back to Selection", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                            onBackPressed();
                    }
                });
        AlertDialog alertDialog = alertDialogbuilder.create();
        alertDialog.show();

    }


    private void updateCurrentQuestion(int i) {

        question.setText(mQuestion.getQuestion(i));

        answer1.setText(mQuestion.getChoice1(i));
        answer2.setText(mQuestion.getChoice2(i));
        answer3.setText(mQuestion.getChoice3(i));
        answer4.setText(mQuestion.getChoice4(i));

        mAnswer = mQuestion.getCorrectAnswer(i);



    }


    private void updateCurrentQuestionTwo(int i) {

        question.setText(mQuestionTwo.getQuestionTwo(i));

        answer1.setText(mQuestionTwo.getChoice1(i));
        answer2.setText(mQuestionTwo.getChoice2(i));
        answer3.setText(mQuestionTwo.getChoice3(i));
        answer4.setText(mQuestionTwo.getChoice4(i));

        mAnswer = mQuestionTwo.getCorrectAnswer(i);



    }
}
