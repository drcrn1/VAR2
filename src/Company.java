import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee m) {
        employees.add(m);
    }

    public Company() {
    }

    public void print() {
        for (Employee employee : employees)
            System.out.println(employee.toString());
    }

    public int getHourlyCount() {
        int result = 0;
        for (Employee employee : employees) {
            if (employee instanceof HourlyEmployee)
                result++;
        }
        return result;
    }

    public int getSalaryManCount() {
        int result = 0;
        for (Employee employee : employees) {
            if (employee instanceof SalaryMan)
                result++;
        }
        return result;
    }
}

