import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        boolean programRunning = true;

        while(programRunning) {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Hello! Welcome to your Event Planner! Would you like to plan an Event?");
            System.out.println("yes | no");

            String navigationChoice = bufferedReader.readLine();
            if (navigationChoice.equals("yes")) {
                // NUMBER OF GUESTS
                System.out.println("Terrific! First off, can you tell me how many Guest will be attending your Event?");
                String stringUserGuest = bufferedReader.readLine();
                int userGuest =  Integer.parseInt(stringUserGuest);
                // FOOD COURSES
                System.out.println("Great stuff! Now can you tell me the number of Courses you would like prepared for the Event?");
                System.out.println("Type 'x3' for a three course meal, or type 'x7' for a seven course meal, and type 'x10' for a ten course meal!");
                System.out.println("x3 | x7 | x10");
                String userFood = bufferedReader.readLine();
                // BEVERAGE SELECTION
                System.out.println("The best! Now, let's see what options you like for Beverage selection. Here are your options:");
                System.out.println("open bar | first round | byob");
                String userBeverage = bufferedReader.readLine();
                // ENTERTAINMENT
                System.out.println("Could you be any cooler!?!?!?!? Now, can you tell me what sort of Entertainment you would like for the Event? Here are your options:");
                System.out.println("deejay muzik | iPod | nickleback");
                String userEntertainment = bufferedReader.readLine();
                // PRICE OF EVENT
                Event userEvent = new Event(userGuest, userFood, userBeverage, userEntertainment);
                System.out.println("----------------------");
                System.out.println("Okie dokie, here's your new Event!");
                System.out.println("Guest: " + userEvent.getGuest());
                System.out.println("Food: " + userEvent.getFood());
                System.out.println("Beverages: " + userEvent.getBeverage());
                System.out.println("Entertainment: " + userEvent.getEntertainment());
                System.out.println("Total Price: $" + userEvent.priceTotal());
                System.out.println("----------------------");
            }
        }

    }
}
