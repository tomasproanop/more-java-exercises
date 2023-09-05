import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {

	public static void main(String[] args) {

		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(year, month, day);
		Period.between(today, birthDate);
		
	}

}
