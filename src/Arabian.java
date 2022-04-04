import java.util.Scanner;

public class Arabian {
    public static String[] example;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your example Arabian (1-10) Roman I-X, " +
                "use space after all symbols example: [6 + 6] or [V + V ]: ");

        String user_Input = scanner.nextLine();
        example = user_Input.split(" ");

        if (example.length > 3) {
            System.err.println("Incorrect mathematics example a lot of symbols!!! ");
            System.exit(0);
        }


            try {
                int a1 = Integer.parseInt(example[0]);
                int a2 = Integer.parseInt(example[2]);
                String operation = example[1];

                System.out.println("Result for Arabic: " + Calc.calculeted(a1, a2, operation));
            }
             catch (NumberFormatException ignored) {

                int a = Convers.rta(example[0]);
                int b = Convers.rta(example[2]);
                String operation = example[1];
                int arResult = Calc.calculeted(a, b, operation);
                System.out.println("Result for Roman: " + Convers.convert(arResult));
            }
    }
}


