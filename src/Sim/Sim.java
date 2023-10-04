package Sim;

import java.lang.reflect.Array;

public class Sim {
    private String Cellnum;
    private int Credit;
    private Call[] PrevCalls;

    public Sim (String Cellnum){
        this.Cellnum = Cellnum;
        this.Credit = 0;
        this.PrevCalls = new Call[5];

    }

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int credit) {
        Credit = credit;
    }

    public String getCellnum() {
        return Cellnum;
    }

    public void setCellnum(String cellnum) {
        Cellnum = cellnum;
    }

    public void getPrevCalls() {
        for (int i=0; i < PrevCalls.length; i++) {
            System.out.println("called number: " + PrevCalls[i].getCalledNumber());
            System.out.println("duration: " + PrevCalls[i].getDuration());
        }
    }

    public void setPrevCalls(Call c1) {
        for (int i= PrevCalls.length-2; i >= 0; i--) {
            PrevCalls[i+1] = PrevCalls[i];
        }
        PrevCalls[0] = c1;
    }
}
