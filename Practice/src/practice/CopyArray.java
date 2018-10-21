package practice;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] copyFrom= {'d','e','c'};
char[] copyTo=new char[3];
System.arraycopy(copyFrom, 0, copyTo, 1, 2);
System.out.println(new String(copyTo));
	}

	}


