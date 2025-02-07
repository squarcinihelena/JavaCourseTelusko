public class Human {

    //everytime you create an instance variable make it private
        private int age;
        private String name;

        // Construtor padrão (sem parâmetros)
        public Human() {
        }

        // Construtor com dois parâmetros
        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // Método getter para 'age'
        public int getAge() {
            return age;
        }

        // Método setter para 'age'
        public void setAge(int age) {
            this.age = age;
        }

        // Método getter para 'name'
        public String getName() {
            return name;
        }

        // Método setter para 'name'
        public void setName(String name) {
            this.name = name;
        }
    }

