package restAssuredUtil;

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
public class De_SerializeClassPlaces {
	
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
	
	@JsonProperty("place name")
	private String placename;
	private String longitude;
	private String state;
	@JsonProperty("state abbreviation")
	private String stateabbreviation;
	private String latitude;
	public String getPlacename() {
		return placename;
	}
	public String getLongitude() {
		return longitude;
	}
	public String getState() {
		return state;
	}
	public String getStateabbreviation() {
		return stateabbreviation;
	}
	@Override
	public String toString() {
		return " [placename=" + placename + ", longitude=" + longitude + ", state=" + state
				+ ", stateabbreviation=" + stateabbreviation + ", latitude=" + latitude + "]";
	}
	public String getLatitude() {
		return latitude;
	}
	
	
	
}
