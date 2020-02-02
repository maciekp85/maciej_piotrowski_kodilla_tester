public class User {
    String name;
    int year;

    public User(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public int calculateYearsSumAndReturnAverage(User[] users) {
        int average = 0;
        for (int i = 0; i < users.length; i++) {
            average += users[i].getYear();
        }
        average /= users.length;
        return average;
    }

    public void displayPersonNamesWhoHaveYearLessThanAverage(User[] users, int average) {
        for (int j = 0; j < users.length; j++) {
            if (users[j].getYear() < average) {
                System.out.println(users[j].getName());
            } else {
                System.out.println("");
            }
        }
    }

    public int tableNumbersSum(int[] table) {
        int sum = 0;
        for (int i = 0; i == table.length-1; i++) {
            sum = sum+table[i];
        }
        return sum;

    }
}
