package decJavaProgramming.week6.coffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    static List<CoffeeMaker> coffeeMakers = Arrays.asList(new AutoDrip(), new AutomaticCoffeeMachine(), new FrenchPress());

    public static List<CoffeeMaker> asList(){
    return coffeeMakers;
    }

    public static Optional<CoffeeMaker> get(String name){
        for (CoffeeMaker coffeeMaker1 : coffeeMakers) {
            if (coffeeMaker1.getName().equalsIgnoreCase(name)){
                return Optional.of(coffeeMaker1);
            }

        }
        return Optional.empty();

    }

//    public static Boolean has(String name){
//        for (CoffeeMaker coffeeMaker : coffeeMakers) {
//            if (coffeeMaker.getName().equalsIgnoreCase(name)){
//                return true;
//            }
//        }return false;
//    }

}
