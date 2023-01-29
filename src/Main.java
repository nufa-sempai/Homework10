public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
//Задание 1
        private static void task1() {
            System.out.println("Task 1");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";

            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника - " + fullName);
        }
//Задание 2
        private static void task2() {
            System.out.println("\nTask 2");
            String fullName = "Ivanov Ivan Ivanovich";

            System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullName.toUpperCase());
        }
//Задание 3
        private static void task3() {
            System.out.println("\nTask 3");
            String fullName = "Иванов Семён Семёнович";

            System.out.println("Данные ФИО сотрудника для заполнения отчёта - "
                    + fullName.replace("ё", "е"));
        }
}