public class Start {
    public static void main(String[] args) {
<<<<<<< HEAD
        Animal.testAnimal();
        Animal bird = new Animal("Lollipop", 1.0);
=======
    	Animal.testAnimal();
        Animal cat = new Cat("Neko", 2.33);
        //Test student with cat as pet
        Student stu = new Student("Andy", cat);
        //Test the information of student's pet
        System.out.println(stu.getPet().getName() == "Neko");
        System.out.println(stu.getPet().getWeight() == 2.33);
>>>>>>> cbe7a34900dea22e3d5939c94ad546e2eeb112e0
        Student.testStudent();
    }
}
