
public class LeastElement {
	public static void main(String[] args) {int i;
int a[]={8,9,7,99,5,90,77,2,4};
		
		for(i=1;i<a.length;i++)
		{
			if(a[0]>a[i])
			{
				a[0]=a[i];
						
			}
		}
		System.out.println("smallest num is"+a[0]);
	}

}
