public class Calc {
    public static int calculeted(int a, int b, String c){
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
            System.err.println("Incorrect number format!!!");
            System.exit(0);
        }

        return 0;
    }
}
