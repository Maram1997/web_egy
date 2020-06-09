package com.example.egydesigner;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.material.navigation.NavigationView;
import static com.example.egydesigner.R.id.drawer_layout;
public class MainActivity extends AppCompatActivity {
    Menu optionsMenu;
    Animation slide;
    private AppBarConfiguration mAppBarConfiguration;
   // DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DrawerLayout drawer = findViewById(drawer_layout);
        drawerToggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawer.addDrawerListener(drawerToggle);
        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerToggle.syncState();


        NavController navController = Navigation.findNavController(this, R.id.nav_view);
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(navController.getGraph()).build();
        Toolbar toolbar = findViewById(R.id.toolbar);
        NavigationUI.setupWithNavController(toolbar, navController, appBarConfiguration);



/////////////////////////////////////////////
     /*  NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        navigationView.bringToFront();
        navigationView.requestLayout(); */
////////////////////////////////////////////////////////////////////////




        setContentView(R.layout.activity_main);

        Button buttom_home=  findViewById(R.id.home);
        buttom_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,home.class);
                startActivity(intent1);
            }
        });
          // Button buttom_who=  findViewById(R.id.who);
          // buttom_who.setOnClickListener(new View.OnClickListener() {
         //  @Override
        //   public void onClick(View v) {
        //  Intent intent2 = new Intent(MainActivity.this,who_us.class);
         // startActivity(intent2);}});


        /////////anime
       // slide= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        slide=  AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);

        // ImageView image = (ImageView)root.findViewById(R.id.logo);
       // final ImageView image = (ImageView) findViewById(R.id.logo);
        final     Button button=(Button) findViewById(R.id.home);

     //  image.startAnimation(slide);
        button.startAnimation(slide);
        //////////////////////////////////////////


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        optionsMenu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_home:
                Intent intent1 = new Intent(MainActivity.this,home.class);
                startActivity(intent1);
                return true;

            case R.id.nav_who:
                Intent intent2= new Intent(MainActivity.this,who_us.class);
                startActivity(intent2);
                return true;

                case R.id.nav_last_works:
                Intent intent3= new Intent(MainActivity.this, last_works.class);
                startActivity(intent3);
                return true;

                case R.id.nav_offers:
                Intent intent4= new Intent(MainActivity.this,offers.class);
                startActivity(intent4);
                return true;
            case R.id.nav_conect:
                Intent intent5= new Intent(MainActivity.this,conect_us.class);
                startActivity(intent5);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}

