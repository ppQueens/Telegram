/*
 * This is the source code of Telegram for Android v. 5.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2018.
 */

package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class StopLiveLocationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int[] accounts = UserConfig.getStartedAccounts();
        for (Integer a : accounts) {
            LocationController.getInstance(a).removeAllLocationSharings();
        }
    }
}
