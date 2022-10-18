import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		
		Room garden = new Room ("You are facing a large wooden door  with a silver \r\n"
				+ "door knob and vertical silver nails across the bottom\r\n"
				+ "and the top of the door. To the east and west side there \r\n"
				+ "are almost identical Sets of three butterly bushes.\r\n"
				,Entrance,null ,null, null);
		

		Room entrance = new Room  ("You are now inside the Shentour residance. \r\n"
				+ "To the west is the coat hanger and a bench.\r\n"
				+ "Do you mind taking off your shoes and hanging your coat?\r\n"
			    ,null,guestLivingRoom,guestRoom,garden);
		
		
		Room guestLivingRoom = new Room  ("You are at the guest living room to the East you have a blue comfortable sofa\r\n"
				+ "a Van Gogh painting hangs ontop. A glass coffe table is infront of the sofa\r\n"
				+ "Two accent chairs frame the bottom side of the window. North is the kitchen counter.\r\n"
				+ "The counter has cheese and salami and olives.To the west there is the powder room and\r\n"
				+ "guest room.\r\n"
				+ "what would you like to do next?\r\n"
				kitchen,powderRoom,null, null);
		
		
		Room powderRoom = new Room  ("You are at the powder room. To the north there is a sink and the mirror. \r\n"
				+ "Would you like to wash your hands?",null,guestLivingRoom,null,null);
		
		
		Room kitchen = new Room  ("You are at the kitchen. \r\n"
				+ "To the north is a grey island with an iron \r\n"
				+ "skillet hanging from the top.\r\n"
				+ "To the south is the kitchen counter\r\n"
				+ " with cheese, salami and olives. Please help yourself to some.\r\n"
				+ "To the west is a long corridor with a window at the end.",livingRoom, null ,corridoor,guestLivingRoom);
		
		
		Room corridoor = new Room  ("You are at the corridor. To the north is a washer and dryer.\r\n"
				+ "To the South is a bathroom.\r\n"
				+ "To the west is a path to the bedrooms\r\n"
				+ "and East is the kitchen.\r\n"
				+ "What would you like to do?",null,kitchen,betweenroomsfoyer,bathroom);
		
		
		Room livingroom = new Room  ("You are inside the family livingroom next to the console table to the west.\r\n"
				+ "To the North there is a two sided glassdoor facing the deck.\r\n"
				+ "To the east there is the TV.\r\n"
				+ "To the south is the kitchen island with the hanging skillet. ",terrace,null,null,kitchen);
		
		
		Room mainBedroom = new Room  ("You are in the mainbedroom.\r\n"
				+ "To the north there is a two sided glassdoor with a view to the terrace.\r\n"
				+ "To the west is a queen size bed with a blue duvets \r\n"
				+ "with fine purple stitched patterns.\r\n"
				+ "There is a night stand with a lamp ontop.  \r\n"
				+ "To the east is an attached bathroom.",null,mainbathroom,null ,betweenroomsfoyer);
		
		
		Room terrace = new Room  ("You are at the terrace. To the north is a vegetable garden. To \r\n"
				+ "To the south is the glass door to the living room.\r\n"
				+ "To the east is an outdoor set for of chairs and a table.\r\n"
				+ "To the West is a flower garden.",null,null,null,livingroom);
		
		
		Room betweenroomsfoyer = new Room  ("You are standing at the end of the corridoor. \r\n"
				+ "To the west there is a window.\r\n"
				+ "To the north is the main bedroom.\r\n"
				+ "To the south is the office.",mainBedroom,corridoor,"Window",office);
		
		
		Room guestRoom = new Room  ("You are in the guest room.\r\n"
				+ "To the west there is a desk.\r\n"
				+ "To the north there is a bed.\r\n"
				+ "To the south there is a large window.\r\n",null,entrance,null,null);


		
			
		Scanner scanner = new Scanner(System.in);
		String x;
		Room roomNow = garden;
		System.out.println(garden.descrip);
		System.out.println("What do you want to do?");
		
		String inputTop;
		String input;
		input = scanner.nextLine();
		 inputTop = input.toUpperCase();
		
		
		
		while (inputTop != "EXIT") {
			
			
			if (inputTop.contains("NORTH")) 
			    roomNow = Room.north;
			else if (inputTop.contains("EAST"))
			  	roomNow = Room.east;
			else if (inputTop.contains("WEST"))
				roomNow = Room.west;
			else if (inputTop.contains("SOUTH"))
				roomNow = Room.south; 
			
			System.out.println(roomNow);
			

		}
		}
	}