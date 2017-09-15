package com.artear.multitrackerandroid.trackers;

import android.content.Context;
import android.util.Log;

import com.artear.multitracker.contract.send.TrackerSend;
import com.artear.multitracker.ContextTracker;


public class AnalyticsTracker extends ContextTracker {

    public AnalyticsTracker(Context context){
        super(context);
    }

    @Override
    public void send(TrackerSend params) {
        Log.d("AnalyticsTracker", "Send params to some place. Param = " + params.toString());
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }
}