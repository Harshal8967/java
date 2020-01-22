package assignment3;

import java.util.Set;
import java.util.TreeMap;

public class AutherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, AuthorList> books=new TreeMap<String, AuthorList>();
		books.put("Tales of horse", new AuthorList(1,"abcd","Jaipur"));
		books.put("Tales of cow", new AuthorList(11,"a","Jaipur"));
		books.put("Tales of loin", new AuthorList(111,"ab","Jaipur"));
		books.put("Tales of cat", new AuthorList(1111,"abc","Jaipur"));
		Set<String>keys=books.keySet();
		for(String i:keys)
		{
			System.out.println(i+"Written by"+books.get(i).getName());
		}

	}

}
