package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void main(String[] args) {
        isEnglishSymbol('K');
    }
    public static void isEnglishSymbol(char symbol) {
        if (Character.toLowerCase(symbol) == 'a' || Character.toLowerCase(symbol) == 'b'|| Character.toLowerCase(symbol) == 'c'
                || Character.toLowerCase(symbol) == 'd'|| Character.toLowerCase(symbol) == 'e'|| Character.toLowerCase(symbol) == 'f'
                || Character.toLowerCase(symbol) == 'g'|| Character.toLowerCase(symbol) == 'h'|| Character.toLowerCase(symbol) == 'i'
                || Character.toLowerCase(symbol) == 'j'|| Character.toLowerCase(symbol) == 'k'|| Character.toLowerCase(symbol) == 'l'
                || Character.toLowerCase(symbol) == 'm'|| Character.toLowerCase(symbol) == 'n'|| Character.toLowerCase(symbol) == 'o'
                || Character.toLowerCase(symbol) == 'p'|| Character.toLowerCase(symbol) == 'q'|| Character.toLowerCase(symbol) == 's'
                || Character.toLowerCase(symbol) == 't'|| Character.toLowerCase(symbol) == 'u'|| Character.toLowerCase(symbol) == 'v'
                || Character.toLowerCase(symbol) == 'w'|| Character.toLowerCase(symbol) == 'x'|| Character.toLowerCase(symbol) == 'y'
                || Character.toLowerCase(symbol) == 'z'|| Character.toLowerCase(symbol) == 'r' ) {
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
