package pl.pollub.app11;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);




    }
    public void startIntent(View v) {
        if(v.getId()==R.id.button){
            double lat=Double.parseDouble(et1.getText().toString());
            double lng=Double.parseDouble(et2.getText().toString());
            Intent i=new Intent(this,MapsActivity.class);
            i.putExtra("lat",lat);
            i.putExtra("lng",lng);
            startActivity(i);
        }

    }


}