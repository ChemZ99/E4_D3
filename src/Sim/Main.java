package Sim;

public class Main {
    public static void main(String[] args) {
    Sim s1 = new Sim("3348765432");
    Call c1 = new Call(22, "378163573");
    Call c2 = new Call(33, "167593214");
    Call c3 = new Call(44, "371573173");
    Call c4 = new Call(55, "751635487");
    Call c5 = new Call(66, "149123756");
    s1.setPrevCalls(c1);
    s1.setPrevCalls(c2);
    s1.setPrevCalls(c3);
    s1.setPrevCalls(c4);
    s1.setPrevCalls(c5);
        System.out.println(s1.getCellnum());
        System.out.println(s1.getCredit());
        s1.getPrevCalls();
    }
}
