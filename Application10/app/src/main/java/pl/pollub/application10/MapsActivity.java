package pl.pollub.application10;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import pl.pollub.application10.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    int buton;
    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    //int buttonId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

            buton=getIntent().getIntExtra("buton",0);
                if(buton==2){
                    LatLng italy=new LatLng(41.8905,12.4942);
                    mMap.addMarker(new MarkerOptions()
                            .position(italy)
                            .title("Italy, Rome")
                            .snippet("This is my favorite country before turkey :)")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.italy))
                    );
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(italy));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(12), 2000, null);
                }
                if(buton==3){
                    LatLng poland=new LatLng(50.0614,19.9383);
                    mMap.addMarker(new MarkerOptions()
                            .position(poland)
                            .title("Poland, Krakow")
                            .snippet("This is my favorite city in Poland")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.poland))
                    );
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(poland));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(12), 2000, null);
                }


                if(buton==1){
                    LatLng turkey=new LatLng(40.1467,26.4086);
                    mMap.addMarker(new MarkerOptions()
                            .position(turkey)
                            .title("Turkey, Çanakkale")
                            .snippet("This is my hometown")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.turkey))
                    );
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(turkey));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(12), 2000, null);
                }






    }
}