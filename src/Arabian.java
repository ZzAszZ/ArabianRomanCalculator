import java.util.Scanner;

public class Arabian {
    public static String[] example;                                    // Массив данных пользователя.

    public static void main(String[] args) {                            //Старт программы.

        Scanner scanner = new Scanner(System.in);                          //Создаем обьект сканер.

        System.out.println("Enter your example Arabian (1-10) Roman I-X, " +
                "use space after all symbols example: [6 + 6] or [V + V ]: "); //Запрос у пользователя ввода выражения.

        String user_Input = scanner.nextLine();                                //Ввод пользователем выражения.

        example = user_Input.split(" ");                        //Делим Массив по пробелам.



        try {                     // В случае невозможности считать арабское число пытаемся считать римские.
            int a1 = Integer.parseInt(example[0]);                      //Считываем Арабское число
            int a2 = Integer.parseInt(example[2]);                      //Считываем Второе Арабское число
            String operation = example[1];


            System.out.println("Result for Arabic: " + Calc.calculeted(a1, a2, operation)); // Вывод на экран результата для араских чисел
        } catch (NumberFormatException ex){
            int r1 = Convers.rta(example[0]);   //Римское число 1
            int r2 = Convers.rta(example[2]);   //Римское число 2
            String operation = example[1];      //Операнда
            int arResult = Calc.calculeted(r1, r2, operation);
            System.out.println("Result for Roman: " + Convers.convert(arResult)); // Результат Римских цифр.
        }
    }
}


