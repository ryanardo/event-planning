package models;

public class Event {

    private Integer guest; // number of guests to accommodate for
    private String food; // type of meal per guest; course_meal_x3 $50/per, course_meal_x7 $70/per, course_meal_x10 $100/per
    private Integer priceFood;
    private String beverage; // open_bar $100/guest, one_round $10/guest, byob $0/guest
    private Integer priceBeverage;
    private String entertainment; // DeeJay Muzik $100 000/event, ipod_playlist_on_shuffle $1 000/event, nickleback $0/event
    private Integer priceEntertainment;
    private Integer price; // price for the event; will equal the amount of 'guest * food + guest * beverage + entertainment'

    public Event(int guest, String food, String beverage, String entertainment) {
        this.guest = guest;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
        this.priceFood = 0;
        this.priceBeverage = 0;
        this.priceEntertainment = 0;
        this.price = (guest * priceFood) + (guest * priceBeverage) + priceEntertainment;
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

    public int getPriceFood() {
        if (this.food.equals("x3")) {
            return priceFood = 50;
        } else if (this.food.equals("x7")) {
            return priceFood = 70;
        } else if (this.food.equals("x10")) {
            return priceFood = 100;
        } else {
            return priceFood = 0;
        }
    }

    public int getPriceBeverage() {
        if (this.beverage.equals("open_bar")) {
            return priceBeverage = 100;
        } else if (this.beverage.equals("one_round")) {
            return priceBeverage = 10;
        } else if (this.beverage.equals("byob")) {
            return priceBeverage = 0;
        } else {
            return priceBeverage = 0;
        }
    }
    // DeeJay Muzik $100 000/event, iPod on Shuffle $1 000/event, nickleback $0/event
    public int getPriceEntertainment() {
        if (this.entertainment.equals("DeeJay Muzik")) {
            return priceEntertainment = 100000;
        } else if (this.entertainment.equals("iPod on Shuffle")) {
            return priceEntertainment = 1000;
        } else if (this.entertainment.equals("nickleback")) {
            return priceEntertainment = 0;
        } else {
            return priceEntertainment = 0;
        }
    }

}
