package executorservice;


//creating a thread by using the anonymous class without extending a thread class
public class AnonymousThreadDemo {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for(int i =1;i<=5;i++) {
					System.out.println("run method" + i);
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						
					}
					
				}
			}
		}.start();
		
		for(int j=1;j<=5;j++) {
			System.out.println("main method" + j);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
		}
	}
}
