package Kasus3;

public class Salesperson implements Comparable{
	private String firstName, lastName;
	private int totalSales;
	
	public Salesperson (String first, String last, int sales) {
		firstName = first;
		lastName = last;
		totalSales = sales;
	}
	
	public String toString() {
		return lastName + ", " + firstName + ": \t" + totalSales;
	}
	
	public boolean equals (Object other) {
		return (lastName.equals(((Salesperson)other).getLastName()) &&
				firstName.equals(((Salesperson)other).getFirstName()));
	}
	
	public int compareTo(Object other) {
		int result;
		Salesperson otherSalesperson = (Salesperson) other;
	    
	    if (this.totalSales < otherSalesperson.totalSales) {
	        return -1;
	    } else if (this.totalSales > otherSalesperson.totalSales) {
	        return 1;
	    } else {
	    	int k = this.firstName.compareTo(otherSalesperson.firstName);
	        if (k != 0) {
	        	result = k;
	        }
	        else {
	            result = this.lastName.compareTo(otherSalesperson.lastName);
	        }
	        
	        
	    }
	    return result;
	}


	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSales() {
		return totalSales;
	}

}
