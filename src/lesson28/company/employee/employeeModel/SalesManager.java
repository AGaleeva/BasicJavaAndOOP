package lesson28.company.employee.employeeModel;

public class SalesManager extends Employee {
    private double salesValue;
    private double percent;

    public SalesManager(int id, String firstName, String lastName, double hours, double salesValue, double percent) {
        super(id, firstName, lastName, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double calcSalary() {
        return salesValue * percent;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SalesManager{");
        sb.append(" , salara =").append(calcSalary());
        return sb.toString();
    }
}
