package com.barhora.android.barhora;

import android.app.Dialog;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;
import java.util.List;


/**
 * Created by tyler on 1/28/2016.
 */
public class BarDetails extends AppCompatActivity{

    private static final int DIALOG_REQUEST = 9001;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_details);

        String name = getIntent().getStringExtra("name");
        setTitle("BarNameHere"+", "+ name);
        Bar bar = Database.barMap.get(name);
        if(bar == null){
            Toast.makeText(this, "Cannot find bar: "+ name, Toast.LENGTH_SHORT).show();
            return;
        }
        //name city details
        TextView nameText = (TextView) findViewById(R.id.barNameDetails);
        nameText.setText(bar.getName());

        TextView cityText = (TextView) findViewById(R.id.barCityDetails);
        cityText.setText(bar.getCity());

        TextView hoursText = (TextView) findViewById(R.id.happyHoursDetails);
        hoursText.setText(bar.getHours());

        TextView descText = (TextView) findViewById(R.id.descriptionText);
        descText.setText(bar.getDescription());

        TextView addressText = (TextView) findViewById(R.id.addressDetails);
        addressText.setText(bar.getAddress());


        if (servicesOK() && initMap()) {

            Geocoder gc = new Geocoder(this);
            List<Address> list;
            try {
                list = gc.getFromLocationName(bar.getAddress(), 1);
                Address address = list.get(0);
                double lat = address.getLatitude();
                double lng = address.getLongitude();
                LatLng latLong = new LatLng(lat, lng);
                CameraUpdate update = CameraUpdateFactory.newLatLngZoom(latLong, 15);
                mMap.moveCamera(update);
            } catch (IOException e) {
                Toast.makeText(this, getString(R.string.error_finding_bar), Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d(this.getLocalClassName(), e.getMessage());
            }

        }
    }

    public boolean servicesOK() {
        int result = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);

        if (result == ConnectionResult.SUCCESS) {
            return true;
        } else if (GooglePlayServicesUtil.isUserRecoverableError(result)) {
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(result, this, DIALOG_REQUEST);
            dialog.show();
        } else {
            Toast.makeText(this, getString(R.string.error_connect_to_services), Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    private boolean initMap() {
        if (mMap == null) {
            SupportMapFragment mapFrag = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapDetails);
            mMap = mapFrag.getMap();
        }
        return (mMap != null);
    }

}
