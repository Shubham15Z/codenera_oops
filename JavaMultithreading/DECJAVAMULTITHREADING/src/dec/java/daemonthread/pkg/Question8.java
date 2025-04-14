package dec.java.daemonthread.pkg;

class MyDaemonTask implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " says: I'm running...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}


public class Question8 {
	public static void main(String[] args) {
	    // Create and start multiple daemon threads
	    for (int i = 1; i <= 3; i++) {
	        Thread daemonThread = new Thread(new MyDaemonTask(), "DaemonThread-" + i);
	        daemonThread.setDaemon(true);  // Mark as daemon
	        daemonThread.start();

	        // Print status
	        System.out.println(daemonThread.getName() +
	                " | isDaemon: " + daemonThread.isDaemon() +
	                " | isAlive: " + daemonThread.isAlive());
	    }

	    // Let the main thread sleep for 2 seconds so we can see daemon output
	    System.out.println("Main thread sleeping for 2 seconds...");
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        System.out.println("Main thread interrupted.");
	    }

	    System.out.println("Main thread exiting.");
	}

}


