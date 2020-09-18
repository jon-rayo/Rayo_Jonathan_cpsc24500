public class Flooring {
	
	public static double convertFttoIn (double x) {
		double result = (x)*12;
		return result;
	}
	
	public static double findPrice (double a) {
		double result = a*24.99;
		return result;		
	}
	
	public static void main(String [] args) {
		double area_of_board = 180;
		double length = 25;
		double width = 20;
		double area = length * width;
		double area_of_room = convertFttoIn(area);
		double missing_area = convertFttoIn(60);
		double room_area = area_of_room - missing_area;
		double amount_of_board = Math.ceil(room_area/area_of_board);
		double amount_of_pack = amount_of_board/6;
		double cost = findPrice(amount_of_pack);
		
		System.out.printf("You need to buy %.0f amount of packages and it will cost $%.2f. /n", amount_of_pack, cost);
		
		
		

		
	}

}
