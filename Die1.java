public class Die1 {

    public Die1() {

    }
    //runs dice roll 20 times
    public static void main(String[] args) {

        int numRolls = 0;

        while (numRolls < 20) {
            System.out.println((int) (1+ (Math.random()) * 6));
            numRolls++;
        };

    }
}
