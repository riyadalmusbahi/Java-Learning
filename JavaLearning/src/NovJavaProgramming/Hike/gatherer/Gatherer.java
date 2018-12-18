package NovJavaProgramming.Hike.gatherer;

import NovJavaProgramming.Hike.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {

    public List<Hiker> signUp(){
        List<Hiker> hikers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("is there any hikers that want to sign up ? if there aren't any hikers press ENTER ");
        String answer = scanner.nextLine();
        if (answer.isEmpty()){
            System.out.println("No body had signed up for the NovJavaProgramming.Hike ");
        }

        while (!answer.isEmpty()) {
            System.out.println("to Sign up");
            System.out.println("Please Enter your name :");
            String name = scanner.nextLine();
            Hiker hiker = new  Hiker(name);
            hikers.add(hiker);
            System.out.println("is there any hikers that want to sign up ? if there aren't any hikers press ENTER ");
            answer = scanner.nextLine();
            }
        return hikers;

    }

}
