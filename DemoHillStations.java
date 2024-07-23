package com;

class HillStations {
	void location() {
		System.out.println("Location of HillStations");
	}

	void famousFor() {
		System.out.println("Fmouse for what according to location");
	}
}

class Manali extends HillStations {
	@Override
	void location() {
		System.out.println(">>>Manali is located in himachal pradesh");
	}

	@Override
	void famousFor() {
		System.out.println(">>>Manali is famous for adventures");
	}

}

class Mussoorie extends HillStations {
	@Override
	void location() {
		System.out.println(">>>Mussoorie is located in Uttrakhand");
	}

	@Override
	void famousFor() {
		System.out.println(">>>Mussoorie is famouse for its beauty and magicals Places");
	}

}

class Gulmarg extends HillStations {
	@Override
	void location() {
		System.out.println(">>>Gulmarg is located in jammu and kashmir");
	}

	@Override
	void famousFor() {
		System.out.println(">>>Gulmarg is famous for Lush green valleys,The world's second-highest Gondola ride");
	}

}
public class DemoHillStations {
	public static void main(String[] args) {
		HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();
        
        manali.location();
        manali.famousFor();
        System.out.println("---------------------------------------");
        mussoorie.location();
        mussoorie.famousFor();
        System.out.println("---------------------------------------");
        gulmarg.location();
        gulmarg.famousFor();
        System.out.println("---------------------------------------");
		
        ((Manali)manali).location();
        ((Manali)manali).famousFor();
        System.out.println("---------------------------------------");
        ((Mussoorie)mussoorie).location();
        ((Mussoorie)mussoorie).famousFor();
        System.out.println("---------------------------------------");
        ((Gulmarg)gulmarg).location();
        ((Gulmarg)gulmarg).famousFor();
	}
     

}

