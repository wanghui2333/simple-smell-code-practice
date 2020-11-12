package refactoring.kata.smell.large_class;

import java.util.Date;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public abstract class Person {
    /**
     * 员工ID
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 联系地址
     */
    private String province;
    private String city;
    private String street;
    private String address;
    private String telephone;
    private String mobilePhone;

    /**
     * 订单审批同意
     *
     * @param order
     */
    public abstract void approve(Order order);

    /**
     * 订单审批拒绝
     *
     * @param order
     */
    public abstract void decline(Order order);

    /**
     * 发起订单审批申请
     *
     * @param order   订单
     */
    public abstract void apply(Order order);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
