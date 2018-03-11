package com.example.uhylabr.geoquiz;

/**
 * Created by UHYLABR on 2/19/2018.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    public int location;
    public int question;
    public int photoId;
    public boolean isTrue;

    public int getLocation(){return location;}
    public void setLocation(int location){this.location=location;}
    public int getQuestion(){return question;}
    public void setQuestion(int question){this.question=question;}
    public int getPhotoId(){return photoId;}
    public void setPhotoId(int photoId){this.photoId=photoId;}
    public boolean isTrue(){return isTrue;}
    public void setTrue(boolean aTrue){isTrue=aTrue;}

    public Question (int location, int question, int photoId, boolean isTrue){
        this.location=location;
        this.question=question;
        this.photoId=photoId;
        this.isTrue=isTrue;
    }

    public Question(int textResId, boolean answerTrue){
        mTextResId=textResId;
        mAnswerTrue=answerTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }
    }

