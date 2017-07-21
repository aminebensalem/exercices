package kataFizzBuzz;

public class FizzBuzz {


	public String verifierLeNombre(int i) {
		if(i%3==0){
			return "Fizz";
		}
		else if (i%5==0){
			return "Buzz";
		}
		else return String.valueOf(i);
	}

}
