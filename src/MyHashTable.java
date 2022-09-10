import java.util.*;

public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo
	// object holding a reference value pointing to a employee.

	public ArrayList<EmployeeInfo>[] buckets;
        int numInTable;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int empNumber) {
		return(empNumber % buckets.length);  // employee number modulo number of buckets
	}

	public void addToTable(EmployeeInfo theEmp) {
		int sN = theEmp.empNum;
		int index = calcBucket(sN);
		buckets[index].add(theEmp);
                numInTable ++;
		
	}


	public EmployeeInfo removeFromTable(int empNumber) {
		int searchIndex = calcBucket(empNumber);
		int len = buckets[searchIndex].size();

		for (int i = 0; i < len; i ++) {
			if (buckets[searchIndex].get(i).empNum == empNumber){
				return buckets[searchIndex].remove(i);
			}
		}

		System.out.println("Employee Not Found!");
		return null;
	}

	
	public EmployeeInfo getFromTable(int empNumber) {
		int searchIndex = calcBucket(empNumber);

		for (EmployeeInfo employee : buckets[searchIndex]) {
			if (employee.empNum == empNumber) {
				return employee;
			}
		}

		return null;
	}


	public void displayTable() {
		if (buckets.length == 0) {
			System.out.println("Hash table is empty");
		} else {
			for (ArrayList<EmployeeInfo> arrayList: buckets) {
				if (arrayList.size() != 0) {
					for (EmployeeInfo employee: arrayList) {
						System.out.println(employee.empNum);
					}
				}
			}
		}
	}
}
