package restAssuredUtil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PayloadFinal {

	private PayloadResponseHeaderClass responseHeader;
	private PayloadResponseData responseData;
	private String responseCode;
	private String responseMessage;
	private String transactionSequenceId;
	private String responseCode1;
	
	

}
