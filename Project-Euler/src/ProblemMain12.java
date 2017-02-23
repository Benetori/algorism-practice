import java.util.Vector;

class Problem12 {
	int result = 0;
	int result2 = 0;
	int value = 0;
	int i = 0;
	int k = 1;
	
	Vector<Integer> v1 = new Vector<Integer>();
	
	public void Problem12Set(int value){
		this.value = value;
		while(true){
			i++;
			result += i;
			v1.addElement(result);
//			System.out.println(i);
			for(int j=0;j<i;j++){
				k += i;
				if(v1.elementAt(j)%k==0){
					result2++;
					System.out.println(result2);
					if(result2 == value){
						break;
					}
				}
			}
		}
	}
	public int Problem12Get(){
		return result2;
	}
}

public class ProblemMain12 {
	public static void main(String[] args){
		Problem12 P12 = new Problem12();
		P12.Problem12Set(3);
		System.out.println(P12.Problem12Get());
	}
}
