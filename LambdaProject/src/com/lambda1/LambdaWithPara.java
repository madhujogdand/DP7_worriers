package com.lambda1;

interface Speedable
{
	void move(float speed);
}
public class LambdaWithPara {

	public static void main(String[] args) {
	
          Speedable car=(speed)->{
        	  System.out.println("Welcome");
        	  System.out.println("Car is moving with speed:"+speed+"Km/hr");
        	 
          };
          
          car.move(50);
          
          //single argument omit()
          //single line code omit{}
          
          Speedable ball=speed->System.out.println("Ball is rolling with speed:"+speed+"Km/hr");
          ball.move(20);
	}

}
