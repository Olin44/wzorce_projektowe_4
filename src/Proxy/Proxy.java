package Proxy;

public class Proxy {
    private Double a,b,c;
    private QuadraticFormulaResult result;

    void computeQuadraticFormulaSolutions(Double a, Double b, Double c) {
        if(result == null){
            newResult(a,b,c);
        }
        else {
            if (this.a.equals(a) && this.b.equals(b) && this.c.equals(c)) {
                System.out.format("\nProxy: Rozwiązania to: %5.3f and %5.3f", result.getX1(), result.getX1());
            } else {
                newResult(a,b,c);
            }
        }
    }

    void newResult(Double a, Double b, Double c){
        this.a = a;
        this.b = b;
        this.c = c;
        QuadraticFormula quadraticFormula = new QuadraticFormula(a, b, c);
        result = quadraticFormula.getQuadraticFormulaSolutions();
        System.out.format("\nNowy obiekt: Rozwiązania to: %5.3f and %5.3f", result.getX1(), result.getX2());
    }
}
