package ForkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * TODO
 *
 * @author pengjian
 * @since 2023-01-06
 */
public class ForkJoinDemo {
    /**
     * fork/join 拆分、连接
     * Fork 就是把一个大任务切分为若干子任务并行的执行，
     * Join 就是合并这些子任务的执行结果，最后得到这个大任务的结果
     * ForkJoinTask
     * 必须首先创建一个 ForkJoin 任务。它提供在任务中执行 fork() 和 join() 操作的机制
     * recursiveAction 没有返回结果
     * recursiveTask 有返回结果
     * ForkJoinPool
     *  ForkJoinTask 需要通过 ForkJoinPool 来执行，任务分割出的子任务会添加到当前工作线程所维护的双端队列中，进入队列的头部。当一个工作线程的队列里暂时没有任务时，它会随机从其他工作线程的队列的尾部获取一个任务
     *
     */


    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CountTask countTask = new CountTask(1, 10000);
        ForkJoinTask<Integer> result = forkJoinPool.submit(countTask);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }



    private static class CountTask extends RecursiveTask<Integer>{
        private static final int threshold = 2;//阀值
        private int start;
        private int end;

        public CountTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            int sum = 0;
            boolean canCompute = (end - start) <= threshold;
            if (canCompute) {
                for (int i = start; i <=end ; i++) {
                    sum += i;
                }
            }else {
                //拆分两个子任务
                int middle = (start + end) / 2;
                CountTask leftTask = new CountTask(start, middle);
                CountTask rightTask = new CountTask(middle+1,end);
                invokeAll(leftTask, rightTask);
                leftTask.fork();
                rightTask.fork();
                //等待子任务完成
                Integer leftResult = leftTask.join();
                Integer rightResult = rightTask.join();
                sum = leftResult + rightResult;
            }
            return sum;
        }
    }

}


