package javafeatures.module;

import java.util.Date;

public  class Scheduler {
    private Date dateStart;
    private Date dateEnd;

    public Scheduler(int dateStart, int dateEnd) {
        this.dateStart.setDate(dateStart);
        this.dateEnd.setTime(dateEnd);
    }

    public int remainingDays(){

        return 2;
    }
}
