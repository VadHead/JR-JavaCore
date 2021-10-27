package level03;

public class task1322 {
	public static void main(String[] args) throws Exception {
		SimpleObject<String> stringObject = new StringObject();
	}
	
	interface SimpleObject<T> {
		SimpleObject<T> getInstance();
	}
	
	public static class StringObject implements SimpleObject<String>{
		
		@Override
		public SimpleObject<String> getInstance() {
			return null;
		}
		
	}
}
