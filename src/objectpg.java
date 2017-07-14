
public class objectpg {
	
		  
		 public static void main(String args[]){  
		  Student s1=new Student();//creating an object of Student  
		  //accessing member through reference variable  
		  s1.exe();  
		 }  
		}  


class Student{  
	 int no;//field or data member or instance variable  
 
 void exe()
 {int i;
	 for(i=1;i<11;i++)
		 {int exnum=i*100;
	
	System.out.println(+i);
	System.out.println(exnum);
		System.out.println("\n");} 
	 
		 }
 
 }