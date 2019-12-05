package Proxy;

import java.util.Scanner;

public class ProxyMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            System.out.println("Podaj a");
            Double a = scan.nextDouble();
            System.out.println("Podaj b");
            Double b = scan.nextDouble();
            System.out.println("Podaj c");
            Double c = scan.nextDouble();
            QuadraticFormula quadraticFormula = new QuadraticFormula(a,b,c);
            QuadraticFormulaResult result;
            try{
                result = quadraticFormula.getQuadraticFormulaSolutions();
                System.out.format("Rozwiązania to: %5.3f and %5.3f", result.getX1(),result.getX2());
            }
            catch (Exception e){
                System.out.println("\nBrak rozwiązania w zbiorze liczb rzeczywistych");
            }
            System.out.println("Kliknij 0, dowolną liczbę, by kontynować");
            if(scan.nextDouble() == 0){
                repeat = false;
            }

        }
    }
}
