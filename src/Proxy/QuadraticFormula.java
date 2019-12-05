package Proxy;

public class QuadraticFormula {
    private Double a,b,c;

    public QuadraticFormula(Double a, Double b, Double c) {
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

     QuadraticFormulaResult getQuadraticFormulaSolutions() throws Exception{
        Double delta = computeDelta();
        if(delta < 0){
            throw new Exception("Delta ujemna");
        }
        return new QuadraticFormulaResult(computeX1(delta),computeX2(delta));
    }
}
