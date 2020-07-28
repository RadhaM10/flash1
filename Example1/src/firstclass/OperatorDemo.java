package firstclass;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int m=6;
		int n=5;
		
	//   n++;   //n+=1;//  n+=3;  //  n+=m;	//n=n+m;
	//   ++n;//  pre increment
	//   n++;  //post increment
	   
	   
	//   m=++n;  // 6     first increment value then assign
	   m=n++;    //5    first n will assign value to m and then it will increment
	   
	   

	   System.out.println(m);
	   System.out.println(n);
	   
	   //output is m=5,n=6
	}

}
