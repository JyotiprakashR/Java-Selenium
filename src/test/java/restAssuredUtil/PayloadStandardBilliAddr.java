package restAssuredUtil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PayloadStandardBilliAddr {
	
	private String zip;
	private String country;
	private String city;
	private String latitude;
	private String street1;
	private String state;
	private String overrideAddress;
	private String longitude;

	
	

}
