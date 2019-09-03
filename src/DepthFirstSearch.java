import java.util.ArrayList;


public class DepthFirstSearch {
    private boolean[] checked;
    private ArrayList<Integer>[] array;

    public DepthFirstSearch(int capacity) {
        this.checked = new boolean[capacity + 1];
        this.array = new ArrayList[capacity + 1];
        int i = 0;
        for (ArrayList arrayList : array) {
            array[i] = new ArrayList<>();
            i++;
        }
    }

    private void search(int x) {
        if (checked[x]) return;
        checked[x] = true;
        System.out.printf("%d ", x);
        for (int i = 0; i < array[x].size(); i++) {
            int y = array[x].get(i);
            search(y);
        }
    }

    public void start() {
        array[1].add(2);
        array[2].add(1);

        array[1].add(3);
        array[3].add(1);

        array[2].add(3);
        array[3].add(2);

        array[2].add(4);
        array[4].add(2);

        array[2].add(5);
        array[5].add(2);

        array[3].add(7);
        array[7].add(3);

        array[4].add(5);
        array[5].add(4);

        array[6].add(7);
        array[7].add(6);

        search(1);
    }
}