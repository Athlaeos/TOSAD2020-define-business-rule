package tocba2020.definebusinessrule.define.domain.businessrules;

public class AttributeRangeRule implements BusinessRule {
	private String database;
	private String table;
	private String column;
	private String constraintName;
	private int minValue;
	private int maxValue;
	
	public AttributeRangeRule(String database, String table, String column, String constraintName, int minValue, int maxValue) {
		this.database = database;
		this.table = table;
		this.column = column;
		this.constraintName = constraintName;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

}
