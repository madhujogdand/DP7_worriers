package com.lambda1;

interface Addition
{
	void computeSum(int n1,int n2);
}
interface Subtraction
{
	int computeDiff(int n1,int n2);
}
public class LambdaWithMultiPara {

	public static void main(String[] args) {
		
		
      Addition a1=(n1,n2)->System.out.println("The sum is:"+(n1+n2));
      a1.computeSum(4, 5);
      
      System.out.println("---------------------------------------");
	
  	
      Addition a2=(int n1,int n2)->{
    	  System.out.println("Number 1:"+n1);
    	  System.out.println("Number 2:"+n2);
    	  System.out.println("Thw sum is:"+(n1+n2));
      };
      a2.computeSum(41, 52);
      
      System.out.println("--------------------------------------------");
      
      Subtraction s1=(n1,n2)->(n1-n2);
         System.out.println(s1.computeDiff(9, 3));
         
         
      
	}

}
