package lambokex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// to use the lambok annotations download the jar file from  the intenet projectlambok
@Data
@AllArgsConstructor
@NoArgsConstructor
//or can use this separate annotations
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Setter
//@Getter
// 1 combinations are constructorwith arguments and to string 
//2 setter getter and empty constructor with no arguments
public class LambokEx1 {
	private int empId;
	private String empName;
	private double empSalary;

}


