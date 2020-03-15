package StringBuffer;

public class Str {

	public static void main(java.lang.String[] args) {
		
		String name="John";
		name.concat("hi");
		System.out.println(name);
		System.out.println(".....................");
		
		StringBuffer strB = new StringBuffer("study ");
		strB.append("tonight");
		System.out.println(strB); // Output: studytonight
		
		StringBuffer x=new StringBuffer("Ekle ");
		x.append("appen ile eklenir");
		System.out.println(x);
	}

}
