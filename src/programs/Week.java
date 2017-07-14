package programs;
    import java.time.DayOfWeek;  
    import java.util.Scanner;
    public class Week{ 
    	void days(int d)
    	{ DayOfWeek day = DayOfWeek.of(d);  
    	System.out.println(day);
    	}
      public static void main(String[] args) { int d;
  Scanner sc=new Scanner(System.in);
      System.out.println("enter day");
      d=sc.nextInt();
      Week w=new Week();
        w.days(d);  
        
        }}