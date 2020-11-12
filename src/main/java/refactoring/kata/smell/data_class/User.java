package refactoring.kata.smell.data_class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class User {
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
     * 年龄
     */
    private int age;
    /**
     * 联系地址
     */
    private String province;
    private String city;
    private String street;
    private String address;
    private String telephone;
    private String mobilePhone;

    public void changeAddress(String fullAddress) {
        String[] list = fullAddress.split(" ");
        this.setProvince(list[0]);
        this.setCity(list[1]);
        this.setStreet(list[2]);
        this.setAddress(list[3]);
        this.setTelephone(list[4]);
        this.setMobilePhone(list[5]);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        Date now = new Date();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(this.getBirthday()));
        int d2 = Integer.parseInt(formatter.format(now));
        int age = (d2 - d1) / 10000;
        return age;
    }

}
