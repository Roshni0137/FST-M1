package Activities;

public class Car {
	

	String  color;
	String  transmission;
	int make;
	int  tyres;
	int doors;
	Car(String color, String transmission, int make,int tyres, int doors)
	{
	this.color=color;
	this.transmission=transmission;
	this.make=make;
	this.tyres=tyres;
	this.doors=doors;
	}
	
	
void displayCharacteristics()
{
	
	System.out.println("color is:" + color);
	System.out.println("transmission is:" + transmission);
	System.out.println("make is:" + make);
	System.out.println("tyres is:" + tyres);
	System.out.println("doors is:" + doors);
	
}
	void accelarate()
	{
		System.out.println("Car is moving forward");
		
	}
	void brake()
	{
		System.out.println("Car has stopped");
			
}
	
		public static void main(String[] args)
		{
		
			Car car1= new Car("Red","Manual",4,4,4);
			car1.displayCharacteristics();
			car1.accelarate();
			car1.brake();
		
		}
	}
	
