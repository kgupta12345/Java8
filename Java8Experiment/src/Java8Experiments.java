import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface Addable {
	// WE CANNOT DECLARE MORE THAN 2 FUNCTION DECLARATION [ABSTRACT] HERE IN INERFACE - JAVA8
	int add(int a, int b);
	//void printHelloVenus();// NO
}

interface Hello{
	// WE CANNOT DECLARE MORE THAN 2 FUNCTION DECLARATION [ABSTRACT] HERE IN INERFACE - JAVA8
	void printHelloWorld();
	//void printHelloJupiter();// NO
}

interface AddableHello{
	// WE CAN CREATE A FUNCTION-BODY HERE [default] IN INERFACE - JAVA8
	default int addition(int a, int b) {
		return a+b;
	}
	// WE CAN CREATE A FUNCTION-BODY HERE [default] IN INERFACE - JAVA8
	default void printHelloWorld() {
		System.out.println("ADDABLE HELLO");
	}
	// WE CAN DECLARE MORE THAN 2 FUNCTION DECLARATION [ABSTRACT] HERE IN INERFACE - BECAUSE OF FUNCTION-BODY EXISTS HERE [default]
	void printHelloMoon();
	// WE CAN DECLARE MORE THAN 2 FUNCTION DECLARATION [ABSTRACT] HERE IN INERFACE - BECAUSE OF FUNCTION-BODY EXISTS HERE [default]
	void printHelloMars();	
}

class TestAddition implements Addable {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
}

public class Java8Experiments implements AddableHello{
	public static void main(String[] args) {
		//[START]JAVA8 WAY
		Addable sum = (int a, int b) -> {return a + b;};
		System.out.println(sum.add(1, 2));			
		Hello helloworld =	() -> { System.out.println("HELLO WORLD"); };			
		helloworld.printHelloWorld();
		
		Java8Experiments java8ExperimentsObject = new Java8Experiments();
		java8ExperimentsObject.printHelloWorld();
		java8ExperimentsObject.printHelloMars();
		System.out.println(java8ExperimentsObject.addition(1, 4));
		
		
		//[END]JAVA8 WAY
		
		
		//[START]TRADITIONAL WAY
		TestAddition testaddition = new TestAddition();
		System.out.println(testaddition.add(1, 30));
		//[END]TRADITIONAL WAY
		
		//-------------------------------------------------------------------------------------------------------
        List<String> list = new ArrayList<String>();  
        list.add("A");  
        list.add("America"); 
        list.add("Africa"); 
        list.add("D"); 
        list.add("E");  
        Stream<String> stream = list.stream();
        stream = stream.filter((listvalue) -> listvalue.startsWith("A") && listvalue.contains("ri"));
        /* for(String str : (Iterable<String>)stream::iterator) {
        	System.out.print(str);
        }
        stream.forEach(System.out::println);
        */
        stream.forEach(streamvalue -> System.out.println(streamvalue)); 
        //-------------------------------------------------------------------------------------------------------
        
        
        //-------------------------------------------------------------------------------------------------------
        List<Integer> numberList = new ArrayList<Integer>();  
        numberList.add(1000);  
        numberList.add(2000); 
        numberList.add(30000); 
        numberList.add(4000); 
        numberList.add(7000);  
        Stream<Integer> numberstream = numberList.stream();
        numberstream = numberstream.filter((numberListvalue) -> numberListvalue>10000  && numberListvalue<99999);
        numberstream.forEach(numberstreamvalue -> System.out.println(numberstreamvalue)); 
        }
	    //--------------------------------------------------------------------------------------------------------

	@Override
	public void printHelloMoon() {
		System.out.println("HELLO MOON");
	}

	@Override
	public void printHelloMars() {
		System.out.println("HELLO MARS");
	}
	
}

