public class Employee {
    private String employeeName;
    private String employeeSurName;

    public Employee() {
        employeeName = "";
        employeeSurName = "";
    }

    public Employee(String _employeeSurName, String _employeeName) {
        employeeSurName = _employeeSurName;
        employeeName = _employeeName;
    }

    public void setEmployeeName(String name) {
        employeeName = name;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeSurName(String name) {
        employeeSurName = name;
    }

    public String getEmployeeSurName() {
        return employeeSurName;
    }
}
