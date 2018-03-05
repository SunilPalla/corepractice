package core;

/**
 * Created by sunilp on 2/21/18.
 */
public class Circle extends Shape {
	public Integer draw(){
		System.out.println("in circle");
		return 0;
	}
	public static void main(String[] args) {
		Shape s = new Circle();
		//s.draw();
	}

}
