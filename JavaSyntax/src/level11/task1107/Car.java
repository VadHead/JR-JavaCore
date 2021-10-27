package level11.task1107;

public class Car {
	
	Engine engine;
	
	class Engine {
		
		private boolean isRunning;
		
		public void start() {
			this.isRunning = true;
		}
		
		public void stop() {
			this.isRunning = false;
		}
		
	}
	
}
