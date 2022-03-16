package thread.threadpool;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池demo
 * @author 86185
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {

        while (true){
            System.out.println();
        }


    }

    @Scheduled
    public void test(){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(()->{

            System.out.println(Thread.currentThread().getName());

        },1,5, TimeUnit.SECONDS);
    }
}
