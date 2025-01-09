interface IA{
	void a();
}
class Test10 implements IA{
	public void a(){
        System.out.println("this is a interface method");
}
	public void hello(){
	System.out.println("this is test class haloo method");
}
	public static void main(String args[]){
	IA obj=new Test10();
	obj.a();
	Test10 t=new Test10();
	t.a();
	t.hello();
}
}