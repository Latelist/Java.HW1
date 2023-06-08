import java.util.Scanner;

// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class FourthTask {
    FourthTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter equation of type q + w = e, where q, w, e >= 0:");
        String exp = in.nextLine();
        in.close();
        everynum(splitter(exp));
    }

    public void printer(String[] strings) {
        for (int i = 0; i < strings.length; ++i) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
    
    public String[] splitter(String exp) {
        String[] elements = exp.split("\\s");
        return elements;
    }
    
    public String[] changer(String[] elements, int n) {
        char nn = Integer.toString(n).charAt(0);
        String[] newElements = new String[elements.length];
        for (int i = 0; i < elements.length; ++i) {
            if (elements[i].contains("?")) {
                newElements[i] = elements[i].replace('?', nn);
            } else {
                newElements[i] = elements[i];
            }
        }
        return newElements;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int[] toint(String[] elements) {
        int[] digits = new int[3];
        int counter = 0;
        for (int i = 0; i < elements.length; ++i) {
            if (isDigit(elements[i])) {
                digits[counter] = Integer.parseInt(elements[i]);
                ++counter;
            }
        }
        return digits;
    }

    public boolean calc(String[] elements, int[] digits) {
        boolean eq = false;
        String op = elements[1];
        int res = 0;
        if (op.equals("+")) {
            res = digits[0] + digits[1];
            if (res == digits[2]) {
                eq = true;
            }
        } else if (op.equals("-")) {
            res = digits[0] - digits[1];
            if (res == digits[2]) {
                eq = true;
            }
        } else if (op.equals("*")) {
            res = digits[0] * digits[1];
            if (res == digits[2]) {
                eq = true;
            }
        } else if (op.equals("/")) {
            res = digits[0] / digits[1];
            if (res == digits[2]) {
                eq = true;
            }
        }
        return eq;
    }
    
    
    public void everynum(String[] elements) {
        int counter = 0;
        for (int i = 0; i < 10; ++i) {
            String[] newElements = changer(elements, i);
            int[] newDigits = toint(newElements);
            if (calc(newElements, newDigits)) {
                printer(newElements);
                ++counter;
            }
        } if (counter == 0) {
            System.out.println("There is no solution");
        }
    }




}
