package models;

public class Event {
    private int guest; // number of guests to accommodate for
    private String food; // type of meal per guest; course_meal_x3 $50/per, course_meal_x7 $70/per, course_meal_x10 $100/per
    private int priceFood;
    private String beverage; // open_bar $100/guest, one_round $10/guest, byob $0/guest
    private int priceBeverage;
    private String entertainment; // DeeJay Muzik $100 000/event, ipod_playlist_on_shuffle $1 000/event, nickleback $0/event
    private int priceEntertainment;
    private int price; // price for the event; will equal the amount of 'guest * food + guest * beverage + entertainment'

    public Event(int guest, String food, String beverage, String entertainment) {
        this.guest = guest;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
        this.priceFood = 0;
        this.priceBeverage = 0;
        this.priceEntertainment = 0;
        this.price = 0;
    }
    // GETTERS
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

    public int getPriceFood() {
        if (this.food.equals("x3")) {
            int priceFood = 50;
            return priceFood;
        } else if (this.food.equals("x7")) {
            int priceFood = 70;
            return priceFood;
        } else if (this.food.equals("x10")) {
            int priceFood = 100;
            return priceFood;
        } else {
            return priceFood = 0;
        }
    }

    public int getPriceBeverage() {
        if (this.beverage.equals("open bar")) {
            int priceBeverage = 100;
            return priceBeverage;
        } else if (this.beverage.equals("first round")) {
            int  priceBeverage = 10;
            return priceBeverage;
        } else if (this.beverage.equals("byob")) {
            int priceBeverage = 0;
            return priceBeverage;
        } else {
            int priceBeverage = 0;
            return priceBeverage;        }
    }

    public int getPriceEntertainment() {
        if (this.entertainment.equals("deejay muzik")) {
            int priceEntertainment = 100000;
            return priceEntertainment;
        } else if (this.entertainment.equals("iPod")) {
            int priceEntertainment = 1000;
            return priceEntertainment;
        } else if (this.entertainment.equals("nickleback")) {
            int priceEntertainment = 0;
            return priceEntertainment;
        } else {
            int priceEntertainment = 0;
            return priceEntertainment;
        }
    }

    public int getPrice() {
        int price = (this.guest * this.getPriceFood()) + (this.guest * this.getPriceBeverage()) + this.getPriceEntertainment();
        return price;
    }
}
