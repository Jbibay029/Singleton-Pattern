public class QueueSystem {
    private static int currentQueueNum = 1;

    public int getCurrentQueueNum() {
        return currentQueueNum;
    }

    public void incrementQueueNum() {
        currentQueueNum++;
    }

    public void resetQueueNum(int newQueueNumber) {
        currentQueueNum = newQueueNumber;
    }

}