package com.elvismariel.traking.Services;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

import com.elvismariel.traking.model.PhoneLocation;
import com.elvismariel.traking.repository.webservice.WebServiceRetrofit;

import java.io.IOException;

import retrofit2.Call;

public class SendIntentService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    private static final String ACTION_BAZ = "com.elvismariel.traking.action.BAZ";
    // TODO: Rename parameters
    private static final String EXTRA_PHONE = "com.elvismariel.traking.Services.extra.PHONE";

    private LocationManager locationManager;
    private LocationListener locationListener;
    private WebServiceRetrofit ws = null;

    public SendIntentService() {
        super("SendIntentService");
        Log.i("SendIntentService", "Dentro do Metodo 2: SendIntentService()");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("SendIntentService", "Dentro do Metodo 3: onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("SendIntentService", "Dentro do Metodo 4: onStartCommand()");
        startLocation(intent);

        return (super.onStartCommand(intent, flags, startId));
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("SendIntentService", "Dentro do Metodo 5: onHandleIntent()");
        //startLocation(intent);
    }

    @SuppressLint("MissingPermission")
    public void startLocation(Intent intent){
        Log.i("SendIntentService", "Dentro do Metodo: startLocation()");

        if (intent != null) {
            final String phone = intent.getStringExtra(EXTRA_PHONE);
            locationManager = (LocationManager) this.getSystemService(LOCATION_SERVICE);

            locationListener = new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    Log.d("Location 6: ", location.toString());

                    PhoneLocation phoneLocation = PhoneLocation.reload(phone, location.getLatitude(), location.getLongitude());
                    sendData(phoneLocation);
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {

                }

                @Override
                public void onProviderEnabled(String provider) {

                }

                @Override
                public void onProviderDisabled(String provider) {

                }
            };

            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        }
    }

    public static void startActionBaz(Context context, String phone) {
        Log.i("SendIntentService", "Dentro do Metodo 1: startActionBaz()");

        Intent intent = new Intent(context, SendIntentService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PHONE, phone);
        context.startService(intent);
    }

    private void sendData(PhoneLocation phoneLocation){
        if(ws == null)
            ws = WebServiceRetrofit.retrofit.create(WebServiceRetrofit.class);

        try {
            Log.i("SendIntentService", "Dentro do Metodo: sendData()");

            Call result = ws.sendLocation(phoneLocation);
            result.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
