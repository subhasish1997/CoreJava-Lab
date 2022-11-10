class Student1 {
    private String name;
    private int DOB;
    private String email;

    public Student1(String name, int DOB, String email) {

        this.name = name;
        this.DOB = DOB;
        this.email = email;
    }

    public String toString() {

        return name + " " + DOB + " " + email;
    }
        class StudentRecord {

            public static void main(String[] args) {
                Student1[] s = new Student1[3];// Array of objects.

                s[0] = new Student1("Peter", 12/05/1997, "p@gmail.com");
                s[1] = new Student1("John", 25/04/1998, "j@gmail.com");
                s[2] = new Student1("Lisa", 04/12/1996, "l@gmail.com");

                for (int i = 0; i < 3; ++i) {
                    System.out.println(s[i].toString());
                }
            }
        }}