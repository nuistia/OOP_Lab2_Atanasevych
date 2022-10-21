package Lab2;

public class Tasks {
    //задание 1
    static boolean endsWithEd(String s) {
        return (s.endsWith("ed")) || (s.endsWith("ed."));
    }

    //задание 2
    static int sumOfDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) { //если и-тый эл-нт в строке является числом
                sum += Integer.parseInt(String.valueOf(s.charAt(i))); //его значение добавляем к сумме
            }
        }
        return sum;
    }

    //задание 3
    static int lengthOfBlock(String s) {
        char c = s.charAt(0);       // первый элемент сохраняем в "c";
        int max = 0;
        int len = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) { // если и-тый элемент - это "c", то увеличиваем длину на 1
                len++;
            } else {
                c = s.charAt(i);    // если нет, то "с" = следующий элемент,
                len = 1;            // и восстанавливаем длину;
            }
            // если длина больше значение максимальной, то обновляем максимум
            if (len > max) {
                max = len;
            }
        }
        return max;
    }

    //задание 4
    static void foundWords(String s) {
        System.out.println("Initial string:");
        System.out.println(s);
        System.out.println("Split words:");
        for (String w : s.split(" ")) {       //делим рядок на слова
            System.out.println(w);                  //выводим по слову
        }
    }

    //задание 5
    static String mixStrings(String a, String b) {
        int maxLen;
        String ab = "";
        maxLen = Math.max(a.length(), b.length()); //находим наиболее длинную строку, запоминаем её длину
        for (int i = 0; i < maxLen; i++) {
            if (maxLen == a.length()) { //если самая длинная "а",
                if (i < b.length()) {   //то "б" будет добавляться до тех пор, пока "и" меньше её длины
                    ab = ab.concat(String.valueOf(b.charAt(i)));
                }
                ab = ab.concat(String.valueOf(a.charAt(i)));
            } else { //если самая длинная "б",
                if (i < a.length()) { //то "а" будет добавляться до тех пор, пока "и" меньше её длины
                    ab = ab.concat(String.valueOf(a.charAt(i)));
                }
                ab = ab.concat(String.valueOf(b.charAt(i)));
            }
        }
        return ab;
    }
}
