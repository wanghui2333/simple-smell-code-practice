package refactoring.kata.smell.alternative_classes_with_different_interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class MyPets {
    private static Logger logger = LoggerFactory.getLogger(MyPets.class);
    /**
     * @param args
     */
    public static void main(String[] args) {
        Animal gulu = new Cat("Gulu");
        Animal boniu = new Cat("Boniu");

        Animal langtou = new Dog("Langtou");
        Animal bangchui = new Dog("Bangchui");

        gulu.addFriends(boniu.getName());
        langtou.addFriends(bangchui.getName());

        if (gulu.isFriendWith(bangchui.getName())) {
            logger.debug("I can't believe it");
        }

        logger.info("info");
        logger.error("error");
        logger.debug("debug");
    }
}
