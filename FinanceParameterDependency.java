public class FinanceParameterDependency implements Serializable {

  private static final long serialVersionUID = 1642495522071538463L;
	
	private String sourceParameterCode;
	private String destinationParameterCode;
	private String action;
	private String formula;

	public String getSourceParameterCode() {
		return sourceParameterCode;
	}

	public void setSourceParameterCode(String sourceParameterCode) {
		this.sourceParameterCode = sourceParameterCode;
	}

	public String getDestinationParameterCode() {
		return destinationParameterCode;
	}

	public void setDestinationParameterCode(String destinationParameterCode) {
		this.destinationParameterCode = destinationParameterCode;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}
}
