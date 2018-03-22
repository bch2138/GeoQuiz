package com.example.uhylabr.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private Button mPreviousButton;
    private Button mCheatButton;
    private TextView mQuestionTextView;
    private int mCurrentIndex = 0;
    private static final int REQUEST_CODE_CHEAT=0;
    private boolean mIsCheater;
    //private int requestCode;
    //private int resultCode;

    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_australia, true),
            new Question(R.string.question_oceans, true),
            new Question(R.string.question_mideast, false),
            new Question(R.string.question_africa, false),
            new Question(R.string.question_americas, true),
            new Question(R.string.question_asia, true),};



protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
    updateQuestion();

    mTrueButton=(Button)findViewById(R.id.true_button);
    mTrueButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick (View view) {

            checkAnswer(true);
        }});

    mFalseButton=(Button)findViewById(R.id.false_button);
    mFalseButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick (View view){

            checkAnswer( false);
        }});

    mNextButton=(Button)findViewById(R.id.next_button);
    mNextButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick (View view){
        mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
            updateQuestion();}});

    mPreviousButton=(Button)findViewById(R.id.previous_button);
    mPreviousButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick (View view){
        mCurrentIndex = (mCurrentIndex - 1) % mQuestionBank.length;
            updateQuestion();

    mCheatButton=(Button)findViewById(R.id.cheat_button);
    mCheatButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick (View v){
            boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();
            Intent intent = CheatActivity.newIntent(MainActivity.this, answerIsTrue);
            startActivityForResult(intent, REQUEST_CODE_CHEAT);}});}

        protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (resultCode != Activity.RESULT_OK){
            return;
        }
        if (requestCode == REQUEST_CODE_CHEAT){
            if (data == null){
                return;
            }
            mIsCheater = CheatActivity.wasAnswerShown(data);
        }}});}

        private void updateQuestion(){
            int question = mQuestionBank[mCurrentIndex].getTextResId();
            mQuestionTextView.setText(question);
        }

        private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();

        int messageResId = 0;
                if (mIsCheater){messageResId=R.string.judgment_toast;
                }
                else {
                if (userPressedTrue==answerIsTrue){
                    messageResId=R.string.correct_toast;
                }
                else {messageResId=R.string.incorrect_toast;}
                Toast.makeText(MainActivity.this, messageResId, Toast.LENGTH_SHORT).show();}}}



        //@Override
          //      public void onStart(){}










