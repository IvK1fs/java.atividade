package application;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
      Scanner sc = new Scanner(System.in);
      System.out.println("insira os dois numeros: ");
      int num = sc.nextInt();
      int num2 = sc.nextInt();
    
      
      if(num %num2 ==0 || num2 %num == 0 ){
          
          System.out.println("multiplos");
          
      } else {
          
          System.out.println("não multiplos");
      }
        sc.close();
    }
}
