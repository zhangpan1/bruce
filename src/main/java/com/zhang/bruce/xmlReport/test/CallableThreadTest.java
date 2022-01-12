

import java.util.concurrent.*;

/**
 * @author admin
 */
public class CallableThreadTest {

    public static void main(String[] args) {
        ExecutorService executorService=Executors.newCachedThreadPool();
        //提交时候 线程池开始执行
        System.out.println("1主线程开始执行");

        Future<String> sFuture =  executorService.submit(new TaskCallable());;
        System.out.println("hhhhh");
        String ResultStirng = null;  //下面线程执行的结果
        try {
            ResultStirng = sFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("2结果："+ResultStirng);
        System.out.println("okokokok");
    }
}
class TaskCallable implements Callable<String>{  //可以返回线程结果
    @Override
    public String call() throws Exception {
        System.out.println("3正在执行任务，请等待五秒");
        Thread.sleep(5000);
        System.out.println("4执行完毕");
        return "这是返回结果";
    }

}