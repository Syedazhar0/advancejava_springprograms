package lambokex1;

public class Employee {

	public static void main(String[] args) {
		LambokEx1 lambokEx1 =new LambokEx1(101,"azhar",20000.0);
		System.out.println(lambokEx1);
		LambokEx1 lambokEx2 =new LambokEx1(101,"syed",21000.0);
		System.out.println(lambokEx2);
		
		LambokEx1 lambokEx3 =new LambokEx1();
		lambokEx3.setEmpId(103);
		lambokEx3.setEmpName("syed_azhar");
		lambokEx3.setEmpSalary(30000.0);
		System.out.println(lambokEx3.getEmpId()+" "+lambokEx3.getEmpName()+" "+lambokEx3.getEmpSalary());

	}

}
