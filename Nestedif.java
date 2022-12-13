package controlstatement;
import java.util.*;
 class Nestedif {

	public static void main(String[] args) {
    int a,b,c;
    int max=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enter value of a:");
    a=s.nextInt();
    System.out.println("Enter value of b:");
    b=s.nextInt();
    System.out.println("Enter value of c:");
    c=s.nextInt();
    if(a>b)
    {
       if(a>c)
       max=a;
       else
       max=c;
    }
    else
     {
      if(b>c)
      max=b;
      else
      max=c;
     }
    System.out.println("\n max value="+max);
    

	}

}
