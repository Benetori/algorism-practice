class Problem6 {
	int sum = 0;
	int ims = 0;
	int value = 0;
	int result = 0;
	
	public void Problem6Set(int value){
		this.value=value;
		
		for(int i=0;i<=value;i++){
			ims += i*i;
		}
		
		for(int i=0;i<=value;i++){
			sum += i;
		}
		
		result = (sum*sum) - ims;
		
	}
	public int Problem6Get(){
		return this.result;
	}
}

public class ProblemMain6 {
	public static void main(String[] args) {
		Problem6 P6 = new Problem6();
		P6.Problem6Set(100);
		System.out.println(P6.Problem6Get());
	}
}
