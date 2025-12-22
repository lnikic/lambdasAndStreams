import java.util.Comparator;

public class Eagle implements Bird, Comparator<Eagle> {

    @Override
    public void canFly(String val) {
        System.out.println("Eagle Bird Implementation");
    }

    @Override
    public int compare(Eagle o1, Eagle o2) {
        return 0;
    }
}
