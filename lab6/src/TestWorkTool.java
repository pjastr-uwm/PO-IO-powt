import pl.edu.uwm.a1.Hammer;
import pl.edu.uwm.a1.Saw;
import pl.edu.uwm.a1.Screwdriver;
import pl.edu.uwm.a1.WorkTool;

import java.util.ArrayList;

public class TestWorkTool {

    public static void main(String[] args) {
        ArrayList<WorkTool> list = new ArrayList<>();
        list.add(new Hammer());
        list.add(new Screwdriver());
        list.add(new Saw());
        list.add(new Screwdriver());
        list.add(new Saw());
        for(WorkTool elem: list){
            elem.use();
        }
    }
}
