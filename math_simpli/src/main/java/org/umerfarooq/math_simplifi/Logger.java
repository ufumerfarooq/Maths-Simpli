package org.umerfarooq.math_simplifi;

import android.util.Log;

public class Logger {
    private static boolean isEnabled = true;

    public static void setLogsDisabled(){
        isEnabled = false;
    }

    public static void debugLog(String tag,String message){
        if (isEnabled){
            Log.d(tag,message);
        }
    }

    public static void infoLog(String tag,String info){
        if (isEnabled){
            Log.d(tag,info);
        }
    }

    public static void errorLog(String tag,String error){
        if (isEnabled){
            Log.d(tag,error);
        }
    }
}
