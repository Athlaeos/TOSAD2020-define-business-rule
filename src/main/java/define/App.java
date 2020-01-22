package define;

import define.application.serviceinterfaces.Controller;
import org.hibernate.cfg.Configuration;

public class App {
    
	public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        Controller controller = new Controller();
        controller.defineAttributeRangeRule(1, "oracle", "persons", "age", "CHK_rangeRuleTest", 10, 20);
        
    }
	
}