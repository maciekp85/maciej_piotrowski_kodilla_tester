public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600 , 1000 , 2018);
        System.out.println(notebook.weight + "g " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000 , 1500 , 2019);
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600 , 600 , 2010);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        int[] numbers =new int[]{12,3,45,7};
        Loops object=new Loops();
        object.sumNumbers(numbers);
//        System.out.println(object);

        int[] numbers2 =new int[]{12,4};
        User user = new User("Ania", 34);
        System.out.println("Suma: " + user.tableNumbersSum(numbers2));
    }
}