package adapter.task3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.authorization(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
