package level10;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class task2015 implements Serializable, Runnable {
	private Thread runner;
	private int speed;
	
	public task2015(int speed) {
		this.speed = speed;
		runner = new Thread(this);
		runner.start();
	}
	
	public void run() {
		// do something here, doesn't matter what
	}
	
	
	/**
	 * Переопределяем сериализацию.
	 * Для этого необходимо объявить методы:
	 * private void writeObject(ObjectOutputStream out) throws IOException
	 * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	 * Теперь сериализация/десериализация пойдет по нашему сценарию :)
	 */
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		runner = new Thread(this);
		runner.start();
	}
	
	public static void main(String[] args) {
	
	}
}
