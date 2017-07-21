package kataFizzBuzz;

public class FizzBuzz {

	public String verifierLeNombre() {
		
		return "1";
	}

	public String verifierLeNombre(int i) {
		if(i%3==0){
			return "Fizz";
		}
		else return String.valueOf(i);
	}

}
