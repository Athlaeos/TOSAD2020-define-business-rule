package tocba2020.definebusinessrule.define.domain.builders;

import tocba2020.definebusinessrule.define.domain.businessrules.AttributeRangeRule;
import tocba2020.definebusinessrule.define.domain.businessrules.BusinessRule;

public class AttributeRangeRuleBuilder implements BusinessRuleBuilder{
	private String database;
	private String table;
	private String column;
	private String constraintName;
	private int minValue;
	private int maxValue;
	
	public void setDatabase(String database) {
		this.database = database;		
	}

	public void setTable(String table) {
		this.table = table;		
	}

	public void setColumn(String column) {
		this.column = column;		
	}

	public void setConstraintName(String constraintName) {
		this.constraintName = constraintName;
		
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;	
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public BusinessRule build() {
		return new AttributeRangeRule(this.database, this.table, this.column, this.constraintName, this.minValue, this.maxValue);
	}


}
