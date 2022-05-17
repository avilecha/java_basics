package custom.classes;

public class MultipleConstructorDemo {
	
	int height;
	int depth;
	int width;

	
//Definition for multiple constructors is below:	
	MultipleConstructorDemo(int height, int depth, int width){
		this.height=height;
		this.depth=depth;
		this.width=width;
	}
	
	MultipleConstructorDemo(int height, int depth){
		this.height=height;
		this.depth=depth;
		this.width=10;
	}
	
	MultipleConstructorDemo(int dimension){
		height=dimension;
		depth=dimension;
		width=dimension;
	}
	
	MultipleConstructorDemo(){
		this.height=10;
		this.depth=10;
		this.width=10;
	}

//Define behaviour - Ex - calculate Volume	
	int volume() {
		return height * width * depth;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int volume;
		MultipleConstructorDemo stdCuboid = new MultipleConstructorDemo(10, 15, 23);
		volume = stdCuboid.volume();
		System.out.println("Standard Cuboid Volume is: "+volume);
		
		MultipleConstructorDemo stdCuboidWithDefaults = new MultipleConstructorDemo(10, 15);
		volume = stdCuboidWithDefaults.volume();
		System.out.println("Defaults Cuboid Volume is: "+volume);
		
		MultipleConstructorDemo cube = new MultipleConstructorDemo(12);
		volume = cube.volume();
		System.out.println("Cube Volume is: "+volume);
		
		MultipleConstructorDemo defaults = new MultipleConstructorDemo();
		volume = defaults.volume();
		System.out.println("Cube Volume is: "+volume);

	}

}
