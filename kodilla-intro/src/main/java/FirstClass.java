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
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600 , 600 , 2010);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

    }
}