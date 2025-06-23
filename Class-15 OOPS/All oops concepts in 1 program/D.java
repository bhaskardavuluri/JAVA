abstract class Bank {
    abstract void cal_bal();  // Correct spelling
}

class Account extends Bank {
    private String acc_name;
    private String acc_email;

    public void setacc_name(String name) {
        this.acc_name = name;
    }

    public String getacc_name() {
        return acc_name;
    }

    public void setacc_email(String email) {
        this.acc_email = email;
    }

    public String getacc_email() {
        return acc_email;
    }

    @Override
    void cal_bal() {
        // Empty implementation, as Account is not supposed to compute balance.
    }
}

class CA extends Account {
    int acc_Id;
    int acc_Bal;
    static int min_Bal = 10000;

    public int getAcc_Id() {
        return acc_Id;
    }

    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }

    public int getAcc_Bal() {
        return acc_Bal;
    }

    public void setAcc_Bal(int acc_Bal) {
        this.acc_Bal = acc_Bal;
    }

    @Override
    void cal_bal() {
        System.out.println("CA Balance: " + (this.acc_Bal - min_Bal));
    }
}

class SA extends Account {
    int acc_Id;
    int acc_Bal;
    static int min_Bal = 500;

    public int getAcc_Id() {
        return acc_Id;
    }

    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }

    public int getAcc_Bal() {
        return acc_Bal;
    }

    public void setAcc_Bal(int acc_Bal) {
        this.acc_Bal = acc_Bal;
    }

    @Override
    void cal_bal() {
        System.out.println("SA Balance: " + (this.acc_Bal - min_Bal));
    }
}

class AccService {
    public static void getService(Bank b) {
        b.cal_bal();
    }
}

public class D {
    public static void main(String[] args) {
        SA sa1 = new SA();
        sa1.setAcc_Id(101);
        sa1.setacc_name("Rahul");
        sa1.setacc_email("rg@gmail.com");
        sa1.setAcc_Bal(5600);

        CA ca1 = new CA();
        ca1.setAcc_Id(102);
        ca1.setacc_name("Sonia");
        ca1.setacc_email("sg@gmail.com");
        ca1.setAcc_Bal(20000);

        AccService.getService(sa1);
        AccService.getService(ca1);
    }
}
