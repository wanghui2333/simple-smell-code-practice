package refactoring.kata.smell.alternative_classes_with_different_interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class MyPets {
    private static Logger logger = LoggerFactory.getLogger(MyPets.class);
    /**
     * TODO:
     * Cat和Dog是类似的类，需要统一接口
     * @param args
     */
    public static void main(String[] args) {
        Cat gulu = new Cat("Gulu");
        Cat boniu = new Cat("Boniu");

        Dog langtou = new Dog("Langtou");
        Dog bangchui = new Dog("Bangchui");

        gulu.addCatFriends(boniu.getName());
        langtou.addDogFriends(bangchui.getName());

        if (gulu.isCatFriendWith(bangchui.getName())) {
            logger.debug("I can't believe it");
        }

        logger.info("info");
        logger.error("error");
        logger.debug("debug");
    }
}
