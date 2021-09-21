package customerInvoice;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItems(Item product){
        itemList.add(product);
    }
    public double calculateTotalPrice(){

        double sum = 0;

        for(Item price : itemList){
            sum += price.totalCost();
        }
        return sum;
    }
}
