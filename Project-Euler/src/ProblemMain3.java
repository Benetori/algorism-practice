import java.util.Vector;

class Problem3 {
	long count = 0;
	Vector<Long> v = new Vector<Long>();
	
	public void Problem3Set(long count) {
		this.count = count;

		for(long i = 2;i<=count;i++){
			if(count%i == 0){
				v.addElement(i);
			}
		}
		
		for(long i = 2;i<=Math.sqrt(count);i++){
			if(v.contains(i)){
				for(long j = i; j*i <= count;j++) {
					v.removeElement(j*i);
				}
			}
		}
		
//		for(long i = 2;i<=count;i++) {
//			if(count%i == 0){
//				v.addElement(i);
//			}
//			for(long j = 2;j<i;j++){
//					if(i%j == 0){
//						v.removeElement(i);
//				}
//			}
//		}
		
	}
	
	public Vector<Long> Problem3Get() {
		return v;
	}
	
}

public class ProblemMain3 {
	public static void main(String[] args) {
		Problem3 P3 = new Problem3();
		P3.Problem3Set(600851475143L);
		System.out.println(P3.Problem3Get());
	}
}
