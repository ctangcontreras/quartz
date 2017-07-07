package solmit;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobClass implements Job {

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        System.out.println("TAREA JOB = " + new Date());
        try {
            System.out.println("TAREA JOB Inicio: " + new Date());
           
            //--

        } catch (Exception e) {
        	
        }
    }
}
