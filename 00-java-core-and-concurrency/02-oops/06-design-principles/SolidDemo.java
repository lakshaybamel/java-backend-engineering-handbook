// SRP - Separate responsibilities
class UserService {
    void saveUser() {
        System.out.println("User saved");
    }
}

class EmailService {
    void sendEmail() {
        System.out.println("Email sent");
    }
}

// OCP + DIP using interface
interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}

// Depends on abstraction (DIP)
class PaymentProcessor {

    private Payment payment;

    PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    void process() {
        payment.pay();
    }
}

public class SolidDemo {
    public static void main(String[] args) {

        // SRP usage
        UserService userService = new UserService();
        EmailService emailService = new EmailService();

        userService.saveUser();
        emailService.sendEmail();

        System.out.println();

        // OCP + DIP usage
        Payment p1 = new UpiPayment();
        PaymentProcessor processor1 = new PaymentProcessor(p1);
        processor1.process();

        Payment p2 = new CardPayment();
        PaymentProcessor processor2 = new PaymentProcessor(p2);
        processor2.process();
    }
}