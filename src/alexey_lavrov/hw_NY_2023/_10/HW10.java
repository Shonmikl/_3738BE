package alexey_lavrov.hw_NY_2023._10;

public class HW10 {
    /**
     * TODO: 10. Дана стринга String r = "otiwuklf'
     *  Написать метод где вы вводите символ а метод возвращает индекс.
     *  Если буквы нет то соответствующее сообщение
     */
    public static void main(String[] args) {
        System.out.println(getNumberOfSymbol('o'));
        System.out.println(getNumberOfSymbol('t'));
        System.out.println(getNumberOfSymbol('z'));

    }

    private static int getNumberOfSymbol(Character chr) {
        String str = "otiwuklf";
        int number = str.indexOf(chr);
        if (number >= 0) {
            return number;
        }
        throw new RuntimeException("Char not found");
    }
}