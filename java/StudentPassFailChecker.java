import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
public class StudentPassFailChecker{
public static void main(String[] args){
    //int[] marks=new int[3];
    ArrayList<Integer> marksList=new ArrayList<>();
  float avgMarks=0;
    boolean x=false;
   // int i=0;
    //String status="Pass";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student's name :");
    String stdName=sc.nextLine();
    System.out.println("Enter Student's marks obtained");
    int z=0;
    while(true){
        String marks=sc.nextLine();
        if(marks.isEmpty()){
            break;
        }
        z=Integer.parseInt(marks);
        
        if(z<0 || z>100){
            System.out.println("Invalid mark entered");
            return;
        }
        if(z<30){
                x=true;
        }
        marksList.add(z);
    }

   
  
    for(int i=0;i<marksList.size();i++){
       
        avgMarks=avgMarks+marksList.get(i);
       // System.out.println("Marks entered:"+marks[i]);
    }
    
    /*Rules
    Average 50 or above->Pass
    Below 50 -> Fail
    Any single mark below 30 ->Fail automatically.
    if mark is not in between 0 and 100, throw ->Invalid mark entered.

    */
   avgMarks=avgMarks/marksList.size();
   BigDecimal bd=new BigDecimal(Double.toString(avgMarks));
   bd=bd.setScale(1,RoundingMode.HALF_UP);
   if(avgMarks<50){
    System.out.println(stdName+" - Average: "+bd+" - FAIL");
   }
   else if(x){
    System.out.println(stdName+" - Average: "+bd+" - FAIL (scored below 30 in one subject)");
   }
   else{
    System.out.println(stdName+" - Average: "+bd+" - PASS");
   }
    
   
   
   
}
}