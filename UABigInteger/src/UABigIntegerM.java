import java.util.Arrays;


public class UABigIntegerM 
{

	public static void main(String[] args) 
	{
		
		int[] a = {1,2,3};
		int[] a2 = {1,2,4};
		boolean b = true;
		int result;
		
		if (a != null && a2 != null)
				{
			if(a.length != a2.length)
				b=false;
			else
				for (int i = 0; i<a2.length; i++){
					if (a2[i] != a[i]){
						b = false;
					}
				}
		}else b = false;
		
		
		boolean c = false;
		
		if (a != null && a2 != null)
				{
			if(a.length != a2.length)
				b=true;
			else
				for (int i = 0; i<a2.length; i++){
					if (a2[i] != a[i]){
						b = true;
					}
				}
		}else c = true;
		
		
		
		//System.out.println("are equal" + " "+ b);
		//System.out.println("are not equal" + " " +c);
		//System.out.println(a+a2);

	} 

}
