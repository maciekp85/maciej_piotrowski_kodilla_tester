public class UserTest {

    public static void main(String[] args) {
        User userOne=new User("Kasia",42);
        System.out.println(userOne.getName()+userOne.getYear());

        User userTwo=new User("Krystian",18);
        System.out.println(userTwo.getName()+userTwo.getYear());

        User userThree=new User("Michał",32);
        System.out.println(userThree.getName()+userThree.getYear());

        User userFour=new User("Aneta",24);
        System.out.println(userFour.getName()+userFour.getYear());

        User[]users=new User[]{userOne,userTwo,userThree,userFour};

        User object=new User("Adam",50);
        object.calculateYearsSumAndReturnAverage(users);
        System.out.println(object.calculateYearsSumAndReturnAverage(users));

        User object1=new User("Krzysztof",5);
        object1.displayPersonNamesWhoHaveYearLessThanAverage(users,object.calculateYearsSumAndReturnAverage(users));
    }
}
