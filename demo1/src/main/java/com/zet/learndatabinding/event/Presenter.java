package com.zet.learndatabinding.event;

import android.util.Log;
import android.view.View;

public class Presenter {
    private static final String TAG = "Presenter";

    public void onSaveClick(Task task) {
        Log.d(TAG, "onSaveClick: click2 execute ...");
    }

    public void onSaveClick(View view, Task task) {
        Log.d(TAG, "onSaveClick: click3 execute ...");
    }

    public void onCompletedChanged(View view, Task task, boolean completed) {
        Log.d(TAG, "onCompletedChanged: click4 execute ..." + completed);
    }

    public boolean onLongClick(View view, Task task){
        Log.d(TAG, "onLongClick: click5 ...");
        return false;
    }

    public void doSomething(View view){
        Log.d(TAG, "doSomething: click6 ...");
    }
}
