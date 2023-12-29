package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void main(String[] args) {

    }
    public void vowelDeterminer(char character) {
        if (Character.toLowerCase(character) == 'a' || Character.toLowerCase(character) == 'e'
                || Character.toLowerCase(character) == 'i' || Character.toLowerCase(character) == 'u'
                || Character.toLowerCase(character) == 'o'
                ) {
            System.out.println("Vowel");
        }else if(Character.toLowerCase(character) == 'b'|| Character.toLowerCase(character) == 'c' ||
                Character.toLowerCase(character) == 'f' || Character.toLowerCase(character) == 'd'||
                Character.toLowerCase(character) == 'j'|| Character.toLowerCase(character) == 'k'||
                Character.toLowerCase(character) == 'l' || Character.toLowerCase(character) == 'm'||
                Character.toLowerCase(character) == 'n' || Character.toLowerCase(character) == 'v' ||
                Character.toLowerCase(character) == 'w'|| Character.toLowerCase(character) == 'x'||
                Character.toLowerCase(character) == 'y' || Character.toLowerCase(character) == 'z'||
                Character.toLowerCase(character) == 'r' || Character.toLowerCase(character) == 'p' ||
                Character.toLowerCase(character) == 'q'|| Character.toLowerCase(character) == 's' ||
                Character.toLowerCase(character) == 'g'|| Character.toLowerCase(character) == 'h' ||
                Character.toLowerCase(character) == 't'){
            System.out.println("Consonant");
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
