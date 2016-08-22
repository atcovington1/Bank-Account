package ssa;

// all employees of ssa

public class Employee {
	//properties
	int id; // a unique identifier
	String FirstName;
	String LastName;
	String phoneExt;
	String gradeLevel; // i.e. GS15
	String step; // 1- 10
	// methods
	void promotion(String aGradeLevel) {
		//cannot promote to same gradeLevel
		gradeLevel = aGradeLevel;
				
	}
	String getPhoneExt(){
		return phoneExt;
	
}
		
		String getFullName( ) {
			return FirstName +" " +LastName;
		}
		
}
