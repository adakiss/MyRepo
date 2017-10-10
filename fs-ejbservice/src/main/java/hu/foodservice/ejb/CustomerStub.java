package hu.foodservice.ejb;

public class CustomerStub {
	
	private String custName;
	
	private Integer custTelNumber;
	
	private String custAddress;

	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getCustTelNumber() {
		return custTelNumber;
	}

	public void setCustTelNumber(Integer custTelNumber) {
		this.custTelNumber = custTelNumber;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	
}
