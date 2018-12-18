package NovJavaProgramming.Hike;

import NovJavaProgramming.Hike.gatherer.Gatherer;

import java.util.ArrayList;
import java.util.List;

public class Hike {

    private List<Hiker>hikers = new ArrayList<>();


    public void Gatherer(){
        Gatherer gatherer = new Gatherer();
        hikers = gatherer.signUp();
    }

    public void showHikers(){
        for (Hiker hiker :hikers) {
            System.out.println("the hiker name is " + hiker.getName());
        }
    }
}
