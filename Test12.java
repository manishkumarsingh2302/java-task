interface IA{
	void a();
}
interface IB{
	void b();
}
interface IC extends IA,IB{
	void c();
}
class Test12 implements IC{
	public void a(){
        System.out.println("this is a interface method");
}

	public void b(){
        System.out.println("this is b interface method");
}

	public void c(){
        System.out.println("this is c interface method");
}
	public void hello(){
	System.out.println("this is test class haloo method");
}
	public static void main(String args[]){
	IA obj=new Test12();
	obj.a();
	Test12 t=new Test12();
	t.a();
	t.b();
	t.c();
	t.hello();
}
}

