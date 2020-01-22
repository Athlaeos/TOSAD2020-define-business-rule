package define.domain.businessrules;

public class AttributeRangeRule implements BusinessRule {
	private int id;
	private String database;
	private String table;
	private String column;
	private String constraintName;
	private int minValue;
	private int maxValue;
	
	public AttributeRangeRule(int id, String database, String table, String column, String constraintName, int minValue, int maxValue) {
		this.id = id;
		this.database = database;
		this.table = table;
		this.column = column;
		this.constraintName = constraintName;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	public int getId () {
		return this.id;
	}
	
	
	public String toString() {
		return id + " " + database + " " + table + " " + column + " " + constraintName + " " + minValue + " " + maxValue;
	}

}
