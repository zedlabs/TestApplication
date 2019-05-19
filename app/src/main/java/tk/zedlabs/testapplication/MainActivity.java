package tk.zedlabs.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
        items.add(new Post("Robin D.", getString(R.string.ronaldo), "4 hrs.", getString(R.string.post1),"17","98"));
        items.add(new Ground("MG stadium", "Winter-fell",getString(R.string.bernabau),"UNAVAILABLE"));
        items.add(new Post("Jon Snow", getString(R.string.messi),"17 hrs.",getString(R.string.post2),"45","12"));
        items.add(new Tournament("Delhi League", "North-Delhi",getString(R.string.isl),"ONGOING"));
        items.add(new Match("FC Goa","FC Tokyo",getString(R.string.goa), getString(R.string.tokyo)));
        items.add(new Post("Robin D.", getString(R.string.ronaldo), "4 hrs.", getString(R.string.post1),"17","98"));
        items.add(new Ground("MG stadium", "Winter-fell",getString(R.string.bernabau),"UNAVAILABLE"));
        items.add(new Post("Jon Snow", getString(R.string.messi),"17 hrs.",getString(R.string.post2),"45","12"));
        items.add(new Tournament("Delhi League", "North-Delhi",getString(R.string.isl),"ONGOING"));
        items.add(new Match("FC Goa","FC Tokyo",getString(R.string.goa), getString(R.string.tokyo)));
        items.add(new Post("Robin D.", getString(R.string.ronaldo), "4 hrs.", getString(R.string.post1),"17","98"));
        items.add(new Ground("MG stadium", "Winter-fell",getString(R.string.bernabau),"UNAVAILABLE"));
        items.add(new Post("Jon Snow", getString(R.string.messi),"17 hrs.",getString(R.string.post2),"45","12"));
        items.add(new Tournament("Delhi League", "North-Delhi",getString(R.string.isl),"ONGOING"));
        items.add(new Match("FC Goa","FC Tokyo",getString(R.string.goa), getString(R.string.tokyo)));
        items.add(new Post("Robin D.", getString(R.string.ronaldo), "4 hrs.", getString(R.string.post1),"17","98"));
        items.add(new Ground("MG stadium", "Winter-fell",getString(R.string.bernabau),"UNAVAILABLE"));
        items.add(new Post("Jon Snow", getString(R.string.messi),"17 hrs.",getString(R.string.post2),"45","12"));
        items.add(new Tournament("Delhi League", "North-Delhi",getString(R.string.isl),"ONGOING"));
        items.add(new Match("FC Goa","FC Tokyo",getString(R.string.goa), getString(R.string.tokyo)));
        return items;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvMain);
        rv.setAdapter(new MainAdapter(getSampleArrayList()));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
