package methods;

public class MixedMethods {

	public static void main(String[] args) {
		MixedMethods mix = new MixedMethods();
		staticMethod();
	}
	public static void staticMethod() {
		System.out.println(" Static is a constanct variable");
		MixedMethods mix = new MixedMethods(); 
		mix.instanceInsideStatic();
	}
	public static void instanceMethod() {
		System.out.println("Instance methods exist as multiple copies");

	public static void staticInstanceMethod() {
			System.out.println("Static methods can't acces Instance methods");
	public static void instanceInsideStatic() {
			System.out.println("Instance methods can acces Static methods");
	}
}
