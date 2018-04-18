package com.example.praneta.location;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LocNoteService extends Service {
    private static final String TAG = LocNoteService.class.getSimpleName();
    private  IBinder mBinder ;
    private static final long UPDATE_INTERVAL_IN_MILLISECONDS = 900000;
    private static final long FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = 600000;
    private static final int NOTIFICATION_ID = 12345678;

    public LocNoteService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
