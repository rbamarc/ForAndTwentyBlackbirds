public class ForAndTwentyBlackbirds {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int birdsInPie = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Blackbirds #" + i + " goes into the pie");
            birdsInPie++;
        }

        System.out.println("there are " + birdsInPie + " birds in there!");
        System.out.println("Quite a full pie");
    }
}
