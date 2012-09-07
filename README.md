This is a simple application to demonstrate the use
of the MyLocationOverlay used in maps to show the
users current position. This application should be used with 
an Android device that has Google Maps as this application
uses the Google Maps to show the users current location, this
will be shown by the use of a Blue Dot on the Map. This application will also
animate to the current location of the user and zoom into their
proximity.

How to add location data to an android
simulator:
For this application to work you
can either run it on your own Android
device or you can run it on a simulator that is provided with
the SDK. Here are the steps to do so:
	
1. Firstly, you will need to applications open
for this work succesfully; the first one being the
simulator running the application and the other
is a command window; as I am on a Mac I will be using
the Terminal application. When running the
application for the first time this is what you
should see this:<br/>
[Screen shot 1](http://cloud.github.com/downloads/Hussain1993/My-Location-Overlay-Example/ScreenShot2012-09-07at14.46.36.png)

2. If you have the same screen shot above, then this means that the application is
working properly and the way that is should be. After this we have to create 
a Telenet client and make a connection to the Android simulator, so bring
out your command prompt and type the following:<br/>
<b>telnet localhost “your_simulator_number“</b>(Without the quotes)<br/>
“your_simulator_number“ is the number on the top of the simulator
window, you can find this in screen shot one. This is how your command
prompt window should look like after you have pressed enter.<br/>
[Screen shot 2](http://cloud.github.com/downloads/Hussain1993/My-Location-Overlay-Example/Screen%20Shot%202012-09-07%20at%2015.16.39.png)

3. We’re almost there! Now have both the command window open and the Android Simulator open
so that you can see what is going on. To send a location to the Android Simulator you need to
provide it a longitude and latitude. I have found a <a href="http://www.findlatitudeandlongitude.com/">site</a> that can help you with this.
Find a location on the map that is provided, this can be your home or your favorite place in the world :) The box below the
map will display the longitude and latitude of the chosen place; keep a note of them.<br/>
Go to your command window and type the following:<br/>
"geo fix <b>longitude</b> <b>latitude</b>"<br/>
Where the longitude is the longitude of the chosen location and the latitude is the latitude of the chosen location<br/>
It should look a little like this:<br/>
[Screen shot 3](http://cloud.github.com/downloads/Hussain1993/My-Location-Overlay-Example/Screen%20Shot%202012-09-07%20at%2015.29.02.png) 

<p>Now make sure that you have both the command window and Android Simulator open side-by-side, press the enter
button on the command that you have just written; the Android Simulator should now animate to and 
zoom into the location that it was told to. It will place a flashing blue dot to represent the location that was passed to
it. As seen in the following screen shot</p>
[Screen shot 4](http://cloud.github.com/downloads/Hussain1993/My-Location-Overlay-Example/Screen%20Shot%202012-09-07%20at%2015.33.08.png)


	
Hussain Miah (http://hussain1993.tumblr.com/)
hmiah.1993@gmail.com 