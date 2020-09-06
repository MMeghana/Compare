import java.util.*;
class Compare
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		int[] x = new int[2];
		int c=0;
		int d=0;
		int i;
		System.out.println("enter Alice ratings");
		for(i=0;i<=2;i++)
			a[i]=myObj.nextInt();
		System.out.println("enter Bob ratings");
		for(i=0;i<=2;i++)
			b[i]=myObj.nextInt();
		for(i=0;i<=2;i++)
		{
			if(a[i]>b[i])
				c++;
			if(a[i]<b[i])
				d++;
		}
		x[0]=c;
		x[1]=d;
		System.out.println(x[0]+" "+x[1]);
	}

}
