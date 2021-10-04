package javachkk;

public class chkk {
	public static void main(String []args) {

	int a =4;// Default value: 0 4 bytes -ve and +ve value
	byte b = 6; //defualt values 0 storage 1 byte
	short c =80; //default values 0 storage 2 bytes
	short d= -4; //range: -32768 to 32767
	long ll = 575757L;// it lets compiler that it is a long dataypes
	float ff =45.5f;//default value: 0.0f
	double dd = 55.67689909898f;//default value 0.0d
	boolean chk = true;//default value false
	char ac='A';
	
	//Type casting
	//byte->short->char->int->long->float->double(impplicit type casting)
	int type_casting=6;
	double converted = type_casting;
	System.out.println(converted);
	//Explicit type casting
	//double->float->long->int->char->short->byte
	double typess= 345.67880d;
	int cos=(int)typess;
	System.out.println(cos);
	
	long cossed=(long)typess;
	//datatype_name variablename = (datatypes in whichit should be converted)variable name;
	System.out.println(cossed);
	
	
	
	
	//Unary operator
	int a1=50;
	System.out.println(a1);
	a1   =    -a1;
	System.out.println(a1);
	//Not operator(!)
	int a2 = 15, b1=23;
	System.out.println("condition is:"+!(a2<b1));
	System.out.println("COndifiton is:"+!(a2>b1));
	int b2 = 20;//Assigment operator
	
	
	
	
	// Relational Operators
	
	//1. ==,>,<,<=,>=,!=
	
	int c1 = 23;
	int c2 = 24;
	System.out.println("Checking the variables c1 and c2 are same or not:"+(c1<c2));
	
	//Logical AND operator
	int d1=10,d2=20,d3=50,d4=78;
	if((d1>d2)&&(d3<d4)) {
		System.out.println("COndition is true");
		
	}
	else {
		System.out.println("COnditon is false");
	}
	if((d1>d2)||(d3<d4)) {
		System.out.println("COndition is true");
		
	}
	else {
		System.out.println("COnditon is false");
	}
	System.out.println(!(d3<d4));
	
	
	// Ternary Operator
	int d5=56,d6=68;
	int d7;
	d7= (d5>d6)?d5:d6;
	System.out.println("d7="+d7);
	
	
	
	
	///SHift operator
	byte x=10,y=-50;
	System.out.println("SHifting left side"+(x<<2));
	System.out.println("SHifting left side"+(y<<2));
	
	
	//
	
	
	}
	
}
