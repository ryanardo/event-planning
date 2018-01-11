package models;

public class Event {

    public Integer guest; // number of guests to accommodate for.
    public String food; // type of meal per guest; course_meal_x3 $50/per, course_meal_x7 $70/per, course_meal_x10 $100/per.
    public String beverage; // open_bar $100/guest, one_round $10/guest, byob $0/guest.
    public String entertainment; // dj_muzik_person $100 000/event, ipod_playlist_on_shuffle $1 000/event, nickleback $0/event

    public Event(int guest, String food, String beverage, String entertainment) {
        this.guest = guest;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
    }
}
