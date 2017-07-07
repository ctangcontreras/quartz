package solmit;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class TriggerClasss {

    public void llamadaJob() {
        try {
            JobDetail job = new JobList().retornaJob();
            Trigger trigger = new TriggerList().retornaTrigger();
            Scheduler sch = new StdSchedulerFactory().getScheduler();
            sch.scheduleJob(job, trigger);
            sch.start();
            
            
            
        } catch (SchedulerException e) {
         }
    }

}
