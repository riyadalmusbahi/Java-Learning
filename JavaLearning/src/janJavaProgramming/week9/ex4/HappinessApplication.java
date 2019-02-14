//package janJavaProgramming.week9.ex4;
//
//import NovJavaProgramming.dataStructure.printShop.FileReader;
//
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class HappinessApplication {
//
//    public static void main(String[] args) {
//        new FileReader().asStream("exercise/week9/source/world-happiness-2017.csv")
//                .skip(1)
//                .map(line -> line.split(";"))
//                .map(columns -> new HappinessRecord(columns[0], Integer.valueOf(columns[1]), Double.valueOf(columns[2])))
//                .forEach(e-> System.out.println(e));
//
//
//
//
//
//    }
//
//
//
//
//}
