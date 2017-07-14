package programs;


class Simple1 extends Thread{  
	 public void run(){  
	   System.out.println("task one");  
	 }  
	}  
	  
	class Simple2 extends Thread{  
	 public void run(){  
	   System.out.println("task two");  
	 }  
	}
	class Simple3 extends Thread{  
		 public void run(){  
		   System.out.println("task three");  
		 }  
		}  
		
	  
	 class TestMultitasking3{  
	 public static void main(String args[]){  
	  Simple1 t1=new Simple1();  
	  Simple2 t2=new Simple2();  
	  Simple3 t3=new Simple3();
	  
	  t1.start();t1=null; 
	  t2.start();  
	  t3.start();
	 }  
	}  