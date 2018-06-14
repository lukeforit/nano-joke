package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    @Test
    public void asyncTaskTest() {
        new MainActivity.EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String result) {
                Assert.assertNotNull(result);
            }
        }.execute(new Pair<>(InstrumentationRegistry.getContext(), ""));
    }
}
