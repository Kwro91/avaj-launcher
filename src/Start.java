public class Start{
	public static void main(String[] arg) {
		System.out.printf("Hello World!\n");
		test.ok();
	}
}

class test {
	static void ok(){
		System.out.printf("OK test\n");
	}
}

// UML :

// + public
// - private
// # protected
// ~ package

 // Projet

 class Coordinates {
	private int _longitude;
	private int _latitude;
	private int _height;

	Coordinates(){
		_longitude = 0;
		_latitude = 0;
		_height = 0;
	}

	public int		getLongitude() {return (_longitude);}
	public int		getLatitude() {return (_latitude);}
	public int		getHeight() {return (_height);}
	void	setLongitude(int longitude) {_longitude = longitude;}
	void	setLatitude(int latitude) {_latitude = latitude;}
	void	setHeight(int height) {_height = height;}
}

class WeatherTower {
	public String getWeather(Coordinates p_coordinates) {
		WeatherProvider wp = WeatherProvider.getInstance();
		String weather = wp.getCurrentWeather(p_coordinates);

		return (weather);
	}
	public void	changeWeather() {

	}
}

class Tower {

}

abstract class Flyable {
	protected WeatherTower _weatherTower;

	public abstract void	updateConditions();
	public void				registerTower(WeatherTower p_tower){
		_weatherTower = p_tower;
	}
}


// singletons (classe avec une seule instance)

class WeatherProvider {
	private static WeatherProvider instance = null;

	private String weather[] = {"SUN", "RAIN", "SNOW"};

	private WeatherProvider() {}

	public static WeatherProvider getInstance() {
		if (instance == null)
			instance = new WeatherProvider();
		return (instance);
	}

	public String getCurrentWeather(Coordinates p_coordinates) {
		return (weather[0]);
	}
}