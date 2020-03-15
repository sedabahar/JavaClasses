package hAAllMAP;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
	private int Id;
	private String isim;

 hashSet(String isim,int Id) {
		this.isim=isim;
		this.Id=Id;
	
	}
	
	
	@Override
	public String toString() {
		
		return "ID "+Id+"--"+"Isim "+isim;
	}


	public static void main(String[] args) {
		Set<hashSet>set=new HashSet<hashSet>();
		
		hashSet player1=new hashSet("Berke",11);
		hashSet player2=new hashSet("Seda",34);
		hashSet player3=new hashSet("Bartu",4);
		
		set.add(player1);
		set.add(player2);
		set.add(player3);
		
		for(hashSet s:set) {
			System.out.println(s);
		}
		
		
	}

}
