package PlayGround;

public class Coin {
    private String coinOption;
    private String[] coinValue = {"Head","Tail"};

    public Coin(){
        int indexNumber = Math.random() < 0.5 ? 0 : 1;
        this.coinOption = coinValue[indexNumber];
    }
    public String getCoinOption(){
        return coinOption;
    }
}
