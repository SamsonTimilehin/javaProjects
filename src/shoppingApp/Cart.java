package shoppingApp;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItemList() {
        return items;
    }

    public void setItemList(List<Item> itemList) {
        this.items = itemList;
    }

    public void changeItemInCart(String itemInCartName, Item itemRef){
      Item itemDB = items.stream().filter(name -> name.getName().equals(itemInCartName)).findFirst().get();

      itemDB.setName(itemRef.getName());
      itemDB.setPrice(itemRef.getPrice());
      itemDB.setQuantity(itemRef.getQuantity());


    }

    public void addItems(Item product){
        items.add(product);
    }
    public double calculateTotalPrice(){

        double sum = 0;

        for(Item price : items){
            sum += price.totalCost();
        }
        return sum;
    }
}
