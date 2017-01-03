package com.niharikakhanna.app.quiz;

/**
 * Created by Khanna on 26/12/16.
 */

public class Questions {

    private int mImageResId;
    private String mAnswer;
    private boolean mSkipped;

    private boolean mCheated;

    private String[] mOptions = new String[4];

    public Questions(int ImageResId, String answer, String[] options, boolean skipped, boolean cheated) {
        mImageResId = ImageResId;
        mAnswer = answer;
        for (int i = 0; i < 4; i++) {
            mOptions[i] = options[i];
        }
        mSkipped = skipped;
        mCheated = cheated;
    }

    public int getImageResId() {
        return mImageResId;
    }

    public void setImageResId(int imageResId) {
        mImageResId = imageResId;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String answer) {
        mAnswer = answer;
    }

    public String[] getOptions() {
        return mOptions;
    }

    public void setOptions(String[] options) {
        mOptions = options;
    }

    public boolean isSkipped() {
        return mSkipped;
    }

    public void setSkipped(boolean skipped) {
        mSkipped = skipped;
    }

    public boolean isCheated() {
        return mCheated;
    }

    public void setCheated(boolean cheated) {
        mCheated = cheated;
    }


}
