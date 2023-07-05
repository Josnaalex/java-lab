interface bill
{
    void calculate();
}
class TrueBill implements bill {
    public int pid, quantity, unit_price, total;
    public String name;
    TrueBill(int pd, String nm, int qt, int up) {
        this.pid = pd;
        this.name = nm;
        this.quantity = qt;
        this.unit_price = up;
    }

    public void calculate() {
        this.total = this.quantity * this.unit_price;
    }
}

class inter_cal {
    public static void main(String[] args) {
        TrueBill a = new TrueBill(101, "A", 2, 25);
        TrueBill b = new TrueBill(102, "B", 1, 100);
        a.calculate();
        b.calculate();

        int net_amount = a.total + b.total;

        System.out.println("ProductID\tName\tQuantity\tUnit Price\tTotal");
        System.out.println("-----------------------------------------------");
        System.out.println(a.pid + "\t" + a.name + "\t" + a.quantity + "\t" + a.unit_price + "\t" + a.total);
        System.out.println(b.pid + "\t" + b.name + "\t" + b.quantity + "\t" + b.unit_price + "\t" + b.total);
        System.out.println("-----------------------------------------------");
        System.out.println("\t\t\t\tNet Amount: " + net_amount);
    }
}
