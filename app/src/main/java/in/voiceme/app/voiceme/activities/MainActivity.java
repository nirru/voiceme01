package in.voiceme.app.voiceme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.fragments.ActivityInteractionFragment;
import in.voiceme.app.voiceme.fragments.ActivityYourFeedFragment;
import in.voiceme.app.voiceme.views.MainActivityFragmentPagerAdapter;
import in.voiceme.app.voiceme.views.MainNavDrawer;
import io.github.yavski.fabspeeddial.FabSpeedDial;
import io.github.yavski.fabspeeddial.SimpleMenuListenerAdapter;

public class MainActivity extends BaseAuthenticatedActivity {



    @Override
    protected void onVoicemeCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Activity");
        setNavDrawer(new MainNavDrawer(this));

        FabSpeedDial fabSpeedDial = (FabSpeedDial) findViewById(R.id.fab_speed_dial);
        fabSpeedDial.setMenuListener(new SimpleMenuListenerAdapter() {
            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.action_text){
                    startActivity(new Intent(MainActivity.this, TextStatus.class));
                    return true;
                } else if (menuItem.getItemId() == R.id.action_audio){
                    startActivity(new Intent(MainActivity.this, AudioStatus.class));
                    return true;
                }
                return false;
            }
        });

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_main_activity);
        this.addPages(viewPager);

        // Give the PagerSlidingTabStrip the ViewPager
        SmartTabLayout tabsStrip = (SmartTabLayout) findViewById(R.id.tabs_main_activity);
        // Attach the view pager to the tab strip
        tabsStrip.setViewPager(viewPager);

    }

    //add all pages
    private void addPages(ViewPager pager){
        MainActivityFragmentPagerAdapter adapter = new MainActivityFragmentPagerAdapter(getSupportFragmentManager());
        adapter.addPage(new ActivityYourFeedFragment());
        adapter.addPage(new ActivityInteractionFragment());

        //set adapter to pager
        pager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.app_navbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.testing) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
