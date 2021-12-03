package pl.pollub.app5;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    private NavigationView nv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dl = findViewById(R.id.activity_main);
        tv=findViewById(R.id.textView3);
        abdt = new ActionBarDrawerToggle(this, dl, 0, 0);
        dl.addDrawerListener(abdt);
        abdt.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nv = findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                switch(id) {
                    case R.id.painting:
                        tv.setText("I enjoy examining nature pictures and making similar ones. When I draw a picture, I get away from the problems a little bit and relax.");
                        return true;
                    case R.id.movie:
                        tv.setText("I like to watch horror and thriller movies. My favorite thriller is Mom. When one thinks of tension, the first thing that comes to mind is fear, but in this movie, when people put themselves in the place of the main character, they can't help but get angry with other characters. I like that the movie reflects that.");
                        return true;
                    case R.id.travel:
                        tv.setText("I like to travel. The biggest reason I wanted to do Erasmus was because I wanted to travel to Europe. The countries I want to visit most are Italy, France, Lithuania and Germany.");
                        return true;
                        default:
                            return true;
                }
            }
        });

    }public boolean onOptionsItemSelected(MenuItem item) {
        if(abdt.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

}