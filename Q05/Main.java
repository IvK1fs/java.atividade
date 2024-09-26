package application;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
      Scanner sc = new Scanner(System.in);
      System.out.println("insira as horas: ");
      
      double num = sc.nextDouble();
      
    
      
     
      if(num <= 25 && num >= 0 ){
         System.out.println("[0,25]");
          
      } else if(num > 25  && num <= 50 )  {
          System.out.println("[25,50]");
             
      } else if(num> 50 && num <= 75 ) {
           System.out.println("[50,75]");
          
      }else if(num > 75 && num <= 100){
       System.out.println("[75,100]");
	   }else {
	    System.out.println("Fora do intervalo");
	   }


        sc.close();
    }
}
