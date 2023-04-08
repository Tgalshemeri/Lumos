# Lumos

It is an Android Library to Turn ON/OFF Dark Mode.


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Tgalshemeri:Lumos:1.0'
	}
  
  
  It contains on 3 Functions:
  
  - ```Lumos().setDarkON(activity)```: Turn On Dark Mode.
  - ```Lumos().setDarkOFF(activity)``` : Turn Off Dark Mode
  - ```Lumos().setDarkSchedule(activity , startHour , endHour)```: Turn ON Dark Mode at range of Time. (Time format is 24 Hours).
  
  For Example:
  ```Lumos().setDarkSchedule(activity , 9 , 12)```: Turn ON Dark Mode from 9 AM to 12 PM.
 
