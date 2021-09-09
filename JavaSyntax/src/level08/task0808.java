package level08;

public class task0808 {
	public static void main(String[] args) throws InterruptedException {
		countDown();
	}
	public static void countDown() throws InterruptedException {
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("Старт!");
	}
}
