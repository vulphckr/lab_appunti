class Student {

    String name;
	String surname;
	int id;
	int matriculationYear;

    void build(String name, String surname, int id, int matYear) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.matriculationYear = matYear;
    }

    void printStudentInfo() {
		System.out.println(
			"Nome: " + this.name + ", Cognome: " + this.surname + ", id: " + this.id
				+ ", anno di immatricolazione: " + this.matriculationYear
		);	
    }
}
