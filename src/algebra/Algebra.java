package algebra;

public class Algebra {
	 public static void main(String[] args){
		 isPrime(677);
	 }
	 
	 public static void isPrime(int i){
		 boolean flag = false;
		 for(int j = 2; j < Math.sqrt(i); j++){
			 if(i % j == 0){
				 System.out.println(i + " is not prime. It's two factors are: " + i/j + " and " + j);
				 flag = true;
				 break;
			 }
		 }
		 if(!flag){
			 System.out.println(i + " is a prime number");
			 System.out.println("I Like potatoes");
		 }
	 }
}
