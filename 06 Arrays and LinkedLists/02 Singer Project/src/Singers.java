
import java.util.ArrayList;

public class Singers {

    private ArrayList<String> singerList = new ArrayList<String>();

    public void showSingers() {
        System.out.println(singerList.size() + " singer in the list.");

        for (int i = 0; i < singerList.size(); i++) {
            System.out.println((i + 1) + ". singer: " + singerList.get(i));
        }
    }

    public void addSinger(String newSinger) {
        singerList.add(newSinger);
        System.out.println("Singer added to list.");
    }

    public void updateSinger(int position, String newSinger) {
        singerList.set(position, newSinger);
        System.out.println("Singer list updated.");
    }

    public void deleteSinger(int position) {
        singerList.remove(position);
        System.out.println("Singer deleted from the list.");
    }

    public void searchSinger(String singerName) {
        int position = singerList.indexOf(singerName);
        if (position >= 0) {
            System.out.println("Find the singer!");
            System.out.println(singerName + " is in the " + position + ". position");
        } else {
            System.out.println("Couldn't find the singer.");
        }

    }
}
