package Spring.io.Class;

import java.util.ArrayList;

public class Master {

	public static void main(String[] args) {
		ArrayList<Integer> as = new ArrayList<>();
		Master m = new Master();
		System.out.println("test : "+ m.call(12345));
		
		new Thread(
			new Runnable() {
				public void run() {
					System.out.println("test");
				}
			}
		).start();
		
		Thread t = new Thread();
		t.setPriority(Thread.MAX_PRIORITY);
		t.setPriority(Thread.MAX_PRIORITY);
	}

	private <T extends Number> int call(T t1){
	    return 0;
	}
	
	class TestClass<T>{
		
		private T t;
		
		public void setVar(T t){
			this.t = t;
		}

		public T getVar(){
			return this.t;
		}
	}
}
