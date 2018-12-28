package com.elvismariel.traking.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class SendLocationService extends Service {
    public SendLocationService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Log.i("Script", "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.i("Script", "onStartCommand");
        Worker w = new Worker(startId);
        w.start();

        return (super.onStartCommand(intent, flags, startId));
    }

    class Worker extends Thread {
        public int count = 0, startId;
        public boolean ativo = true;

        public Worker(int startId){
            this.startId = startId;
        }

        public void run(){
            while (ativo && count < 10){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                count++;
                Log.i("Script", "Count" + count);
            }
            stopSelf(startId);
        }
    }
}
