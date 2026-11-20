public class StringDemo{
	public static void main (String [] args){
		String[] names= new String [] {"Karim uddin ","arif","kamal_123"};
		String [] emails= new String[names.length];
		String s1 ="@gmail";
		String s2= "@yahoo";
		String s3= ".com";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.indexOf('c'));
		System.out.println(s1.compareTo("@gm"));
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		for(int i=0;i<names.length;i++){
			int space = names[i].indexOf(' ');
			String user = " ";
			if (space>=0){
				user= names[i].substring(0,space);
				emails[i]= user.concat(s1).concat(s3);
			}
			else {
				user=names[i];
				emails[i]= user.concat(s2).concat(s3);
				
			}
			System.out.println(emails[i]);
		}
		
		String search= "aRi";
		search = search.toLowerCase();
		System.out.println(" REsult: ");
		for(int i=0;i<emails.length;i++)
		{
			if(emails[i].indexOf(search)>=0)
			{
				System.out.println(emails[i]);
				
			}
		}

	}
}