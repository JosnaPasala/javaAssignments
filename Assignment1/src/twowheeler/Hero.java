package twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
	public int getSpeed(int Speed)
	{
		return Speed;
	}

	@Override
	public String getModelName() {
		
		return "trainname";
	}

	@Override
	public String getRegistrationNumber() {

		return "trainno";
	}

	@Override
	public String getownerName() {
		return "abc123";
	}
	public void radio()
	{
		System.out.println("radio is pleasant to listen");
	}

}
