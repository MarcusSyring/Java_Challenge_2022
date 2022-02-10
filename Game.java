public class Game {
    public static void main(String[] args) {
        Die num = new Die();
        System.out.println("Last Roll = " + num.getLastRoll());
        System.out.println(num.getRoll());
        System.out.println("Last Roll = " + num.getLastRoll());
        System.out.println("Sides = " + num.getNumSides());
        System.out.println("Time for the big roll");
        num.getMove();
       }
}
