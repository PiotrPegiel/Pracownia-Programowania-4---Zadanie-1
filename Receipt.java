import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(String name, double nettoPrice, double vat){
        itemList.add(new Item(name, nettoPrice, vat));
    }

    public void printReceipt(){

    }
}
