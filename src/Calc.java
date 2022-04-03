public class Calc {
    public static int calculeted(int a, int b, String c) {
        if (a>=0 && a<=10 && b>=0 && b<=10) {  // Проверка на соответствие условий  диапазона ввода чисел
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
            System.out.println("Incorrect parameters");
        return 0;

    }
}
