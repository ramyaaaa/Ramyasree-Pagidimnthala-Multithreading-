package executorservice;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestDemo implements Runnable {
	String name;
	
	public TestDemo(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name+"job started by thread" + Thread.currentThread().getName());
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println(name + "job completed by Thread" + Thread.currentThread().getName() );
	
	}
}
public class ExecutorDemo {
public static void main(String[] args) {
	TestDemo[] demo = { 
			new TestDemo("job 1"),
			new TestDemo("job 2")
	};

ExecutorService service = Executors.newFixedThreadPool(3);
for(TestDemo d : demo) {
	service.submit(d);
	
}

service.shutdown();


}
}
