package pl.pollub.application10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1 ,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        Intent i = new Intent(this, MapsActivity.class);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int buton=1;
                i.putExtra("buton",buton);
                startActivity(i);}
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int buton=2;
                i.putExtra("buton",buton);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int buton=3;
                i.putExtra("buton",buton);
                startActivity(i);
            }
        });
    }

}