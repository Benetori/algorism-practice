class Problem9 {
	int result = 0;
	int value = 0;
	
	public void Problem9Set(int value) {
		this.value = value;
		
		for(int i=0;result<1;i++){
			for(int j=0;j<i;j++){
				for(int k=0;k<j;k++){
					if(k*k+j*j==i*i){
						if(i+j+k == value){
							result=i*j*k;
						}
					}
				}
			}
		}
	}
	public int Problem9Get(){
		return result;
	}
}


public class ProblemMain9 {
	public static void main(String[] args){
		Problem9 P9 = new Problem9();
		P9.Problem9Set(1000);
		System.out.println(P9.Problem9Get());
	}
}
