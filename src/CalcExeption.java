

public class CalcExeption extends Exception {
    public CalcExeption(boolean s) {
        System.err.println("EXCEPTION: A lot of symbols!!! ");
    }
    public CalcExeption (String s){
        System.err.println("Roman numbers cant be <= 0: ");
    }

    public CalcExeption(int s){
        System.err.println("Your example is incorrect: ");
    }
}
