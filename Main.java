import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.addItem("Clean Code, Robert C. Martin", new BigDecimal("100.00"), new BigDecimal("0.08"));
        receipt.addItem("Applying UML and Patterns, C. Larman", new BigDecimal("300.00"), new BigDecimal("0.08"));
        receipt.addItem("Shipping", new BigDecimal("50.00"), new BigDecimal("0.23"));

        receipt.printReceipt();
    }
}
