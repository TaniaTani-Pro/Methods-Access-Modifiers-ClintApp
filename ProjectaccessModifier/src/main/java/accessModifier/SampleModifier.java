package accessModifier;

public class SampleModifier{

	public static void Simple(){
		
			System.out.println(" Everyone can acces publicMethod");
		} 
		protected void protectMethod() {
			System.out.println(" This method is protected");
		}
		void defaultMethod(){
			System.out.println("Virtual extension methods");
		}
		
		private void privateMethod() {
			System.out.println("Restricted to be access");
		}
		
		public static void main(String[] args) {
			Simple();
			SampleModifier sm = new SampleModifier();
	}

}
