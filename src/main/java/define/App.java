package define;

import define.application.serviceinterfaces.Controller;
public class App {

	public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Controller controller = new Controller();

        controller.defineAttributeRangeRule("CHK_RangeRuleTest",
                "This is a nice little description :)",
                "before",
                "trigger event",
                true,
                "Wolla dit gaat helemaal fout",
                true,
                "15", "10", "20");

    }

}
