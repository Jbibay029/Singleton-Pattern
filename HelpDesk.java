public class HelpDesk {
    private QueueSystem queueingsystem;

    public HelpDesk(QueueSystem queueingsystem) {
        this.queueingsystem = queueingsystem;
    }

    public void serveNextCust() {
        int currentQueueNum = queueingsystem.getCurrentQueueNum();
        System.out.println("Help desk station serving customer with queue number: " + currentQueueNum);
        queueingsystem.incrementQueueNum();
    }

    public void resetQueueNum(int newQueueNumber) {
        queueingsystem.resetQueueNum(newQueueNumber);
        System.out.println("Queue number reset to: " + newQueueNumber);
    }
}
