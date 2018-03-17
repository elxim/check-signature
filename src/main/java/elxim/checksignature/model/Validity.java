package elxim.checksignature.model;

public class Validity {
	
	
	  private String NOT_BEFORE;
	  private String NOT_AFTER;


	 // Getter Methods 

	  public String getNOT_BEFORE() {
	    return NOT_BEFORE;
	  }

	  public String getNOT_AFTER() {
	    return NOT_AFTER;
	  }

	 // Setter Methods 

	  public void setNOT_BEFORE( String NOT_BEFORE ) {
	    this.NOT_BEFORE = NOT_BEFORE;
	  }

	  public void setNOT_AFTER( String NOT_AFTER ) {
	    this.NOT_AFTER = NOT_AFTER;
	  }
	}
