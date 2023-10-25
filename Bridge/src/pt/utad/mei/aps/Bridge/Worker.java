package pt.utad.mei.aps.Bridge;

public abstract class Worker {
    protected Tasks task;

    public void ReceiveTask(Tasks task){
        this.task = task;
    }

    public abstract void Does();
}
