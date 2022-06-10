package com.automobile;

import com.automobile.vehicle.Honda;

import twowheeler.Hero;

public class Test {
	public static void main(String[] args)
	{
		Hero h1=new Hero();
		System.out.println("the speed is:" +h1.getSpeed(123));
		System.out.println("the modelname is:" +h1.getModelName());
		System.out.println("the registrationno is:" +h1.getRegistrationNumber());
		System.out.println("the ownername is:" +h1.getownerName());
		 h1.radio();
		 Honda h2=new Honda();
	     System.out.println("the speed is:" +h2.getSpeed(123));
		System.out.println("the modelname is:" +h2.getModelName());
		System.out.println("the registrationno is:" +h2.getRegistrationNumber());
		System.out.println("the ownername is:" +h2.getownerName());
		 h2.radio();
		 
	

}
}
