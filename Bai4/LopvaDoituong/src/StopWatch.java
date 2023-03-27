import java.util.Scanner;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public  void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return  endTime-startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new  int[100000];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random() * 100000);
        }

        stopWatch.start();
        for (int i= 0;i<arr.length;i++){
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
        }
    }


