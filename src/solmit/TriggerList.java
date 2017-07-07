package solmit;

import java.util.Date;

import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

public class TriggerList {

    public Trigger retornaTrigger() {
        org.quartz.Trigger tri = null;
        try {
            int tiempo = 10;
            tri = TriggerBuilder
                    .newTrigger()
                    .withIdentity("dummyTriggerName", "group1")
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                            .withIntervalInSeconds(tiempo)
                            .repeatForever())
                    .build();
            System.out.println("inicio trigger: " + tiempo + " - " + new Date());
        } catch (Exception e) {
   
        }
        return tri;
    }

}
