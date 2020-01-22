package define.domain.businessrules;

public class AttributeRangeRule extends BusinessRule {
	private boolean notter;
	private String operatorValue;
	private String compareValue1;
	private String compareValue2;

	public AttributeRangeRule(String businessRuleName, String description, String when, String event, boolean forEachRow, String errorMessage, boolean notter, String operatorValue, String compareValue1, String compareValue2) {
		super(businessRuleName, description, when, event, forEachRow, errorMessage);
		this.notter = notter;
		this.operatorValue = operatorValue;
		this.compareValue1 = compareValue1;
		this.compareValue2 = compareValue2;
	}

	public String toString() {
		return super.toString() + " | " + notter + " | " + operatorValue + " | " + compareValue1 + " | " + compareValue2;
	}

}
