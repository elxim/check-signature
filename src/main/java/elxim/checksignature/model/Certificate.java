package elxim.checksignature.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Certificate {
	IssuerDnName IssuerDnNameObject;
	Validity ValidityObject;
	private String serialNumber;
	SubjectDnName SubjectDnNameObject;
	ArrayList<Object> policyIdentifiers = new ArrayList<Object>();

}