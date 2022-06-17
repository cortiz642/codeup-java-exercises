public class ServerNameGenerator {
    public static String[] adjectives = {"accomplished", "adaptable", "adventurous", "affectionate", "amazing", "amicable", "ambitious", "articulate", "careful", "cheerful"};

    public static String[] nouns = {"answer", "battery", "army", "breakfast", "joy", "optimism", "confidence", "strength", "respect", "leadership"};

    public static String random(String[] arr){
        return arr[(int)Math.floor((Math.random() * (arr.length -1)))];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(random(adjectives) + " " + random(nouns));
    }
}
