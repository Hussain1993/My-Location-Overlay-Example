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
<b>telnet localhost “your_simulator_number“</b>
	
Hussain Miah (http://hussain1993.tumblr.com/)
hmiah.1993@gmail.com 