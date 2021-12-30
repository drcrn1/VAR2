public class HourlyEmployee extends Employee {
    private Boolean paymentPerHour20$;

    HourlyEmployee() {
        super();
        paymentPerHour20$ = false;
    }

    HourlyEmployee(String employeeName, String employeeSurName, Boolean isPaymentPerHourGreaterThan20$) {
        super(employeeName, employeeSurName);
        paymentPerHour20$ = isPaymentPerHourGreaterThan20$;
    }

    public void setPaymentPerHour(Boolean isPaymentPerHourGreaterThan20$) {
        paymentPerHour20$ = isPaymentPerHourGreaterThan20$;
    }

    public Boolean isPaymentPerHour20$() {
        return paymentPerHour20$;
    }

    public String toString() {
        return getEmployeeName() + " " + getEmployeeSurName() + " " + (isPaymentPerHour20$() ? "Больше" : "Меньше") + " 20$ в час";
    }
}

