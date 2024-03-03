import java.math.BigDecimal;

public class Item {
    private String name;
    private BigDecimal nettoPrice;
    private BigDecimal vat;

    public Item(String name, BigDecimal nettoPrice, BigDecimal vat) {
        this.name = name;
        this.nettoPrice = nettoPrice;
        this.vat = vat;
    }
}
