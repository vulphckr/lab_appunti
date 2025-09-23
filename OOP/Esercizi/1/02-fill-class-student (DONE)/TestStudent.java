class TestStudent {

    public static void main(String[] args) {
        Student bro1 = new Student();
		Student bro2 = new Student();
		Student bro3 = new Student();
		bro1.build("Axel", "Balducci", 1015, 2019);
		bro2.build("Angel", "Bianchi", 1016, 2018);
		bro3.build("Andrea", "Bracci", 1017, 2017);
        bro1.printStudentInfo();
		bro2.printStudentInfo();
		bro3.printStudentInfo();
    }
}
