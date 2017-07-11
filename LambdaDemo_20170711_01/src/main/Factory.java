package main;

/**
 * Created by Nlte on 2017/07/11 21:11.
 */
public class Factory {
    private static int id = 0;

    public static Employee getEmployee(String name, String dStr) {
        Department department = new Department(id, dStr);
        return new Employee(id, name, department);
    }

    private int getId() {
        return id + 1;
    }
}
