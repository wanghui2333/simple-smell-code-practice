package refactoring.kata.smell.large_class;

import java.util.Date;

/**
 * Person类过大，请将它重构成三个类，Person及其两个子类：Manager, SalesPerson
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Manager {


    /**
     * 订单审批同意，只有管理员才可以进行此操作
     *
     * @param order
     */
    public void approve(Order order) {


        //...
    }

    /**
     * 订单审批拒绝，只有管理员才可以进行此操作
     *
     * @param order
     */
    public void decline(Order order) {


        //...
    }

    /**
     * 发起订单审批申请
     *
     * @param manager 审批人
     * @param order   订单
     */
    public void apply(SalesPerson manager, Order order) {
        throw new RuntimeException("Manager can't apply order. " + order.getId());
    }

}
