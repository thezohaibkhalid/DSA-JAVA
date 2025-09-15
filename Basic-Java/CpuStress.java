public class CpuStress {

    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Starting CPU stress test using " + cores + " threads...");

        for (int i = 0; i < cores; i++) {
            Thread thread = new Thread(new HeavyComputationTask());
            thread.start();
        }
    }
}

class HeavyComputationTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            double result = 0.0;
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                result += Math.sqrt(i) * Math.tan(i); 
            }
        }
    }
}
