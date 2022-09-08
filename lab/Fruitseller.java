// A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:how many apples ??


public class Fruitseller {
    public static void main(String[] args) {
        int total_apple = 420;
        int sold = 40;
        int remaining = 60;

        int total_apples = (total_apple * 100) / remaining;
        System.out.println("Fruit seller has remaining " + total_apples + " apples");
    }
}
