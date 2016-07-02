package com.wia.ourwedding;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Location extends FragmentActivity {

    static final LatLng weedingLocation = new LatLng(-6.2542993 , 106.737555);
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        try {
            if (googleMap == null) {
                googleMap = ((MapFragment) getFragmentManager().
                        findFragmentById(R.id.map)).getMap();
            }
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            CameraUpdate center = CameraUpdateFactory.newLatLng(weedingLocation);
            CameraUpdate zoom = CameraUpdateFactory.zoomTo(16);
            googleMap.moveCamera(center);
            googleMap.animateCamera(zoom);
            googleMap.addMarker(new MarkerOptions().
                    position(weedingLocation).title("Weeding Locations"));

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}
