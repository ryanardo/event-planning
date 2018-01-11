package models;

public class Event {

    private Integer guest; // number of guests to accommodate for
    private String food; // type of meal per guest; course_meal_x3 $50/per, course_meal_x7 $70/per, course_meal_x10 $100/per
    private String beverage; // open_bar $100/guest, one_round $10/guest, byob $0/guest
    private String entertainment; // dj_muzik_person $100 000/event, ipod_playlist_on_shuffle $1 000/event, nickleback $0/event
    private int price; // price for the event; will equal the amount of 'guest * food * beverage + entertainment'

    public Event(int guest, String food, String beverage, String entertainment) {
        this.guest = guest;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
        price = 0;
    }

    public int getGuest() {
        return guest;
    }

    public String getFood() {
        return food;

    }

    public String getBeverage() {
        return beverage;
    }

    public String getEntertainment() {
        return entertainment;
    }
}
