package Proxy;

public class Proxy {
    Double a,b,c;
    QuadraticFormulaResult result;
    String saveSolution;

    public Proxy(){    }

    public void setFactors(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean checkFactorEquality(Double a, Double b, Double c){
        if(this.a.equals(a) && this.b.equals(b) && this.c.equals(c)){
            return true;
        }
        return false;

    }

    String returnSaveSolution(){
        return saveSolution;
    }

    void computeQuadraticFormulaSolutions(Double a, Double b, Double c) {
        checkFactorEquality(a,b,c);
        QuadraticFormula quadraticFormula = new QuadraticFormula(a,b,c);
        try {
            result = quadraticFormula.getQuadraticFormulaSolutions();
            saveSolution = "Rozwiązania to: " + result.getX1() + " and " + result.getX2();
        } catch (Exception e) {
            saveSolution = "Brak rozwiązania w zbiorze liczb rzeczywistych";
        }
    }

    void getQuadraticFormulaSolutions(){

    }

}
