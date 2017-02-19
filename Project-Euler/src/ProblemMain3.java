class Problem3 {
	int count = 0;
	int result = 0;
	
	public void Problem3Set(int count) {
		this.count = count;
		
		for(int i=0;i<count;i++){
			if(count%i == 0){
				System.out.println(i);
			}
		}
	}
	
	public int Problem3Get() {
		return this.result;
	}
	
}

public class ProblemMain3 {
	public static void main(String[] args) {
		Problem3 P3 = new Problem3();
		P3.Problem3Set(10);
	}
}
