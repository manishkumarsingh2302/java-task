//exception handling
		  


		class E2{
			public static void main (String args[]){
			System.out.println("haloo jhj");
			int a,b,c;
			c=0;
			a=10;
			b=0;
               System.out.println( "Before exception");
		try{
		System.out.println("entre try"); 
		c=a/b;
		System.out.println("exit try");}
		catch(ArithmeticException ae){
		System.out.println("this is catch block");
		System.out.println("demonitor should not be zero"); }
		System.out.println("c");
		System.out.println("Hello..BYe");
           System.out.println("After exception");
}
}

		 
