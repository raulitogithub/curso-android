package com.curso.android.preference3;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

public class OpcionesActivity extends PreferenceActivity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        
        /*if (Build.VERSION.SDK_INT<Build.VERSION_CODES.HONEYCOMB) {
            addPreferencesFromResource(R.xml.preferences);
            addPreferencesFromResource(R.xml.preferences2);
        }*/
        getFragmentManager().beginTransaction().replace(android.R.id.content,
        	    new PrefsFragment()).commit();
        	  PreferenceManager.setDefaultValues(OpcionesActivity.this, R.xml.opciones, false);
    }
}
