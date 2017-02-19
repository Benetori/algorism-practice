class Problem1 {
	int a = 0;
	int b = 0;
	int count = 0;
	int sum = 0;
	
	public void Problem1Set ( int a, int b, int count) {
		this.a = a;
		this.b = b;
		this.count = count;
		
		for(int i=0; i<count;i++){
			if(i%a == 0 || i%b == 0){
				sum += i; 
			}
		}
	}
	public int Problem1Get() {
		return this.sum;
	}
}

public class ProblemMain1 {
	public static void main(String[] args) {
		Problem1 P1 = new Problem1();
		P1.Problem1Set(3, 5, 1000);
		System.out.println(P1.Problem1Get());
	}
}
