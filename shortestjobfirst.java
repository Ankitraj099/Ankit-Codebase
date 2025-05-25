import java.util.Arrays;

class job{
    int id;
    int burst;
    job(int id,int burst)
    {
       this.id=id;
       this.burst=burst;
    }
}


public class shortestjobfirst {

    public static void main(String[] args) {
        
        job[] jobs={
            new job(1,6),
            new job(2, 8),
            new job(3, 7),
            new job(4,3)
        };
        Arrays.sort(jobs,(a,b)->a.burst-b.burst);

        int totalWatingTime=0;
        int currenttime=0;

        for(job job:jobs)
        {
            int watingtime=currenttime;
            System.out.println(job.id+" "+job.burst+" "+watingtime);
            totalWatingTime +=currenttime;
            currenttime+=job.burst;
        }

        double avgtime=totalWatingTime/jobs.length;
        System.out.println(avgtime);
    }

    
}
