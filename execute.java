class calculations{
int z;
	

public void add(int x, int y){

z=x+y;
System.out.println("the addition is "+ z);
	


}
public void sub(int x, int y){

z=x-y;
System.out.println("the subtraction is "+ z);
	


}

}

class newclass extends calculations{
	
	public void multiplication(int x, int y){


        add(x,y);

	}
}

public class execute{


	public static void main(String[] args){

		calculations c=new calculations();
		newclass nc=new newclass();
		c.add(5,6);
		c.sub(4,6);
		nc.multiplication(4,5);
	}
}
