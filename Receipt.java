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
        BigDecimal totalNetto = BigDecimal.ZERO;

        for (Item item: itemList){
            totalNetto = totalNetto.add(item.getNettoPrice());
            vatMap.put(item.getVat(), vatMap.getOrDefault(item.getVat(), BigDecimal.ZERO).add(item.getVatAmmount()));
        }

        System.out.println("|             | Total netto |   " + totalNetto + "   |");
        System.out.println("|-------------|-------------|------------|");
        for (Map.Entry<BigDecimal, BigDecimal> entry : vatMap.entrySet()) {
            System.out.println("| VAT " + entry.getKey().multiply(new BigDecimal(100)) + "%  |   " + entry.getValue() + "   |");
        }
    }
}
