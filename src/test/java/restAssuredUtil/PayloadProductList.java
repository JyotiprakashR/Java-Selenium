package restAssuredUtil;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PayloadProductList {
	
	private String programCode;
	private String packageName;
	private List<PlanServiceOfferingsClass> planServiceOfferings;

}
