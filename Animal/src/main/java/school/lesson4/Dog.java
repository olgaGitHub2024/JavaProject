package school.lesson4;

public class Dog extends Animal {
        private String name;
        static int countDod = 0;
        private int runLimit = 500;
        private int swimLimit = 10;

        public Dog(String name){
            super();
            countDod++;
            this.name = name;
        }

        @Override
        public void run(int distance) {
            if (distance > runLimit) {
                System.out.println(name+ " не может бежать больше " + runLimit + " м");
            } else {
                System.out.println(name+ " пробежала " + distance + " м");
            }

        }

        @Override
        public void swim(int distance) {
            if (distance > swimLimit) {
                System.out.println(name + " не может плавать больше " + swimLimit + " м");
            } else {
                System.out.println(name + " проплыла " + distance + " м");
            }
        }
        static int getCountDod (){
            return countDod;
        }

}
