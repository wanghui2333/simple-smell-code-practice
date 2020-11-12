package refactoring.kata.smell.long_parameter_list.exercise2;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class EnvolopePrinter {
    public String printEnvolope(Envolope envolope) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s",
                envolope.getFirstName(), envolope.getLastName(), envolope.getAreaCode(),
                envolope.getCity(), envolope.getStreet(), envolope.getAddress(), envolope.getPhoneNo());
    }
}
