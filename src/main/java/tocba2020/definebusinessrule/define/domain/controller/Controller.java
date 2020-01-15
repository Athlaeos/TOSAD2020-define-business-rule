package tocba2020.definebusinessrule.define.domain.controller;

import tocba2020.definebusinessrule.define.domain.builders.*;
import tocba2020.definebusinessrule.define.domain.businessrules.BusinessRule;

public class Controller {
	
	public void defineAttributeRangeRule(String database, String table, String column, String constraintName, int minValue, int maxValue) {
		
		AttributeRangeRuleBuilder attributeRangeRuleBuilder = new AttributeRangeRuleBuilder();
		
		attributeRangeRuleBuilder.setDatabase(database);
		attributeRangeRuleBuilder.setTable(table);
		attributeRangeRuleBuilder.setColumn(column);
		attributeRangeRuleBuilder.setConstraintName(constraintName);
		attributeRangeRuleBuilder.setMinValue(minValue);
		attributeRangeRuleBuilder.setMaxValue(maxValue);
		
		BusinessRule attributeRangeRule = attributeRangeRuleBuilder.build();
		
		attributeRangeRule.toString();
		
		}
	}
