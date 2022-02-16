package synchronizationdeadlock;
//first thread is responsible to call d1 method on a object by passing b object as reference
class A {
	public synchronized void d1(B b) {
		System.out.println("Thread 1 starts execution of d1() method");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {}
		System.out.println("Thread 1 trying to call B's last()");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A, this is last() method");
	}
}
//second thread is responsible to call d2 method by passing a object as reference
class B {
	public synchronized void d2(A a)
	{
		System.out.println("Thread 2 starts execution of d2() method");
		try {
			Thread.sleep(6000); //to demonstrate deadlock 
		} catch (Exception e) {}
		System.out.println("Thread2 trying to call A's last()");
		a.last();
		
	}
	public synchronized void last()
	{
		System.out.println("Inside B, this is last() method");
		
	}
}
public class DeadLock extends Thread {
	A a = new A();
	B b = new B();
	public void m1() { 
		this.start(); 
		a.d1(b); //main thread is responsible to execute
		//main thread calls lock(a) and starts execution
	}
	public void run() { //child thread is responsible to execute this method
		b.d2(a);
	}
	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		d.m1(); //main thread is responsible to call m1 object
	}
	
}

//if we remove atleast one synchronized method then the program wont enter in to deadlock. synchronized keyword is the only reason for deadlock situation.
