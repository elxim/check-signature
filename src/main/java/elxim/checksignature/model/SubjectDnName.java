package elxim.checksignature.model;

public class SubjectDnName {
	  private String dnQualifier;
	  private String serialNumber;
	  private String title;
	  private String sn;
	  private String givenName;
	  private String CN;
	  private String O;
	  private String C;
	  private String policyID;


	 // Getter Methods 

	  public String getDnQualifier() {
	    return dnQualifier;
	  }

	  public String getSerialNumber() {
	    return serialNumber;
	  }

	  public String getTitle() {
	    return title;
	  }

	  public String getSn() {
	    return sn;
	  }

	  public String getGivenName() {
	    return givenName;
	  }

	  public String getCN() {
	    return CN;
	  }

	  public String getO() {
	    return O;
	  }

	  public String getC() {
	    return C;
	  }


	 // Setter Methods 

	  public void setDnQualifier( String dnQualifier ) {
	    this.dnQualifier = dnQualifier;
	  }

	  public void setSerialNumber( String serialNumber ) {
	    this.serialNumber = serialNumber;
	  }

	  public void setTitle( String title ) {
	    this.title = title;
	  }

	  public void setSn( String sn ) {
	    this.sn = sn;
	  }

	  public void setGivenName( String givenName ) {
	    this.givenName = givenName;
	  }

	  public void setCN( String CN ) {
	    this.CN = CN;
	  }

	  public void setO( String O ) {
	    this.O = O;
	  }

	  public void setC( String C ) {
	    this.C = C;
	  }


	}