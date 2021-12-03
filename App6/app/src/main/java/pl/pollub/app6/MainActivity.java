package pl.pollub.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    RadioButton rb1,rb2,rb3,rb4;
    ImageButton ib1, ib2, ib3;
    MediaPlayer mp;
    double startTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib1 = findViewById(R.id.imageButton);
        ib2 = findViewById(R.id.imageButton2);
        ib3 = findViewById(R.id.imageButton3);

        rb1=findViewById(R.id.radioButton);
        rb2=findViewById(R.id.radioButton2);
        rb3=findViewById(R.id.radioButton3);

        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
        ib3.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.equals(ib2)) {
            if (mp == null) {

                check();
            }
            if (!mp.isPlaying()) {
                mp.seekTo((int) startTime);
                mp.start();
            }
        }
        if (v.equals(ib1)) {
            if (mp != null && mp.isPlaying()) {
                startTime = mp.getCurrentPosition();
                mp.pause();
            }
        }

        if(v.equals(ib3)){
            if (mp != null && mp.isPlaying()) {
                startTime = 0;
                mp.stop();
                mp = null;
            }
        }
    }
    public void check() {
        if (rb1.isChecked()) {
            mp = MediaPlayer.create(this, R.raw.billie);
        }if (rb2.isChecked()) {
            mp = MediaPlayer.create(this, R.raw.dangemonkey);
        }if (rb3.isChecked()) {
            mp = MediaPlayer.create(this, R.raw.memories);
        }
    }
}