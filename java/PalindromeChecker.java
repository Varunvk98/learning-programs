import java.util.ArrayList;
import java.util.Scanner;
public class PalindromeChecker{
    public static void main(String[]args){
        String userInput;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter word or sentence to check if its palindrome");
        userInput=sc.nextLine();
        
        String userInput1="";
        String userInput2="";
        char x;
        long charCount=userInput.chars().count();
      //System.out.println(userInput.chars().count());
      
      for(int i=0;i<charCount;i++){
        x=userInput.charAt(i);
        if((x>='A' && x<='Z') || (x>='a' && x<='z') || (x>='0' && x<='9')){
            userInput1=userInput1+x;
            //userInput2=x+userInput2;
        }

      }
      //3
      StringBuilder reverseStr=new StringBuilder(userInput1);
      userInput2=reverseStr.reverse().toString();
      if(userInput1.equalsIgnoreCase(userInput2)){
        System.out.println(userInput+" is a palindrome");
      }
      else{
        System.out.println(userInput+" is not a palindrome");
      }

/*
      //2.trying arrayList
      ArrayList<Character> list=new ArrayList<>();
      for(int i=0;i<charCount;i++){
        x=userInput.charAt(i);
        if((x>='A' && x<='Z') || (x>='a' && x<='z') || (x>='0' && x<='9')){
           x=Character.toLowerCase(x);
           list.add(x);
        }
        if(list.equals(list.reversed())){
            System.out.println(userInput+" is a palindrome");
      }
      else{
        System.out.println(userInput+" is not a palindrome");
      }
        }
        */
      
      
    }
}