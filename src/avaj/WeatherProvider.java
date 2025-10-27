package avaj;

public class WeatherProvider { //Singleton donc on ne veut qu'une seule instance non instanciable a l'infini partagee dans tout le programme
	private static WeatherProvider instance = null;

	private String weather[] = {"RAIN", "FOG", "SUN", "SNOW"};

	private WeatherProvider() {}

	public static WeatherProvider getWeatherProvider() {
		if (instance == null)
			instance = new WeatherProvider();
		return (instance);
	}

	public String getCurrentWeather(Coordinates p_coordinates) { // a dev
		return (weather[0]);
	}
}
