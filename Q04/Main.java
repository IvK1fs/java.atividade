package application;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
      Scanner sc = new Scanner(System.in);
      System.out.println("insira as horas: ");
      
      int num = sc.nextInt();
      
      int num2 = sc.nextInt();
      
     int horaDia = 24;
      int calc;
      
      if(num > num2 || num == num2){
         calc =  horaDia - num + num2;
          System.out.printf("O jogo durou %d horas!", calc);
          
      } else {
          calc = 24 - (num2 - num - horaDia) * -1 ;
          System.out.printf("O jogo durou %d horas!",calc);
      }
        sc.close();
    }
}
