public class ObjectOriented {
    public static class Person{
        private String name;// private = restricted access
        private int newAge;
        private int Age = newAge;

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
        public void setAge( int Age){
            Object newAge = new Object();
            this.Age = (int) newAge;
        }

        public int  getAge() {
            return Age;
        }
    }
    }
