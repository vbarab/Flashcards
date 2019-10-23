package flashcards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the number of cards:");
        int quantity = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i < quantity + 1; i++) {
            System.out.println("The card #" + i + ":");
            String key = bufferedReader.readLine();
            System.out.println("The definition of the card #" + i + ":");
            String value = bufferedReader.readLine();
            map.put(key, value);
        }
        map.forEach((key, value) -> {
                    System.out.println("Print the definition of \"" + key + "\"");
                    try {
                        String s = bufferedReader.readLine();
                        if (value.equals(s)) {
                            System.out.println("Correct answer");
                        } else System.out.println("Wrong answer. The correct one is \"" + value + "\"");
                    } catch (IOException e) {
                        //e.printStackTrace();
                    }
                }
        );

    }
}
