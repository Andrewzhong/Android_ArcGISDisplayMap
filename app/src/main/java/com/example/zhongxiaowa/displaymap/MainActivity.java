package com.example.zhongxiaowa.displaymap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

public class MainActivity extends AppCompatActivity {
    private MapView mMapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMapView = findViewById(R.id.mapView);
        ArcGISMap map = new ArcGISMap(Basemap.Type.NAVIGATION_VECTOR, 25.0647, 102.7541, 16);
        mMapView.setMap(map);
    }
    //Basemap.Type.TOPOGRAPHIC

    @Override
    protected void onPause(){
        mMapView.pause(); super.onPause();
    }

    @Override
    protected void onResume(){
        super.onResume(); mMapView.resume();
    }
}
