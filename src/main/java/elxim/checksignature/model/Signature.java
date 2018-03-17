package elxim.checksignature.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Signature {

	private String signatureFormat;
	private String signingTime;
	private String identity;
	private String codiceFiscale;
	private String title;
	private String verifiedBy;
	private float level;
	ArrayList<Object> info = new ArrayList<Object>();
	Indicazioni IndicazioniObject;
	SignerCertificate SignerCertificateObject;
	private String expires;

}