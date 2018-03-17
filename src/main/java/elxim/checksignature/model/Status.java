package elxim.checksignature.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Status {
	private String nodeName;
	private String timeRequest;
	private String uuidRequest;
	private boolean documentsChecked;
	private String timeStampDataValid = null;
	private String timeStampData = null;
	ArrayList<Object> errorMessage = new ArrayList<Object>();
	private String documentsExpiry;
	private boolean documentsFound;
	private String serviceVersion;
	private String documentsURI;
	private String responseURI;
	private String documentHash;
	private String documentDigest;
	private String hashType;
	private String timeElapsed;
	private String trustCaLoaded;
	private float verifyCounter;
	private String trustStoreLustUpdate;

}