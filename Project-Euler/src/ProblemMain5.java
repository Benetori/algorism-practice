class Problem5 {
	int value = 0;
	int num = 0;
	int result = 0;
	
	public void Problem5Set(int value){
		this.value = value;
		while(result != value){
			num++;
			for(int i=1;i<=value;i++) {
				if(num%i == 0) {
					result++;
				}
				else{
					result = 0;
				}
			}
		}
	}
	
	public int Problem5Get() {
		return this.num;
	}
}



public class ProblemMain5 {
	public static void main(String[] args) {
		Problem5 P5 = new Problem5();
		P5.Problem5Set(20);
		System.out.println(P5.Problem5Get());
	}
}
