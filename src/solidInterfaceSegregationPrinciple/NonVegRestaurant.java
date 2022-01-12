package solidInterfaceSegregationPrinciple;

public class NonVegRestaurant implements NonVegMeal{
    @Override
    public void prepareNonVegMeal() {
        System.out.println("prepare non-vegetable");
    }
}
