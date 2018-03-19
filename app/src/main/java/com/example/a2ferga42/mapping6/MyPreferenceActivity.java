package com.example.a2ferga42.mapping6;

import android.preference.PreferenceActivity;
import android.os.Bundle;

/**
 * Created by 2ferga42 on 19/03/2018.
 */

public class MyPreferenceActivity extends PreferenceActivity
{
    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
