import java.util.Scanner;
public class StudentPassFailChecker{
public static void main(String[] args){
    int[] marks=new int[3];
    int i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student's name :");
    String stdName=sc.nextLine();
    System.out.println("Enter Student's marks obtained");
    for(i=0;i<=2;i++){
        marks[i]=sc.nextInt();
       // System.out.println("Marks entered:"+marks[i]);
        if(marks[i]<0 || marks[i]>100){
            System.out.println("Invalid mark entered");
            return;
        }
    }
    /*Rules
    Average 50 or above->Pass
    Below 50 -> Fail
    Any single mark below 30 ->Fail automatically.
    if mark is not in between 0 and 100, throw ->Invalid mark entered.

    */
   double avgMarks=0;
   for(i=0;i<=2;i++){
    if(marks[i]<30){
        System.out.println("Fail");
        return;
    }
    else{
        avgMarks=avgMarks+marks[i];
    }
   }
   if((avgMarks/3)>=50){
    System.out.println("Pass");
   }
   else if((avgMarks/3)<50){
    System.out.println("Fail");
   }
}
}