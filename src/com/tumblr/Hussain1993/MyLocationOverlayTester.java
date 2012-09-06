package com.tumblr.Hussain1993;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;

import android.os.Bundle;
import android.view.Menu;
/**
 * This is a simple application to demonstrate the use
 * of the MyLocationOverlay on Android. This program will show
 * a Map to the user and it will simply place a blue dot
 * on the map of where the user is currently in the world.
 * 
 * This program will be fully documented
 * 
 * @author Hussain
 * @see <a href="http://hussain1993.tumblr.com/">Website</a>
 */
public class MyLocationOverlayTester extends MapActivity {
	//Declaration of Global Variables
	private MapView mapView;//This is the map on the screen
	/*
	 * This is the map controller, the map controller is used
	 * to zoom into the map and to set the different
	 * views of the map, such as Street View and Normal.
	 */
	private MapController mapController;
	private MyLocationOverlay myLocationOverlay;//This is the overlay that will be placed on the map
	
	/**
	 * This is the method that is first called 
	 * whenever the application launches
	 */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_location_overlay);
        //Find the elements on the screen
        mapView = (MapView)findViewById(R.id.mapView);
        //Get the Map Controller
        mapController = mapView.getController();
        /*
         * Set Buttons on screen which will allow the user to 
         * zoom into the map.
         */
        mapView.setBuiltInZoomControls(true);
        /*
         * Initialize the MyLocationOverlay, to initialize the overlay
         * we need two things; the first is a context and we will you 'this' as a
         * context and the one other thing that we need is a Map View and we will use
         * the Map View we created earlier here.
         */
        myLocationOverlay = new MyLocationOverlay(this, mapView);
        /*
         * Add the MyLocationOverlay as an overlay to the
         * Map
         */
        mapView.getOverlays().add(myLocationOverlay);
        /*
         * This is the code that is called whenever the user 
         * changes location
         */
        myLocationOverlay.runOnFirstFix(new Runnable() {
			
			@Override
			public void run() {
				/*
				 * Make the map animate to the users current location
				 */
				mapController.animateTo(myLocationOverlay.getMyLocation());
				/*
				 * Set the zoom level of the map; it is on a scale from
				 * 1-21 where 1 is world view and 21 is the closest zoom
				 * level
				 */
				mapController.setZoom(17);
			}
		});
    }//end method onCreate

    /**
     * This is a method that used in the android
     * application life cycle, in this method will enable
     * the MyLocationOverlay to enable the program to sense
     * out location.
     */
    @Override
    protected void onResume() {
    	super.onResume();//This line has to stay
    	//Enable my location
    	myLocationOverlay.enableMyLocation();
    }//end method onResume
    
    /**
     * This is a method that is used in the android
     * application life cycle, in this method we will stop 
     * the MyLocationOverlay of sensing our location. This is important because when the
     * user closes the application these are things that should
     * not be running in the background as they can take up the 
     * users battery life and also eat into their data as well 
     */
	@Override
	protected void onPause() {
		super.onPause();//This line has to stay
		//Disable location detection
		myLocationOverlay.disableCompass();
	}//end method onPause
	
	/**
	 * This is a method to show the application menu
	 * when the user presses the menu button
	 */
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_location_overlay, menu);
        return true;
    }//end method onCreateOptionsMenu

	/*
	 * (non-Javadoc)
	 * @see com.google.android.maps.MapActivity#isRouteDisplayed()
	 */
	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}//end method isRouteDisplayed

    
}//end class MyLocationOverlayTester 
