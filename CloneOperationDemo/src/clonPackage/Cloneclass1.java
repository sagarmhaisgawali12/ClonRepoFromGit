package clonPackage;

public class Cloneclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sagar is my name";
		int l=str.length();
		String rev=" ";
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
