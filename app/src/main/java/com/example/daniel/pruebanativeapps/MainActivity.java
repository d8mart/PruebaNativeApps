package com.example.daniel.pruebanativeapps;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    NavigationView mNavigationView;
    Toolbar wToolbar;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mdrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wToolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(wToolbar);

        mNavigationView=(NavigationView) findViewById(R.id.main_drawer);
        mNavigationView.setNavigationItemSelectedListener(this);

        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.openDrawer(GravityCompat.START);
        mdrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,wToolbar,0,0);
        mDrawerLayout.setDrawerListener(mdrawerToggle);
        mdrawerToggle.syncState();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.openDrawer(GravityCompat.START);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return false;
    }
}
