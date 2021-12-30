public class SalaryMan extends Employee {
    private Boolean salaryMoreThan4000$;

    SalaryMan() {
        super();
        salaryMoreThan4000$ = false;
    }

    SalaryMan(String employeeName, String employeeSurName, Boolean isSalaryMoreThan4000$) {
        super(employeeName, employeeSurName);
        salaryMoreThan4000$ = isSalaryMoreThan4000$;
    }

    public void setSalaryMoreThan4000$(Boolean isSalaryMoreThan4000$) {
        salaryMoreThan4000$ = isSalaryMoreThan4000$;
    }

    public Boolean isSalaryMoreThan4000$() {
        return salaryMoreThan4000$;
    }

    public String toString() {
        return getEmployeeName() + " " + getEmployeeSurName() + " " + (isSalaryMoreThan4000$() ? "Меньше" : "Больше") + " чем 4000$ в месяц ";
    }
}