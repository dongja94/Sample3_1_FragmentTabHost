package com.begentgroup.samplefragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    FragmentTabHost tabHost;
    private static final String TAB1_TAG = "tab1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (FragmentTabHost)findViewById(R.id.tabHost);

        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec(TAB1_TAG).setIndicator(getString(R.string.label_tab1)), OneFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("TAB2"), Tab2Fragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("TAB3"), Tab3Fragment.class, null);
    }
}
