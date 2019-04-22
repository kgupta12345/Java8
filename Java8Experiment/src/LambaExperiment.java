import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface Addable {
	int add(int a, int b);	
}

interface Hello{
	void printHelloWorld();
}

class TestAddition implements Addable {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
}

public class LambaExperiment {
	public static void main(String[] args) {
		Addable sum = (int a, int b) -> {return a + b;};
		Addable sum1 = (a,b) -> (a+b); 
		Hello helloworld =	() -> { System.out.println("HELLO WORLD"); };
		System.out.println(sum.add(1, 2));
		System.out.println(sum1.add(1, 20));
		helloworld.printHelloWorld();
		
		//TRADITIONAL WAY
		TestAddition testaddition = new TestAddition();
		System.out.println(testaddition.add(1, 30));
		System.out.println(testaddition.add(1, 30));
		
        List<String> list = new ArrayList<String>();  
        list.add("A");  
        list.add("America"); 
        list.add("Africa"); 
        list.add("D"); 
        list.add("E");  
        Stream<String> stream = list.stream();
        stream = stream.filter((s) -> s.startsWith("A")&&s.contains("ri"));
        /* for(String str : (Iterable<String>)stream::iterator) {
        	System.out.print(str);
        }
        */
        //stream.forEach(System.out::println);
        stream.forEach(s -> System.out.println(s)); 
      
        List<Integer> numberList = new ArrayList<Integer>();  
        numberList.add(1000);  
        numberList.add(2000); 
        numberList.add(30000); 
        numberList.add(4000); 
        numberList.add(7000);  
        Stream<Integer> numberstream = numberList.stream();
        numberstream = numberstream.filter((i) -> i>100  && i<99999);
        numberstream.forEach(i -> System.out.println(i)); 
        
        
        
        }
}

