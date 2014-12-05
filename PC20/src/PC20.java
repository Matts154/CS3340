
public class PC20 {

	public static void main(String[] args) {
		MyQueue<String> q = new MyQueue<String>(5);
		
		try {
			q.enqueue("test1");
			q.enqueue("test2");
			q.enqueue("test3");
			q.enqueue("test4");
			q.enqueue("test5");
			
			for(int i = 0; i < 5; i++){
				System.out.println(q.dequeue());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
