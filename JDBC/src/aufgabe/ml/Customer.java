package aufgabe.ml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private String firstname;
	private String lastname;
	private int yearOfBirth;

}
