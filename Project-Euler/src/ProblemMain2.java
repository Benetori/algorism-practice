import java.util.Vector;

class Proble2 {
   Vector<Integer> vt = new Vector<Integer>();
   int a = 0;
   int b = 0;
   int c = 0;
   int d = 0;
  
   public void Proble2Set(int a, int b){
      this.a = a;
      this.b = b;
      vt.addElement(a);
      vt.addElement(b);
      
      for(int i = 0; i<40000; i++){
         if(vt.elementAt(i) > 4000000){
            break;
         }
         int c = vt.elementAt(i) + vt.elementAt(i + 1);
         vt.addElement(c);
      }
      
      for(int j = 0; j<vt.size(); j++) {
            if(vt.elementAt(j)%2 == 0 ){
               d += vt.elementAt(j);
            }
      }      
}
   public int Proble2Get(){
      return this.d;
   }
   
}

public class ProblemMain2 {
   public static void main(String[] args){
	  Proble2 P2 = new Proble2();
    P2.Proble2Set(1, 2);
    System.out.println(P2.Proble2Get());
   }
}