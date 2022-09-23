# Tracker Example
The demo makes focus on a clean and scalable architecture in order to implement multiple trackers for your app, web-app or desktop site.

This approach can be implemented in multiple languages. This example was made using kotlin as the main language, it is modularized and it has been set up to use hilt
as Android dependecy injection framework but it is not the main focus of the example.

## Installation
For running the example you will have to install Android studio.

## Brief Explanation
* Tracker Interface:
this should be implemented by an interface that will hold all your tracking methods, it has a variable anonymousTracker that you could use to set the user id to the track or not if you need it. In our example, you can check out in the Movies module the MovieTracker. You will notice that interface is writing as empty all the methods because we don't want to force every concrete tracker class (your googleTracker would like to track a movie liked by the user but your FacebookTracker won't) to override everything.


* Trackable Interface: the purpose of this is to encapsulate the call of the corresponding tracking method. You can check the MovieTrackingEvent class, and you will notice that it is a sealed class because there is no need to overwrite its method or add inheritance. Just keep it lean and simple by only creating and exposing each event that should be responsible for triggering the track.

*AnalyticsSender interface: The class that will implement this should be in charge of two main things, one is to initialize the multiple trackers by adding them to a list (here you will add your google, Facebook, and Amplitude concrete trackers for example). Those concrete trackers will inherit the same contract that you implemented using the Tracker interface. Whenever is the time to call the track you only will need to call your concrete analyticSender implementation (check MoviesAnalyticsSender class), create the event to track with the parameters needed by using the sealed class you have created and your sender will handle all. your sender will pass every event to all of the trackers and only the ones that have implemented the tracking method will work.


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
