interface IA{
	void a();
}
interface IB{
	void b();
}
class Test11 implements IA{
	public void a(){
        System.out.println("this is a interface method");
}
class Test11 implements IB{
	public void b(){
        System.out.println("this is b interface method");
}
	public void hello(){
	System.out.println("this is test class haloo method");
}
	public static void main(String args[]){
	IA obj=new Test11();
	obj.a();
	Test11 t=new Test11();
	t.a();
	t.b();
	t.hello();
}
}