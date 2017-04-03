
/**@Assume that class A extends class B,
 which extends class C. Also all the three classes  implement the method test().
 How can a method in a class A invoke the test() method  defined in class C (without creating a new instance of class C) */
/** @Create Class C */
class C {
	/** @Method declaration */
	public void test() {
		/** @Output */
		System.out.println("A");
	}
}
