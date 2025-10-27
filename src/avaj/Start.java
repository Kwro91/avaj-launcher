package avaj; //le default ca equivaut a rien mettre (ca correspond a src/)

import java.util.List;

public class Start{
	public static void main(String[] arg) {
		System.out.printf("Hello World!\n");
		List<String> tab = HandleFile.GetFile("scenario.txt"); // a changer car on doit pouvoir mettre le fichier qu'on veut
		int repet = Integer.parseInt(tab.get(0));
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

class WeatherTower {
	public String getWeather(Coordinates p_coordinates) {
		WeatherProvider wp = WeatherProvider.getWeatherProvider();
		String weather = wp.getCurrentWeather(p_coordinates);

		return (weather);
	}
	public void	changeWeather() {

	}
}

class Tower {
	List<Flyable> observers;

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
