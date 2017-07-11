package main;

/**
 * Created by Nlte on 2017/07/11 21:09.
 */
public class Department {
    private int id;
    private String dStr;

    public Department(int id, String dStr) {
        this.id = id;
        this.dStr = dStr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdStr() {
        return dStr;
    }

    public void setdStr(String dStr) {
        this.dStr = dStr;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", dStr='" + dStr + '\'' +
                '}';
    }
}
