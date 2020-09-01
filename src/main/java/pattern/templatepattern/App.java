package pattern.templatepattern;

public class App {

    public static void main(String[] args) {

        Worker iTworker = new ITWorker("小明");
        iTworker.workOneDay();
        Worker hRworker = new HRWorker("小红");
        hRworker.workOneDay();
        Worker qAworker = new QAWorker("小兰");
        qAworker.workOneDay();

    }
}
