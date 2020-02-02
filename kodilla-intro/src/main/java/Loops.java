public class Loops {
    public static void main(String[] args) {
        Object [] tab = new Object[3];
        tab[0]="tekst";
        tab[1]=4;
        tab[2]=true;
    }

    public int sumNumbers(int[] numbers) {
        int result=0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

}
