package earthquakesApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the latitude");
        float lat1 = scanner.nextFloat();
        System.out.println("Enter the longitude");
        float lon1 = scanner.nextFloat();

        TopTenPrinter topTenPrinter = new TopTenPrinter(lat1,lon1);

        topTenPrinter.topTenPrint();
    }
}