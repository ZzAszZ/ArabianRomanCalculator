public class Calc {
    public static int calculeted(int a, int b, String c) throws CalcExeption {
        if (a>0 && a<=10 && b>=0 && b<10) {
            if (c.equals("+")) {
                return (a + b);
            }
            if (c.equals("-")) {
                return (a - b);
            }
            if (c.equals("*")) {
                return (a * b);
            }
            if (c.equals("/")) {
                return (a/b);
            }
        }
        else
            throw new CalcExeption(1);

        return 0;
    }
}
