public class Incre_Decre_Operation {
    public static void main(String[] args) {


        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--;    //Decremento
        System.out.println(lives); //3

        lives++;
        System.out.println(lives); //4

        /* Modo Prefijo */
        //int gift = 100 + lives++; // 104
        int gift = 100 + ++lives;   // 105
        System.out.println(gift);

        gift *= 7;
        gift += 10;

    }
}
