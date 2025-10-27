package avaj;

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