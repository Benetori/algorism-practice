import java.util.Vector;

class Problem10 {
	long count = 0;
	int result = 0;
	
	Vector<Long> v = new Vector<Long>();
	
	public void Problem3Set(long count) {
		this.count = count;

		for(long i = 2;i<=count;i++){
				v.addElement(i);
		}
		
		for(long i = 2;i<=Math.sqrt(count);i++){
			for(long j = i; j*i <= count;j++) {
				v.removeElement(j*i);
			}
		}
		for(int i = 0;i<v.size();++i){
			result += v.elementAt(i);
		}
	}
	
	public int Problem3Get() {
		return result;
	}
	
}

public class ProblemMain10 {
	public static void main(String[] args) {
		Problem10 P10 = new Problem10();
		P10.Problem3Set(2000000);
		System.out.println(P10.Problem3Get());
	}
}
