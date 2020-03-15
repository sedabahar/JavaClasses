package ABSTRACTAbstractCLASS;

public abstract class  Task {
	
	
	
	
	
	public static void main(String[] args) {
		JavaFile x=new JavaFile();
		x.open();
		
		
		

	}

	void edit() {
		
	}
    void close() {
		
	}
   abstract void open() ;
	
	
}class WordFile extends Task{

		@Override
		void open() {
			System.out.println(" we need microsoft to be installed");			
		}
		
	}class PDFFile extends Task{

		@Override
		void open() {
			System.out.println("Java file we need notepad");
			
		}
	
	
	}class JavaFile extends Task{

		@Override
		void open() {
			System.out.println("Java file we need notepad++ or sublime text");
			
		}
		
		
	}

	