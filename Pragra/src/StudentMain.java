public class StudentMain {

    public static void main(String[] args) {

        Student std1 = new Student();
        std1.name = "Kavitha"; //instance variable
        System.out.print(std1.name);
        std1.Study();
        System.out.print(std1.name);
        std1.Playing();
        System.out.println(std1.name+std1.Sing());
        System.out.println(std1.name+std1.Eat());


        Student std2 = new Student();
        std2.name = "Praveen";
        System.out.print(std2.name);
        std2.Study();
        System.out.print (std2.name);
        std2.Playing();
        System.out.println(std2.name+std2.Sing());
        System.out.println(std2.name+std2.Eat());


    }
}
