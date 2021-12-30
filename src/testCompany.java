public class testCompany {
    public static void main(String[] args) {
        Company com = new Company();
        com.addEmployee(new SalaryMan("SalaryMan", "HumanBeing", true));
        com.addEmployee(new HourlyEmployee("Outsourcer1", "PoorGuy", false));
        com.addEmployee(new HourlyEmployee("Outsourcer2", "RichMan", true));
        com.print();
        System.out.println("Чуваков по ТК " + com.getSalaryManCount() + " шт");
        System.out.println("Чуваков на аутсорсе " + com.getHourlyCount() + " шт");
    }
}