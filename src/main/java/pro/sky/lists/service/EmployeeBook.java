package pro.sky.lists.service;

public record EmployeeBook(String firstName, String lastName) {

    @Override
    public String toString() {
        return "Сотрудник: " +
                "{Имя - " + firstName +
                ", Фамилия - " + lastName +
                "}" + "\n";
    }
}
