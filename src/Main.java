public class Main {
    public static void main(String[] args) {

        System.out.println("Задача номер 1______");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);


        System.out.println("Задача номер 2______");
        String fullName1 = fullName.toUpperCase();
        System.out.println( "Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1);


        System.out.println("Задача номер 3______");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println( "Данные Ф. И. О. сотрудника  — " + fullName2);




    }
}