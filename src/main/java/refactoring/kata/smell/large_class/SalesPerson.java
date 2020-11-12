package refactoring.kata.smell.large_class;

import java.util.Date;

/**
 * Person类过大，请将它重构成三个类，Person及其两个子类：Manager, SalesPerson
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class SalesPerson extends Person{

    /**
     * 订单审批同意，只有管理员才可以进行此操作
     *
     * @param order
     */
    @Override
    public void approve(Order order) {
        throw new RuntimeException("Only manager can approve order. "+ order.getId());
    }

    /**
     * 订单审批拒绝，只有管理员才可以进行此操作
     *
     * @param order
     */
    @Override
    public void decline(Order order) {
        throw new RuntimeException("Only manager can approve order. " + order.getId());
    }

    /**
     * 发起订单审批申请
     *
     * @param order   订单
     */
    @Override
    public void apply(Order order) {
        //omit implementation
    }

}
