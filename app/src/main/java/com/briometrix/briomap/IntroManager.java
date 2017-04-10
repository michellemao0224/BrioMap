package com.briometrix.briomap;

import android.content.Context;
import android.content.SharedPreferences;

public class IntroManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    public IntroManager(Context context){
        this.context = context;
        pref = context.getSharedPreferences("first",0);
        editor = pref.edit();
    }

    public void setFirst(Boolean isFirst){
        editor.putBoolean("check",isFirst);
        editor.commit();
    }

    public Boolean Check(){
        return pref.getBoolean("check",true);
    }
}
