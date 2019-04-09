package formatting;

/*
* There should be a short description at the beginning of 
* every class like this telling us what the purpose of the 
* class is. Use the block commenting style.
*/

public class FormattingExamples {
	
	//Examples of each kind of case structure
	//CamelCase
	String firstName;
	
	//PascalCase
	String FirstName;
	
	//snake_case
	String first_name;
	
	//kebab-case
	String first-name;
	
	//An example of an if statement with the correct structure
	if(firstName.equals("Conor")) { 
		System.out.println("Hello Conor");
	}
	else {
		System.out.println("Hello Stranger");
	}
	
	//An example of an if statement with the wrong structure
	if(firstName.equals("Conor")) 
	{ 
		System.out.println("Hello Conor"); } 
	else {
		System.out.println("Hello Stranger"); }
	
	//Ensure there is only one blank space in between each method or statement
}
}
