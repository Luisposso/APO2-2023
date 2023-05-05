package main;

public class MyClass {

	    public int num = 10;
	    
	    int getFactorial() {
	        int factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
	    
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Factorial: ").append(num).append("! = ");
	        for (int i = 1; i < num; i++) {
	            sb.append(i).append(" * ");
	        }
	        sb.append(num).append(" = ").append(getFactorial());
	        return sb.toString();
	    }
	}

	
	


