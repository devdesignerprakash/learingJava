public class DiceRoller {
    public static void main(String[] args) {
        printDiceRoll();
    }

    static void printDiceRoll(){
        String dice1="""
            +-------+
            |       |
            |   *   |
            |       |
            +-------+""";

        String dice2="""
            +-------+
            | *     |
            |       |
            |     * |
            +-------+""";
        String dice3="""
            +-------+
            | *     |
            |   *   |
            |     * |
            +-------+""";
        String dice4="""
            +-------+
            | *   * |
            |       |
            | *   * |
            +-------+""";
        String dice5="""
            +-------+
            | *   * |
            |   *   |
            | *   * |
            +-------+""";
        String dice6="""
            +-------+
            | *   * |
            | *   * |
            | *   * |
            +-------+""";
        int randomNumber = (int)(Math.random()*6)+1;
        switch (randomNumber){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);    
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid number");

    }
    }
}
