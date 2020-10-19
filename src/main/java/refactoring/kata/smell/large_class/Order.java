package refactoring.kata.smell.large_class;

import java.math.BigDecimal;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Order {
    private String id;
    private BigDecimal money;

    public Order(String id, BigDecimal money) {
        this.id = id;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getMoney() {
        return money;
    }
}
