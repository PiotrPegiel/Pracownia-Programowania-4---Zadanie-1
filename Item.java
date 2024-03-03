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

    public BigDecimal getNettoPrice() {
        return nettoPrice;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public BigDecimal getVatAmmount(){
        return nettoPrice.multiply(vat);
    }
}
