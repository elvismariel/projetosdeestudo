package com.elvismariel.traking.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkHelper {
    public static boolean hasNetworkAccess(Context context){
        try {
            ConnectivityManager cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();

            return activeNetwork != null && activeNetwork.isConnected();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
