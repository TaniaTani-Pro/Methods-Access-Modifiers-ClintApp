package ClientApp;

import accessModifier.SampleModifier;

public class Main {

	public static void main(String[] args) {
		SampleModifier sm = new SampleModifier(); 
		
		//sm.privatMethod(); cna't be access outside of its own class
		// sm.defaultMehod(); cannot be accessed outside its own package
				// because it is a 'default' method.

				// sm.protectedMethod(); cannot be accessed outside its own package due
				// to the fact their is no parent/child relationship created through 'inheritance' 
				// between the class 'Main' and the class 'EvaluateModifiers'.
				
		sm.Simple();
				// The 'publicMethod' can be accessed from anywhere as it has a 'public' 
				// access modifier.
				
	
	private void methods() {
		
	
	}
	

}
