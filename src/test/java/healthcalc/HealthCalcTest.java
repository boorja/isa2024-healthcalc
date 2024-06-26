package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	HealthCalc calculadora = new HealthCalcImpl();

	// TESTS para el método idealWeight(int height, char gender)

	@Test
	@DisplayName("Test 1: Lanzamiento de excepcion con altura no valida")
	public void testIW_InvalidHeight() throws Exception {
		int invalidHeight = -1;
		char gender = 'm';
		
		try {
            calculadora.idealWeight(invalidHeight, gender);
        } catch (Exception e) {
            // Assert
            assertEquals("Altura no valida", e.getMessage());
        }
	}

	@Test
	@DisplayName("Test 2: Lanzamiento de excepcion con genero no valido")
	public void testIW_InvalidGender() throws Exception {
		int Height = 170;
		char invalidGender = 'f';
		
		try {
            calculadora.idealWeight(Height, invalidGender);
        } catch (Exception e) {
            // Assert
            assertEquals("Genero no valido", e.getMessage());
        }
	}

	@Test
	@DisplayName("Test 3: Verifica la obtencion del resultado correcto para un hombre")
	public void testIW_IW4Male() throws Exception {
		int height = 180;
		char gender = 'm';
		float expected_w = (float)(50+(0.91*height-152.4));

		assertEquals(expected_w, calculadora.idealWeight(height, gender));
	}

	@Test
	@DisplayName("Test 4: Verifica la obtencion del resultado correcto para una mujer")
	public void testIW_IW4Female() throws Exception {
		int height = 180;
		char gender = 'w';
		
		float expected_iw = (float)(45.5+(0.91*height-152.4));

		assertEquals(expected_iw, calculadora.idealWeight(height, gender));
	}

	
	// TESTS para el método basalMetabolicRate(float weight, int height, char gender, int age)

	@Test
	@DisplayName("Test 5: Lanzamiento de excepcion con peso no valido")
	public void testBMR_InvalidWeight() throws Exception {
		float weight = -60;
		int height = 170;
		char gender = 'w';
		int age = 36;
				
		try {
            calculadora.basalMetabolicRate(weight, height, gender, age);
        } catch (Exception e) {
            // Assert
            assertEquals("Peso no valido", e.getMessage());
        }
	}

	@Test
	@DisplayName("Test 6: Lanzamiento de excepcion con altura no valida")
	public void testBMR_InvalidHeight() throws Exception {
		float weight = 60;
		int height = -170;
		char gender = 'w';
		int age = 36;
				
		try {
            calculadora.basalMetabolicRate(weight, height, gender, age);
        } catch (Exception e) {
            // Assert
            assertEquals("Altura no valida", e.getMessage());
        }
	}

	@Test
	@DisplayName("Test 7: Lanzamiento de excepcion con genero no valido")
	public void testBMR_InvalidGender() throws Exception {
		float weight = 60;
		int height = 170;
		char gender = 'f';
		int age = 36;
				
		try {
            calculadora.basalMetabolicRate(weight, height, gender, age);
        } catch (Exception e) {
            // Assert
            assertEquals("Genero no valido", e.getMessage());
        }
	}

	@Test
	@DisplayName("Test 8: Lanzamiento de excepcion con edad no valida")
	public void testBMR_InvalidAge() throws Exception {
		float weight = 60;
		int height = 170;
		char gender = 'w';
		int age = -36;
				
		try {
            calculadora.basalMetabolicRate(weight, height, gender, age);
        } catch (Exception e) {
            // Assert
            assertEquals("Edad no valida", e.getMessage());
        }
	}

	@Test
	@DisplayName("Test 9: Verifica la obtencion del resultado correcto para un hombre")
	public void testBMR_BMR4Male() throws Exception {
		float weight = 60;
		int height = 170;
		char gender = 'm';
		int age = 36;

		float expected_bmr = (float)((10*weight)+(6.25*height)-(5*age)+5);

		assertEquals(expected_bmr, calculadora.basalMetabolicRate(weight, height, gender, age));
	}

	@Test
	@DisplayName("Test 10: Verifica la obtencion del resultado correcto para una mujer")
	public void testBMR_BMR4Female() throws Exception {
		float weight = 60;
		int height = 170;
		char gender = 'w';
		int age = 36;

		float expected_bmr = (float)((10*weight)+(6.25*height)-(5*age)-161);

		assertEquals(expected_bmr, calculadora.basalMetabolicRate(weight, height, gender, age));
	}
}
