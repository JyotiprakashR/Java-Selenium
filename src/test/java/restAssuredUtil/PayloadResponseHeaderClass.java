package restAssuredUtil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PayloadResponseHeaderClass {
	
	
	private String transactionDateTime;
	private String correlationId;
	private String businessTransactionSequenceId;
	

}
