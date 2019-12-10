package Proxy;

public class QuadraticFormula {
    private Double a,b,c;

    QuadraticFormula(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Double computeDelta(){
        return b*b -4 * a * c;
    }

    private Double computeX1(Double delta){
        return (-b  -Math.sqrt(delta))/(2*a);
    }

    private Double computeX2(Double delta){
        return (-b  +Math.sqrt(delta))/(2*a);
    }

     QuadraticFormulaResult getQuadraticFormulaSolutions(){
        Double delta = computeDelta();
        return new QuadraticFormulaResult(computeX1(delta),computeX2(delta));
    }
}
