package refactoring.kata.smell.alternative_classes_with_different_interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Animal {
    private String name;
    private List<String> friends = new ArrayList<>();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFriendWith(String name) {
        return friends.contains(name);
    }

    public void addFriends(String name) {
        friends.add(name);
    }

    public List<String> getFriends() {
        return Collections.unmodifiableList(friends);
    }
}
