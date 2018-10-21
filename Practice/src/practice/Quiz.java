package practice;

public class Quiz {


	 
	 String  name;
	 String phoneNumber;


		String SearchContact(String searchName) {
			for(int i=0;i<2;i++) {
				if(name.equals(searchName)) {
					return name;
				}
			
			}return null;
			}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Udacity myConMan=new Udacity();
			Udacity frjaggi=new Udacity();
			Udacity frguri=new Udacity();
			frjaggi.name="jaggi";
			frjaggi.phoneNumber="9780601245";
			frguri.name="guri";
			frguri.phoneNumber="9988880907";
			 
		
			System.out.println(frjaggi.SearchContact("jaggi"));
	}


	
}
