package refactoring.kata.smell.comments;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class User {
    /**
     *  first name
     */
    private String firstName;
    /**
     *  last name
     */
    private String lastName;

    /**
     * 获取完整姓名
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }


}
