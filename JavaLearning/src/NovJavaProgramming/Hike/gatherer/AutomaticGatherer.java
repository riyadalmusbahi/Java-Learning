package NovJavaProgramming.Hike.gatherer;

import NovJavaProgramming.Hike.Hiker;

import java.util.ArrayList;
import java.util.List;

 class AutomaticGatherer {

    List<Hiker> getConfirmedHikers() {

        List<Hiker> confirmedHikers = new ArrayList<>();

        Hiker hiker1 = new Hiker("Ali");
        Hiker hiker2 = new Hiker("Mo");
        Hiker hiker3 = new Hiker("Dello");
        Hiker hiker4 = new Hiker("Khajag");
        Hiker hiker5 = new Hiker("Mustafa");

        confirmedHikers.add(hiker1);
        confirmedHikers.add(hiker2);
        confirmedHikers.add(hiker3);
        confirmedHikers.add(hiker4);
        confirmedHikers.add(hiker5);

        return confirmedHikers;



    }

}
