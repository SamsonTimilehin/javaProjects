package solidOpenClosePrinciple;

public class DescComparator implements ValueComparator{

    @Override
    public int compare(int value1, int value2) {
        return value2 - value1;
    }
}
