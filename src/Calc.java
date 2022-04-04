public class Calc {
    public static int calculeted(int a, int b, String c) throws Exception {
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
        else {
            throw new Exception("Incorrect number format!!!");
        }
        return 0;
    }
}
