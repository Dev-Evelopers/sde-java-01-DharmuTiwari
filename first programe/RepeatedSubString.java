import java.util.*;
public class RepeatedSubString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : s =");
        String input=sc.nextLine();
        int j;
        int count = 0;
        for (int i = 0; i < input.length(); i++)
         {
            for (j = 0; j < i; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    break; 
                }
            }
            if ( j == i) {  
                count++; 
            }
        }
        System.out.println("OutPut : " + count);
         Set<Character> distinctSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            distinctSet.add(c);
        }
        // Convert set to list and sort
        List<Character> charList = new ArrayList<>(distinctSet);
        Collections.sort(charList);
        System.out.println("Explanation :");
        System.out.println("All characters in the string: " + charList);

// Convert set to string
        StringBuilder sb = new StringBuilder();
        for (char c : charList) {
            sb.append(c);
        }

        String result = sb.toString();
     System.out.print("The shortest substring that contains all letters is : \"" + result + "\"");

        sc.close();
       
    
}
}