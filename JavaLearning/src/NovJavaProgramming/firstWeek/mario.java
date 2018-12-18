package NovJavaProgramming.firstWeek;

import java.util.Scanner;

public class mario {

    public static void main(String[] args) {

        System.out.println("Enter a number between 0 and 23 telling how big do you want the pyramid ? : ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer height = getRightNumber(number);

        Integer total = height + 1;
        Integer numberSpaces = height - 1;
        Integer numberBlocks = total - numberSpaces;
        for (int i = 0; i < height; i++) {


            for (int i1= 0; i1< numberSpaces; i1++) {
                System.out.print(" ");
            }
            for (int i2= 0; i2 < numberBlocks; i2++) {
                System.out.print("#");
            }

            numberSpaces--;
            numberBlocks++;
            System.out.format("\n");
        }


    }




    public static Integer getRightNumber(Integer number) {
        while (number>23 || number<0) {
            System.out.println("Enter how big do you want the pyramid ? : ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

        }
        return number;
    }


}