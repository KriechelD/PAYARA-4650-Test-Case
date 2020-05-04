package pkg;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class Scheduler {

    @Schedule(hour = "*", minute = "*", second = "0")
    public void task() {
        System.out.println("running scheduler task");
    }

}
