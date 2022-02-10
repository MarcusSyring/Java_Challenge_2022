public class Die {
    private int numSides;
    private int lastRoll;
    private int move;

    public Die() {
        numSides = 6;
        lastRoll = -1;
    }

    public Die(int N) {
        numSides = N;
        lastRoll = -1;
    }

    public int getNumSides() {
        return numSides;
    }

    public int getRoll() {
        int roll = (int) (1 + (Math.random()) * numSides);
        lastRoll = roll;
        return roll;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int getMove() {
        for (int i = 0; i < 10; i++) {
            move += getRoll();
        }
        System.out.println("Move Forward " + move + " Spaces");

        if (move%5 == 0) {
            System.out.println("Gain 100 points");
        } else if (move%12 == 0) {
            System.out.println("Lose 100 points");
        } else {
            System.out.println("End of turn");
        }
        return move;
    }
    
}
