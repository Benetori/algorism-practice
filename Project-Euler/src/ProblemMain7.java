import java.util.Vector;

class Problem7 {
	int value = 0;
	int result = 0;
	
	Vector<Integer> v = new Vector<Integer>();
	
	public void Problem7Set(int value) {
		this.value = value;
		
		for(int i=2;v.size()<=value;i++) {
			v.addElement(i);
			for(int j = 2;j<i;j++){
				if(i%j == 0){
					v.removeElement(i);
					break;
			}
		}
	}
		result = v.elementAt(value);
	}
	
	public int Problem7Get(){
		return this.result;
	}
}

public class ProblemMain7 {
	public static void main(String[] args) {
		Problem7 P7 = new Problem7();
		P7.Problem7Set(10000);
		System.out.println(P7.Problem7Get());
	}
}
