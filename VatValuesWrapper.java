import java.math.BigDecimal;
// Deprecated class. Present for keepsake and possible future changes
public class VatValuesWrapper {
    private BigDecimal totalVatAmmount;
    private BigDecimal totalNettoAmmount;
    private BigDecimal totalBruttoAmmount;

    public VatValuesWrapper(BigDecimal totalVatAmmount, BigDecimal totalNettoAmmount, BigDecimal totalBruttoAmmount) {
        this.totalVatAmmount = totalVatAmmount;
        this.totalNettoAmmount = totalNettoAmmount;
        this.totalBruttoAmmount = totalBruttoAmmount;
    }

    public BigDecimal getTotalVatAmmount() {
        return totalVatAmmount;
    }

    public BigDecimal getTotalNettoAmmount() {
        return totalNettoAmmount;
    }

    public BigDecimal getTotalBruttoAmmount() {
        return totalBruttoAmmount;
    }

    public void addTotalVatAmmount(BigDecimal totalVatAmmount) {
        this.totalVatAmmount.add(totalVatAmmount);
    }

    public void addTotalNettoAmmount(BigDecimal totalNettoAmmount) {
        this.totalNettoAmmount.add(totalNettoAmmount);
    }

    public void addTotalBruttoAmmount(BigDecimal totalBruttoAmmount) {
        this.totalBruttoAmmount.add(totalBruttoAmmount);
    }
}
