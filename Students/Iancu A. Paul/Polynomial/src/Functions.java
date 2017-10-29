
public class Functions {
	
	public static Polynomial add(Polynomial first, Polynomial second) {
		Polynomial result = new Polynomial();
		int indexCoefficient = 0, degreeOfFirst = first.getDegree(), degreeOfSecond = second.getDegree();
		while(indexCoefficient <= degreeOfFirst && indexCoefficient <= degreeOfSecond) {
			double coeffOfFirst = first.getCoefficient(indexCoefficient), 
			       coeffOfSecond = second.getCoefficient(indexCoefficient);
			result.setCoefficient(indexCoefficient, coeffOfFirst + coeffOfSecond);
			indexCoefficient++;
		}
		while(indexCoefficient <= degreeOfFirst) {
			double coeff = first.getCoefficient(indexCoefficient);
			result.setCoefficient(indexCoefficient, coeff);
			indexCoefficient++;
		}
		while(indexCoefficient <= degreeOfSecond) {
			double coeff = second.getCoefficient(indexCoefficient);
			result.setCoefficient(indexCoefficient, coeff);
			indexCoefficient++;
		}
		return result;
	}
	
	public static Polynomial subtract(Polynomial first, Polynomial second) {
		Polynomial result = new Polynomial();
		int indexCoefficient = 0, degreeOfFirst = first.getDegree(), degreeOfSecond = second.getDegree();
		while(indexCoefficient <= degreeOfFirst && indexCoefficient <= degreeOfSecond) {
			double coeffOfFirst = first.getCoefficient(indexCoefficient), 
			       coeffOfSecond = second.getCoefficient(indexCoefficient);
			result.setCoefficient(indexCoefficient, coeffOfFirst - coeffOfSecond);
			indexCoefficient++;
		}
		while(indexCoefficient <= degreeOfFirst) {
			double coeff = first.getCoefficient(indexCoefficient);
			result.setCoefficient(indexCoefficient, coeff);
			indexCoefficient++;
		}
		while(indexCoefficient <= degreeOfSecond) {
			double coeff = second.getCoefficient(indexCoefficient);
			result.setCoefficient(indexCoefficient, -coeff);
			indexCoefficient++;
		}
		return result;
	}
	
	public static Polynomial multiply(Polynomial first, Polynomial second) {
		Polynomial result = new Polynomial();
		int degreeOfFirst = first.getDegree(), degreeOfSecond = second.getDegree();
		for(int firstIndex = 0; firstIndex <= degreeOfFirst; firstIndex++) {
			double coeffFirst = first.getCoefficient(firstIndex);
			for(int secondIndex = 0; secondIndex <= degreeOfSecond; secondIndex++) {
				double coeffSecond = second.getCoefficient(secondIndex);
				double coeffResult = result.getCoefficient(firstIndex + secondIndex);
				coeffResult += coeffSecond * coeffFirst;
				result.setCoefficient(firstIndex + secondIndex, coeffResult);
			}
		}
		return result;
	}
	
	public static Polynomial scale(Polynomial polynomial, double scalar) {
		Polynomial result = new Polynomial();
		int degree = polynomial.getDegree();
		for(int index=0; index<=degree; index++) {
			double coefficient = polynomial.getCoefficient(index);
			result.setCoefficient(index, coefficient * scalar);
		}
		return result;
	}
}
