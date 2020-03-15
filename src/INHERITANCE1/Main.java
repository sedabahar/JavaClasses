package INHERITANCE1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Creating an object of a Employee class");
		
		Employee emp=new Employee();
		emp.companyName="Sytax";
		emp.salary=7000;
		emp.work();
		emp.getPaid();
		
		
		System.out.println("Creating an object of scrum team");
		ScrumTeam sm=new ScrumTeam ();
		sm.companyName="Sytax";
		sm.salary=9000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Baclog,Sprint Baglog,Burndown Chart";
		sm.ceremonies="Strint Demo,Planning,Retro,Daily Stand up";

		
		
		Developer dev=new Developer ();
		System.out.println("Creating an object of development team");
		dev.companyName="Sytax";
	    dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Product Baclog,Sprint Baglog,Burndown Chart";
		
		
		Tester tst=new Tester();
		tst.companyName="Sytax";
		tst.salary=8500;
		tst.work();
		tst.getPaid();
		tst.Test();
		tst.artifacts="Product Baclog,Sprint Baglog,Burndown Chart";
		tst.ceremonies="Strint Demo,Planning,Retro,Daily Stand up";
		
		ProductOwner po=new ProductOwner();
		po.companyName="Sytax";
		po.prioritize();
		po.salary=10000;
		po.work();
		po.getPaid();
		po.artifacts="Product Baclog,Sprint Baglog,Burndown Chart";
		po.ceremonies="Strint Demo,Planning,Retro,Daily Stand up";
		
		BussinessAnalyst ba=new BussinessAnalyst ();
		ba.companyName="Sytax";
		ba.salary=12000;
		ba.work();
		ba.writeRequirement();
		ba.artifacts="Product Baclog,Sprint Baglog,Burndown Chart";
		ba.ceremonies="Strint Demo,Planning,Retro,Daily Stand up";
		
		
		
	}

}
