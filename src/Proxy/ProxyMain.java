package Proxy;

import java.util.Scanner;

public class ProxyMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        Proxy proxy = new Proxy();
        while(repeat){
            System.out.println("Podaj a");
            Double a = scan.nextDouble();
            System.out.println("Podaj b");
            Double b = scan.nextDouble();
            System.out.println("Podaj c");
            Double c = scan.nextDouble();
            proxy.computeQuadraticFormulaSolutions(a,b,c);
            System.out.println("Kliknij 0, dowolną liczbę, by kontynować");
            if(scan.nextDouble() == 0){
                repeat = false;
            }

        }
    }
}
