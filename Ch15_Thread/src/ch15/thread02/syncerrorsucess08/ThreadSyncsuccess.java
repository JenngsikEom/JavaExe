package ch15.thread02.syncerrorsucess08;

class Value{
	private int num = 0;
	public int getNum() {
		return num;
	}
	public void Increment() {
		num++;
	}
}

class IncThread extends Thread{
	private Value val;
	public IncThread(Value val) {
		this.val = val;
	}
	@Override
	public void run() {
		for(int i=0;i<100000;i++)
			val.Increment();
	}
}

// 스레드가 1개일때 정상적으로 작동 됨
public class ThreadSyncsuccess {
	public static void main(String[] args) {
		Value val = new Value();
		IncThread it1 = new IncThread(val);
		IncThread it2 = new IncThread(val);
		it1.start();
		it2.start();
		// 스레드를 동시에 진행했을때 원하는 결과가 나오지 않는다.
		
		try {
			it1.join();
			
			
			it2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(val.getNum());
	}
}
