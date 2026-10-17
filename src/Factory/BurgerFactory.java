package Factory;

import Controller.BasicBurger;
import Controller.Burger;
import Controller.PremiumBurger;
import Controller.StandardBurger;
import Enum.BurgerTypeEnum;

public class BurgerFactory {
    /**
     * Generate an object of Burger according to client requested type
     * @param type
     * @return Burger
     */
    public Burger createBurger(BurgerTypeEnum type) {
        if(type.equals((BurgerTypeEnum.BASIC))) {
            return new BasicBurger();
        } else if (type.equals(BurgerTypeEnum.STANDARD)) {
            return  new StandardBurger();
        }else {
            return new PremiumBurger();
        }
    }
}
