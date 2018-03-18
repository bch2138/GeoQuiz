package com.example.uhylabr.geoquiz;

import android.app.Activity;
import android.content.Context;
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
    private boolean mIsCheater;


@Override

protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (resultCode != Activity.RESULT_OK){
            return;
        }
        if (requestCode == REQUEST_CODE_CHEAT){
            if (data == null){
                return;
            }
            mIsCheater = CheatActivity.wasAnswerShown(data);
        }
    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_australia, true),
            new Question(R.string.question_oceans, true),
            new Question(R.string.question_mideast, false),
            new Question(R.string.question_africa, false),
            new Question(R.string.question_americas, true),
            new Question(R.string.question_asia, true),

    mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
    int question = mQuestionBank[mCurrentIndex].getmTextResId();
    mQuestionTextView.setText(question);


    mTrueButton=(Button)findViewById(R.id.true_button);
    mTrueButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void OnClick (View v){

        private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue=mQuestionBank[mCurrentIndex].isAnswerTrue();}


    mFalseButton=(Button)findViewById(R.id.false_button);
    mFalseButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void OnClick (View v){

        private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue=mQuestionBank[mCurrentIndex].isAnswerTrue();}


        mNextButton=(Button)findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void OnClick (View v){

        mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);

        private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();

        int messageResId = 0;
               if (userPressedTrue == answerIsTrue) {
                  messageResId=R.string.correct_toast;}
                  else {messageResId=R.string.incorrect_toast;}
                  Toast.makeText(MainActivity.this, messageResId, Toast.LENGTH_SHORT).show();
                                               }
                                               });

        int messageResId=0;
                if (mIsCheater){
                    messageResId=R.string.judgement_toast;
                }

            else {
                if (userPressedTrue==answerIsTrue){
                    messageResId=R.string.correct_toast;
                }
                else {messageResId=R.string.incorrect_toast;}


        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);

        mCheatButton=(Button)findViewById(R.id.cheat_button);
        mCheatButton.setOnClickListener(new View.OnClickListener()){

        @Override
        public void OnClick (View v){

        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();
        Intent intent = CheatActivity.newIntent(package: MainActivity.this, answerIsTrue);
        startActivityForResult(intent, REQUEST_CODE_CHEAT);}});
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);}

        @Override
                public void onStart(){}










