package restAssuredUtil;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_DEFAULT)
//@JsonInclude(value = Include.NON_NULL)
//@JsonInclude(value = Include.NON_EMPTY)
//@JsonInclude(value = Include.NON_ABSENT)
public class JsonIncludeAnnotation {

	private String firstName;
	private String lastName;
	private int age;
	private String address;

	public static void main(String a[]) {

		JsonIncludeAnnotation obj = JsonIncludeAnnotation.builder().firstName(Faker.instance().name().firstName())
				.lastName(Faker.instance().name().lastName()).age(23).address(Faker.instance().address().fullAddress()).build();

		JsonIncludeAnnotation obj1 = JsonIncludeAnnotation.builder().firstName(Faker.instance().name().firstName())
				.lastName(Faker.instance().name().lastName()).address(Faker.instance().address().fullAddress()).build();

		try {
			ObjectMapper objMapper = new ObjectMapper();
			String jsonPayload = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			System.out.println(jsonPayload);
			System.out.println("-------");
			String jsonPayload1 = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
			System.out.println(jsonPayload1); // here it is sending default value of age which is int type, to overcome this use jackson annotation
			/**
			 * { "firstName" : "Jerry", "lastName" : "Lynch", "age" : 0, "address" : "7969
			 * Kutch Summit, Larsonmouth, NE 94245-9216" }
			 */

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}
}
