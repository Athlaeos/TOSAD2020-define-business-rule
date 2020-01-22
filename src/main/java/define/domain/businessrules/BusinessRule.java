package define.domain.businessrules;

public abstract class BusinessRule {
	private String businessRuleName;
	private String description;
	private String when;
	private String event;
	private boolean forEachRow;
	private String errorMessage;

	public BusinessRule(String businessRuleName, String description, String when, String event, boolean forEachRow, String errorMessage) {
		this.businessRuleName = businessRuleName;
		this.description = description;
		this.when = when;
		this.event = event;
		this.forEachRow = forEachRow;
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return  businessRuleName + " | " + description + " | " + when + " | " + event + " | " + forEachRow + " | " + errorMessage;
	}
}
