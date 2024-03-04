package InnerClass;

class Outer{
	class Inner{
		public void m1() {
			System.out.println("Inside inner class Instance Method");
		}
	}
	public static void main(String[] args) {
		System.out.println("Main method of outer class");

		//Outer outer  = new Outer();
		//Outer.Inner inner = outer.new Inner();
		        //or
		Outer.Inner inner = new Outer().new Inner();
		inner.m1();
	}
}