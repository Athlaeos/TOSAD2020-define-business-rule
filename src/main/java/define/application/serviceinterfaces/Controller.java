package define.application.serviceinterfaces;

import org.hibernate.Hibernate;

import define.domain.businessrules.AttributeRangeRule;
import define.domain.businessrules.BusinessRule;

public class Controller {
	
	public void defineAttributeRangeRule(	int id,
											String database, 
											String table, 
											String column, 
											String constraintName, 
											int minValue, 
											int maxValue) {
		
		AttributeRangeRule attributeRangeRule = new AttributeRangeRule(id, database, table, column, constraintName, minValue, maxValue);

		
		System.out.println(attributeRangeRule.getId());
		
		System.out.println(attributeRangeRule.toString());
		
		
		}
	}
