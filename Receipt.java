import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Receipt {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(String name, BigDecimal nettoPrice, BigDecimal vat){
        itemList.add(new Item(name, nettoPrice, vat));
    }

    public void printReceipt(){
        Map<BigDecimal, BigDecimal> vatMap = new HashMap<>();

        for (Item item: itemList){

        }
    }
}
