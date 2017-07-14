import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number and a dancestyle");
		
		
		Dance de = new Dance('h',"h");
		for(int i=1;i<5;i++)
		{	
			int d=sc.nextInt();
			String s=sc.next();
			de=new Dance(d,s);
			
		}
		
		de.team();
		 
		
	}
}
class Dance{
int danceteams;String style; 

	public Dance(int d, String s){
		this.danceteams = d;
		this.style = s;
	}
 void add(int d,String s)
{danceteams=d;
	style=s;
}
void team()
{
	System.out.println("num");

Scanner sc=new Scanner(System.in);
	danceteams=sc.nextInt();
	
	if(danceteams==1)
	
{
		System.out.println("ur style is"+ ""+style+" "+"tnum" +danceteams);

}else if(danceteams==2)
{System.out.println("ur style is"+ ""+style+" "+"tnum" +danceteams);
}
else if(danceteams==3)
{System.out.println("ur style is"+ ""+style+" "+"tnum" +danceteams);
}else if(danceteams==4)
{System.out.println("ur style is"+ ""+style+" "+"tnum" +danceteams);
}else if(danceteams==5)
{System.out.println("ur style is"+ ""+style+" "+"tnum" +danceteams);
}else 
{System.out.println("sry no such team");
}
}
}
	
	
	