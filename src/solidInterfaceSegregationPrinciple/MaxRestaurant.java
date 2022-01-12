package solidInterfaceSegregationPrinciple;

public class MaxRestaurant implements VegMeal,NonVegMeal{
    @Override
    public void prepareNonVegMeal() {
        System.out.println("prepare non-vegetable");
    }

    @Override
    public void prepareVegMeal() {
        System.out.println("prepare vegetable");
    }
}
