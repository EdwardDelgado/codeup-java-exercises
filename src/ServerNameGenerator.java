import java.util.Random;

public class ServerNameGenerator {

         private static String[] adjectives = new String[]{"Scared", "Happy", "Emotional", "Pregnant", "Senile", "Hungry", "Competitive", "Dangerous", "Aggressive", "Pure"};

         private static String[] nouns = {"Art", "Government", "Literature", "Software", "Knowledge", "Science", "Library", "Investment", "Society", "Analysis"};

    public static String getRandom(String[] server) {
        Random random = new Random();
        int rand = random.nextInt(server.length);
        return server[rand];
    }
    public static void main(String[] args) {
        System.out.println("Here is your server name: \n "
                + getRandom(adjectives) + " - " + getRandom(nouns));

    }

}