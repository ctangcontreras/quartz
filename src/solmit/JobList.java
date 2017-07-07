package solmit;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;

public class JobList {

    public JobDetail retornaJob() {
        JobDetail job = null;
        try {
            job = JobBuilder.newJob(JobClass.class)
                    .withIdentity("dummyJobName", "group1")
                    .build();
        } catch (Exception e) {
           
        }
        return job;
    }

}
