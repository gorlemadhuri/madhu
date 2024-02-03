package sikuli;
import org.sikuli.script.Screen;
public class Sikuli_example {

	public static void main(String[] args)throws Exception{
		// Test steps
		Screen sc =new Screen();
	Thread.sleep(3000);
	sc.click("C:\\Users\\hp\\eclipse-workspace\\sikuli\\minimize.JPG");
	System.out.println("click is performed");
	Thread.sleep(3000);
	sc.doubleClick("C:\\Users\\hp\\eclipse-workspace\\sikuli\\pc1.JPG");
	Thread.sleep(3000);
	sc.click("C:\\Users\\hp\\eclipse-workspace\\sikuli\\close.JPG");
   
	
	}

}
