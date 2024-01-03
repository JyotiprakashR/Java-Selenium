package restAssuredUtil;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class De_SerializeClass {
	/**
	{
	    "post code": "500016",
	    "country": "India",
	    "country abbreviation": "IN",
	    "places": [
	        {
	            "place name": "Old Begumpet",
	            "longitude": "78.5406",
	            "state": "Andhra Pradesh",
	            "state abbreviation": "AP",
	            "latitude": "17.4381"
	        }
	    ]
	}
*/
	@JsonProperty("post code")
	private String postcode;
	private String country;
	@JsonProperty("country abbreviation")
	private String countryabbreviation;
	private List<De_SerializeClassPlaces>  places;

	public String getPostcode() {
		return postcode;
	}
	
	public String getCountry() {
		return country;
	}
	public String getCountryabbreviation() {
		return countryabbreviation;
	}
	public List<De_SerializeClassPlaces> getPlaces() {
		return places;
	}
	
	
}
