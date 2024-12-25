import java.util.*;

public class Main {

    public static void takeInput(Map<Character,List<String>> alphabetWordMap) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words  or 'exit' to stop):");
        
        String word = scanner.nextLine();
        while (!word.equalsIgnoreCase("exit")) 
        {         
            char firstChar=Character.toLowerCase(word.charAt(0));
            
            if (alphabetWordMap.get(firstChar) != null) 
            {
                alphabetWordMap.get(firstChar).add(word);
            }
            else 
            {
                System.out.println("The word does not start with a valid alphabet.");
            }
            word = scanner.nextLine();
        }


    }
    /////////////////////////////////////////////////////////////////////////////////////////
  
    public static void sortList(Map<Character,List<String>> alphabetWordMap) 
    {
        alphabetWordMap.forEach((k,v) -> {
            Collections.sort(v);
        });

    }
    /////////////////////////////////////////////////////////////////////////////////////////
    public static void displayAll(Map<Character,List<String>> alphabetWordMap) 
    {
        System.out.println("\nAlphabets and their related words:");

        alphabetWordMap.forEach((k,v) -> {
            if(!v.isEmpty()){
                System.out.println(k+":"+v);
            }
            else{
                System.out.println(k+" do not have related words \n");


            }
        });

    }
    /////////////////////////////////////////////////////////////////////////////////////////
    public static void getWords(Map<Character,List<String>> alphabetWordMap,char letter) 
    {
        System.out.println("\n the given letter and its related words:");

        if (alphabetWordMap.get(letter) != null) 
        {
            System.out.println(alphabetWordMap.get(letter));
        }
        else{
            System.out.println(" do not have related words for this letter\n");
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) 
    {

        Map<Character,List<String>> alphabetWordMap = new HashMap<>();
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetWordMap.put(ch, new ArrayList<>());
        }
        
        takeInput(alphabetWordMap);
        sortList(alphabetWordMap);
        displayAll(alphabetWordMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter to search for its related words:");
        
        String alphabet = scanner.nextLine();
        char letter = Character.toLowerCase(alphabet.charAt(0)); 
        getWords(alphabetWordMap,letter);

    }
}
