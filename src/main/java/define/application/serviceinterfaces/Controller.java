package define.application.serviceinterfaces;

import org.hibernate.Hibernate;

import tocba2020.definebusinessrule.domain.businessrules.BusinessRule;

public class Controller {
	
	public void defineAttributeRangeRule(	int id,
											String database, 
											String table, 
											String column, 
											String constraintName, 
											int minValue, 
											int maxValue) {
		
		AttributeRangeRuleBuilder attributeRangeRuleBuilder = new AttributeRangeRuleBuilder();
		
		attributeRangeRuleBuilder.setId(id);
		attributeRangeRuleBuilder.setDatabase(database);
		attributeRangeRuleBuilder.setTable(table);
		attributeRangeRuleBuilder.setColumn(column);
		attributeRangeRuleBuilder.setConstraintName(constraintName);
		attributeRangeRuleBuilder.setMinValue(minValue);
		attributeRangeRuleBuilder.setMaxValue(maxValue);
		
		BusinessRule attributeRangeRule = attributeRangeRuleBuilder.build();
		
		System.out.println(attributeRangeRule.getId());
		
		System.out.println(attributeRangeRule.toString());
		
		HibernateDatabase hibernate = new HibernateDatabase();
		hibernate.storeBusinessRule(attributeRangeRule);
		
		
		}
	}