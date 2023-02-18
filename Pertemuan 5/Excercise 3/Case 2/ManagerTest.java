package Exercise3;

public class ManagerTest{
	public static void main (String[] args){
		Manager[] staff = new Manager[3];
		staff[0] = new Manager("Antonio Rossi", 3000000, 1, 10, 1989);
		staff[1] = new Manager("Maria Bianchi", 3500000, 1, 12, 1991);
		staff[2] = new Manager("Isabel Vidal", 3200000, 1, 11, 1993);
		int i;
		for (i = 0; i < 3; i++) {
			staff[i].raiseSalary(5);
		}
		System.out.println("Sebelum diurutkan:");
		for (i = 0; i < 3; i++) {
			staff[i].print();
		}
		
		Sortable.shell_sort(staff);
		
		System.out.println("\nSetelah diurutkan:");
		for (i = 0; i < 3; i++) {
			staff[i].print();
		}
	}
}
