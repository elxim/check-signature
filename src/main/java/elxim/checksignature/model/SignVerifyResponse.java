package elxim.checksignature.model;

import lombok.Data;

@Data
public class SignVerifyResponse {

	private boolean valid;
	private float signatureFound;
	private float validSignaturesCount;
	private String validationTime;
	Signature SignatureObject;
	Status StatusObject;

}
