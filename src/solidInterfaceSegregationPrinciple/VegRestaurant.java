package solidInterfaceSegregationPrinciple;

public class VegRestaurant implements VegMeal{

    @Override
    public void prepareVegMeal() {
        System.out.println("prepare vegetable");
    }
}
