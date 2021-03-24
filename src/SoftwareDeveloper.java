public class SoftwareDeveloper extends Employee {

        protected Department department;
        protected String projectName;


        // Do not change anything in this method
        public static int getNumber() {
                return number;
        }

        // Fill in the blanks. Do not forget to use the keyword "super"
        public SoftwareDeveloper(String name, int yearOfSeniority, String projectName, Department department) {
                super(name, yearOfSeniority);

                this.projectName = projectName;
                this.department = department;
        }

        // Erase the content. Fill in the blanks. If yearOfSeniority and projectName are equal, it returns true
        @Override
        public boolean equals(Object obj) {

                SoftwareDeveloper sd = (SoftwareDeveloper) obj;

                return ((this.yearOfSeniority == sd.yearOfSeniority) && (this.projectName.equals(sd.projectName)));
        }

        // Erase the content.
        // Fill in the blanks. Format: [name]@[departmentName]-P:[projectName]-S:[yearOfSeniority]
        // For example: Jim@Android-P:ElectroAndroid-S:7
        @Override
        public String toString() {

                return name + "@" + department.name + "-P:" + projectName + "-S:" + yearOfSeniority;

        }

        //Erase the content. Fill in the blanks. It calculates salary of employee.
        //Formula is 2000 +  30 * (yearOfSeniority^2)
        @Override
        public double calculateSalary() {

                return 2000 + (30*(yearOfSeniority*yearOfSeniority));

        }
}
