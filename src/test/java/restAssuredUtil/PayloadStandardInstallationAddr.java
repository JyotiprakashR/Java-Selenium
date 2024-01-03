package restAssuredUtil;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayloadStandardInstallationAddr {
	
	private String zip;
	private String country;
	private String city;
	private String latitude;
	private String street1;
	private String state;
	private String overrideAddress;
	private String longitude;

	
}
