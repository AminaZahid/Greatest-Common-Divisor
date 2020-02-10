package dsar4;
public class DSAR4 {
public int GCD(int x,int y){
    if(x>=0&&y==0)
        return x;
    else 
        return GCD(y,x%y);
}
public static void main(String[] args) {
DSAR4 p1=new DSAR4();
System.out.println("GCD of 26  and 13\t:"+p1.GCD(26,13));
    }
    
}
