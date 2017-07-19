package com.example.moustafamamdouh.joketellingapp;

import android.os.Handler;
import android.support.annotation.Nullable;

import com.example.moustafamamdouh.joketellingapp.IdlingResource.SimpleIdlingResource;

/**
 * Created by Moustafa.Mamdouh on 7/19/2017.
 */

class MessageDelayer {

    private static final int DELAY_MILLIS = 3000;

    interface DelayerCallback {
        void onDone();
    }

    /**
     * Takes a String and returns it after {@link #DELAY_MILLIS} via a {@link DelayerCallback}.
     * @param callback used to notify the caller asynchronously
     */
    static void processMessage( final DelayerCallback callback,
                               @Nullable final SimpleIdlingResource idlingResource) {
        // The IdlingResource is null in production.
        if (idlingResource != null) {
            idlingResource.setIdleState(false);
        }

        // Delay the execution, return message via callback.
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (callback != null) {
                    callback.onDone();
                    if (idlingResource != null) {
                        idlingResource.setIdleState(true);
                    }
                }
            }
        }, DELAY_MILLIS);
    }
}
