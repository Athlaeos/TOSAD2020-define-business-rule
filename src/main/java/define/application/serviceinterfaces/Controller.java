package define.application.serviceinterfaces;
import define.domain.businessrules.AttributeRangeRule;

public class Controller {

	public void defineAttributeRangeRule(	String businessRuleName,
											String description,
										 	String when,
											String event,
										 	boolean forEachRow,
										 	String errorMessage,
									 		boolean notter,
										 	String operatorValue,
										 	String compareValue1,
										 	String compareValue2) {

		AttributeRangeRule attributeRangeRule = new AttributeRangeRule(businessRuleName, description, when, event, forEachRow, errorMessage, notter, operatorValue, compareValue1, compareValue2);

		System.out.println(attributeRangeRule.toString());


		}
	}
