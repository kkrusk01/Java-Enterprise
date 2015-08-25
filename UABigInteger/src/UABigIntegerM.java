import java.util.Arrays;


public class UABigIntegerM 
{

	public static void main(String[] args) 
	{
            UABigInteger int_one = new UABigInteger();
            UABigInteger int_two = new UABigInteger();

            int_one.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,5});
            int_two.input({1,1,1,0,0,0,1,1,1,0,0,0,2,2,2});

            111222333444555
            111000111000222
            int_one.add(int_two);
            System.out.println(int_one.output()); 
            // Previous output should be 222222444444777
            // Like this:
            System.out.println("222222444444777");

            int_one.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,5});
            int_two.input({1,1,1,0,0,0,1,1,1,0,0,0,5,5,5});

            System.out.println();

            // Do we carry right?
            int_one.add(int_two);
            System.out.println(int_one.output());
            System.out.println("222222444445109");

            int_one.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,5});
            int_two.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,5});

            System.out.println(int_one.output() + " = " + int_two.output());
            System.out.println("int_one = int_two", int_one.isEqualTo(int_two));
            System.out.println();

            int_one.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,5});
            int_two.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,1});

            System.out.println(int_one.output() + " != " + int_two.output());
            System.out.println("int_one != int_two", int_one.isNotEqualTo(int_two));
            System.out.println();

            int_one.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,5});
            int_two.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,1});

            System.out.println(int_one.output() + " < " + int_two.output());
            System.out.println("int_one < int_two", int_one.isLessThan(int_two));
            System.out.println();

            System.out.println(int_one.output() + " > " + int_two.output());
            System.out.println("int_one > int_two", int_one.isGreaterThan(int_two));
            System.out.println();

            System.out.println(int_two.output() + " < " + int_one.output());
            System.out.println("int_two < int_one", int_two.isLessThan(int_one));
            System.out.println();

            System.out.println(int_two.output() + " > " + int_one.output());
            System.out.println("int_two > int_one", int_two.isGreaterThan(int_one));
            System.out.println();

            System.out.println(int_one.output() + " <= " + int_two.output());
            System.out.println("int_one <= int_two", int_one.isLessThanOrEqualTo(int_two));
            System.out.println();

            System.out.println(int_one.output() + " > " + int_two.output());
            System.out.println("int_one > int_two", int_one.isGreaterThanOrEqualTo(int_two));
            System.out.println();

            System.out.println(int_two.output() + " < " + int_one.output());
            System.out.println("int_two < int_one", int_two.isLessThanOrEqualTo(int_one));
            System.out.println();

            System.out.println(int_two.output() + " > " + int_one.output());
            System.out.println("int_two > int_one", int_two.isGreaterThanOrEqualTo(int_one));
            System.out.println();

            int_one.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,5});
            int_two.input({1,1,1,2,2,2,3,3,3,4,4,4,5,5,5});
            System.out.println(int_two.output() + " - " + int_one.output());
            System.out.println("int_two - int_one = ", int_two.subtract(int_one));
            System.out.println("Should be 0!");
            System.out.println();
            /*
		
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

                */
	} 

}
