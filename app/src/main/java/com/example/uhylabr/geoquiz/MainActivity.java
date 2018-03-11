package com.example.uhylabr.geoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private Button mPreviousButton;
    private Button mCheatButton;
    private TextView mQuestionTextView;

    private List<Question> questions;
@Override

protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = findViewById(R.id.recycler_view);
    recyclerView.setHasFixedSize(true);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));

}

private void initialData() {
    questions = new ArrayList<>();
    questions.add(new Question(R.string.australia, R.string.question_australia, R.drawable.australia, isTrue: true));
    questions.add(new Question(R.string.oceans, R.string.question_oceans, R.drawable.oceans, isTrue: true));
    questions.add(new Question(R.string.middle_east, R.string.question_mideast, R.drawable.mideast, isTrue: true));
    questions.add(new Question(R.string.africa, R.string.question_africa, R.drawable.africa, isTrue: true));
    questions.add(new Question(R.string.americas, R.string.question_americas, R.drawable.americas, isTrue: true));
    questions.add(new Question(R.string.asia, R.string.question_asia, R.drawable.asia, isTrue:true));
}

    //having a problem hooking this to question.java
    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_australia, answerTrue:true);
            new Question(R.string.question_oceans, answerTrue:true),
            new Question(R.string.question_mideast, answerTrue:false),
            new Question(R.string.question_africa, answerTrue:false),
            new Question(R.string.question_americas, answerTrue:true),
            new Question(R.string.question_asia, answerTrue:true),
            new Question(R.string.question_antartica, answerTrue:true),

    }

    private int mCurrentIndex = 0;
    private boolean mIsCheater;


    mCurrentIndex=(mCurrentIndex+1)%mQuestionBank.length;
            updateQuestion();
            });

        @Override
        protected void onCreate(Bundle savedInstanceState){

        @Override

        protected void onActivityResult(int RequestCode, Intent data){
            if (resultCode != Activity.RESULT_OK){
                return;
        }
        if (requestCode == REQUEST_CODE_CHEAT){
                if (data == null){
                    return;
        }
        mIsCheater = CheatActivity.wasAnswerShown(data);
            }

        }
        }


    //public boolean navigateUpTo(Intent upIntent) {
      //  return super.navigateUpTo(upIntent);
    //}


        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        private void updateQuestion();

        mTrueButton=(Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
        }
        }
        });

        mFalseButton=(Button)findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            @Override
            public void OnClick(View v){

        }
        }
        }
        });

        mNextButton=(Button)findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View view){
            mCurrentIndex=(mCurrentIndex+1) % mQuestionBank.length;
            updateQuestion();
        });

        mCheatButton=(Button)findViewById(R.id.cheat_button);
        mCheatButton.setOnClickListener(new View.OnClickListener()){
            @Override
            public void OnClick(View view){
        //Intent intent=new intent(package: MainActivity.this,CheatActivity.class);
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();
        Intent intent = CheatActivity.newIntent(package: MainActivity.this, answerIsTrue);
        startActivityForResult(intent, REQUEST_CODE_CHEAT);
        }});

        update Question();
        }
        });}

        private void updateQuestion(){
        int question=mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);}

        private void checkAnswer(boolean userPressedTrue){
            boolean answerIsTrue=mQuestionBank[mCurrentIndex].isAnswerTrue();

    int messageResId=0;

    if (mIsCheater){
        messageResId=R.string.judgement_toast;
        }
        else {
        if (userPressedTrue==answerIsTrue){
        messageResId=R.string.correct_toast;
        }
        else {messageResId=R.string.incorrect_toast;}

        }
        Toast.makeText(context: this, messageResId, Toast.LENGTH_SHORT).show();

        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);

        });
        }

        private void isAnswerTrue {


    }}

            //public static Toast makeText (Context context, int redId, int duration){
            //Toast t = Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT);
            //t.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
            //t.show();
            //Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_SHORT).show();


