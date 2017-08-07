

public class Main {
	public static void main(String[] args){
		Date[] result = readDates("C:/binaryJavaExer/ew.txt");
			for(Date t : result){
				System.out.println(t+" ");
			}
	}
	
	public static Date[] readDates(String name) {
		In in = new In(name);
		Queue<Date> q = new Queue<>() ;

		while (!in.isEmpty())
			q.enqueue(new Date(in.readLine()));
		int N = q.size();
		Date[] a = new Date[N];
		for (int i = 0; i < N; i++) {
			a[i] = q.dequeue();
		
		}
		return a;
	}
	
	public static int[] readInts(String name) {
		In in = new In(name);
		Queue<Integer> q = new Queue<>() ;

		while (!in.isEmpty())
			q.enqueue(in.readInt());
		int N = q.size();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = q.dequeue();
		
		}
		return a;
	}
	
}
