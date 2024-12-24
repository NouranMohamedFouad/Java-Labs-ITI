
public class task2 
{

    public static void main(String[] args) {
        String s1 = "Hello123";
        String s2 = "Hello";

        
        
        boolean result1= Alphabet.isOnlyAlphabets(s1,Character::isLetter);
        boolean result2= Alphabet.isOnlyAlphabets(s2,Character::isLetter);


        System.out.println(s1 + " ,is alpha? " + result1); 
        System.out.println(s2 + ",is alpha? " + result2); 

        
        
        
    }
}
  
  
  

