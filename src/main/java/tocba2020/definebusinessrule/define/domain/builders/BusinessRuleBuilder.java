package tocba2020.definebusinessrule.define.domain.builders;

import tocba2020.definebusinessrule.define.domain.businessrules.BusinessRule;

public interface BusinessRuleBuilder{
	
	void setDatabase(String database);
	void setTable(String table);
	void setColumn(String column);
//	void setConstraintName(String constraintName);
//	void setMinValue(String minValue);
//	void setMaxValue(String maxValue);
	
	BusinessRule build();

}
