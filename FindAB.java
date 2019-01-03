#20190102 无法求解，无理数

public class FindAB{
 public static void main(String[] args){
  double i=0.62;
  double j=1.0;
  while(i<0.65){
    while(j<1.8){
        if(2*i + j == 3 && i*j == j-i)
            System.out.println("i and j is:"+i+j);  //("i and j",i,j)
   #     i = i+0.0000000000001;
        j = j+0.0000000000001;
	}
  }
  System.out.println("\nHava no answer!\n");
 }
}
