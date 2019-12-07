package Proxy;

public class Proxy {
    private Double a,b,c;
    private QuadraticFormulaResult result;

    void computeQuadraticFormulaSolutions(Double a, Double b, Double c) {
        if(this.a == null){
            this.a = a;
            this.b = b;
            this.c = c;
            QuadraticFormula quadraticFormula = new QuadraticFormula(a,b,c);
            result = quadraticFormula.getQuadraticFormulaSolutions();
        }
        if(this.a.equals(a) && this.b.equals(b) && this.c.equals(c)){
            System.out.format("Proxy: Rozwiązania to: %5.3f and %5.3f", result.getX1(), result.getX1());
        }
        else{
            this.a = a;
            this.b = b;
            this.c = c;
            QuadraticFormula quadraticFormula = new QuadraticFormula(a,b,c);
            result = quadraticFormula.getQuadraticFormulaSolutions();
            System.out.format("Nowy obiekt: Rozwiązania to: %5.3f and %5.3f", result.getX1(),  result.getX2());
        }
    }

}
