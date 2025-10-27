import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Start{
	public static void main(String[] arg) {
		System.out.printf("Hello World!\n");
		Vector<String> tab = ReadFile.readFile("scenario.txt");
		int repet = Integer.parseInt(tab.elementAt(0));
		System.out.println("////////////////////////////");
		System.out.println(repet + " repetitions pour le programme");
	}
}

// UML :

// + public
// - private
// # protected
// ~ package

 // Projet

 class BadValueException extends Exception {
	public BadValueException(String message){
		super(message);
	}
 }

 class Coordinates {
	private int _longitude;
	private int _latitude;
	private int _height;

	Coordinates(){
		_longitude = 0;
		_latitude = 0;
		_height = 0;
	}

	Coordinates(int longitude, int latitude, int height) {
		_longitude = 0;
		_latitude = 0;
		_height = 0;
		try {
			setHeight(height);
			setLatitude(latitude);
			setLongitude(longitude);
		} catch (Exception err)
		{
			System.out.println(err.getMessage());
		}
	}

	public int		getLongitude() {return (_longitude);}
	public int		getLatitude() {return (_latitude);}
	public int		getHeight() {return (_height);}
	void	setLongitude(int longitude) throws BadValueException {
		if (longitude >= 0)
			_longitude = longitude;
		else
			throw new BadValueException("Error: invalid longitude value");
	}
	void	setLatitude(int latitude) throws BadValueException {
		if (latitude >= 0)
			_latitude = latitude;
		else
			throw new BadValueException("Error: invalid latitude value");
	}
	void	setHeight(int height) throws BadValueException {
		if (height >= 0 && height <= 100)
			_height = height;
		else
			throw new BadValueException("Error: invalid height value");

	}
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

class Aircraft {
	long _id;
	String _name;
	Coordinates _coordinate;
	Aircraft(long p_id, String p_name, Coordinates p_coordinates){}
}


// singletons (classe avec une seule instance)

class WeatherProvider {
	private static WeatherProvider instance = null;

	private String weather[] = {"RAIN", "FOG", "SUN", "SNOW"};

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

class ReadFile {
	public  static Vector<String> readFile(String nameFile)
	{
		File file = new File(nameFile);
		Vector<String> tab = new Vector<String>();
		try (Scanner reader = new Scanner(file)){
			while (reader.hasNextLine())
			{
				String data = reader.nextLine();
				tab.add(data);
				// System.out.println(data); //print tout le fichier
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: readfile");
			e.printStackTrace();
		}
		return (tab);
	}
}