package solidInterfaceSegregationPrinciple;

public class RestaurantTest {

    public static void main(String[] args) {

        VegRestaurant vegRestaurant = new VegRestaurant();
        vegRestaurant.prepareVegMeal();

        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        nonVegRestaurant.prepareNonVegMeal();

        MaxRestaurant maxRestaurant = new MaxRestaurant();
        maxRestaurant.prepareVegMeal();
        maxRestaurant.prepareNonVegMeal();



    }
}
