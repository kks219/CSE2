public class Shuffling{
    public static void shuffle(String[] list){
        System.out.println("Shuffled");
            for(int i = 0; i < list.length; i++){
                String temp = "";
                int j = (int)(Math.random() * (i + 1));
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
    }
    public static String [] randomizeHand(String [] list){
        System.out.println("Randomized hand!");
            for(int i = 0; i < 5; i++){
                String temp = "";
                int j = (int)(Math.random() * (list.length));
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        return list;
    }
    public static void printArray(String[] list){
        String line = "";
        for (int i = 0; i < list.length; i++){
            line = line + " " + list[i];
        }
        System.out.println(line);
    }
    public static void main (String [] agrs){
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
        }
        printArray(cards);
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);
    }
}