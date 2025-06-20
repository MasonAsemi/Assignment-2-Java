public class Payroll {

    public Payroll() {
    }

    public void processPayments(Worker worker) {
        System.out.println("Payment processed for worker: " + worker.getName());
        System.out.println("Hours worked: " + worker.getHoursWorked());
    }
}