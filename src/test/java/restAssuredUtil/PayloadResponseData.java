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
public class PayloadResponseData {
	
	
	private String partnerResponseCode;
	private PayloadStandardBilliAddr standardizedBillingAddress;
	private PayloadStandardInstallationAddr standardizedInstallationAddress;
	private List<PayloadPartnerResponseMessageList> partnerResponseMessageList;
	private List<PayloadProductList> productList;
}
