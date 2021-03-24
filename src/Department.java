public class Department {

        protected String name;
        protected int numberOfWorker;

        public static int number;


        // Do not change anything in this method
        public String getName() {
                return name;
        }


        // Fill in the blanks.
        public Department(String name, int numberOfWorker) {  //Sir, the int variables name was numberofEmployee. I guess that was a mistake so I corrected it.
                this.name = name;
                this.numberOfWorker = numberOfWorker;
                number++;

        }
        // Erase the content. Fill in the blanks. If name and numberOfWorker are equal, it returns true
        @Override
        public boolean equals(Object obj) {

                Department department = (Department) obj;

                return ((this.name.equals(department.name)) && (this.numberOfWorker == department.numberOfWorker));

        }
        // Erase the content. Fill in the blanks. Format: [name]/[numberOfWorker]
        // For example: Android/number of worker : 30
        @Override
        public String toString() {

                return name + "/number of worker : " + numberOfWorker;

        }
}
