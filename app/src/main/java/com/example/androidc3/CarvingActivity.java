package com.example.androidc3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.androidc3.Adapter.GridOfCarvAdapter;
import com.example.androidc3.Adapter.GridOfCharAdapter;
import com.example.androidc3.Model.CarvingModel;
import com.github.florent37.expansionpanel.ExpansionLayout;
import com.github.florent37.expansionpanel.viewgroup.ExpansionLayoutCollection;

import java.util.ArrayList;
import java.util.List;

import static maes.tech.intentanim.CustomIntent.customType;

public class CarvingActivity extends AppCompatActivity {
    Intent intent;
    ImageView image;
    RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private GridOfCarvAdapter gridOfCarvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carving);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Carving");





        //fill with empty objects
        final ArrayList<CarvingModel> list = new ArrayList<>();
            list.add(new CarvingModel(1, "Waka Maumahara", "On the marae ātea (courtyard) is 7.5 metre pou (pillar) in the form of a waka (canoe).\n" +
                    "\n" +
                    "This is the waka maumahara (memorial pillar) which faces Taupiri mountain. At the top of the waka maumahara stands the native kaahu (hawk) representing the Māori Queen Dame Te Atarirangikaahu.\n\n", R.drawable.wakamaumahara));
            list.add(new CarvingModel(2, "Pou Whakarae", "Near the waka maumahara (memorial pillar ) are seven smaller pou whakarae(pillars) which symbolise the star cluster Matariki (Pleides).\n\n", R.drawable.pouwhakarae));
            list.add(new CarvingModel(3, "Pou-tūā-rongo - Tawhaki", "Located on the back wall of the wharenui the pou-tūā-rongo is a carving of Tawhaki who received the baskets of knowledge (nga kete wananga).\n" +
                    "\n" +
                    "Tawhaki is featured looking towards the doorway and the world of light. This was also carved in totara from a tree which use to stand on Wintec’s city campus.\n\n", R.drawable.poutuarongo));
            list.add(new CarvingModel(4, "Pou-tūā-rangi", "The pou-tūā-rangi (internal wharenui post) near the entrance represents Wintec values.\n" +
                    "\n" +
                    "-Mahi tahi - Working together\n" +
                    "-Whakaaro whanui - Challenge and innovation\n" +
                    "-Manaaki tangata - Customer focus\n" +
                    "-Kia Tika - Taking ownership\n" +
                    "-Kia tupu, kia hua - Improvement and opportunity\n" +
                    "-Whakamana i te tangata - Valuing people\n" +
                    "It has been carved in totara from a tree which used to stand on Wintec city campus. Behind the pou-tua-rangi is a tukutuku panel from the original Wintec wharenui, Te Kākano a te Kaahu. \n\n", R.drawable.portuarangi));
            list.add(new CarvingModel(5, "Tomokanga", "The entrance designs welcome people from around the world of Wintec.\n" +
                    "\n" +
                    "The sub-tribes (hapū) of this area are shown welcoming visitors onto the marae in a central carving at the entrance.\n\n", R.drawable.tomokanga));
            list.add(new CarvingModel(6, "Pare and Whakawae", "Above the wharenui pare (doorway) are three figures nga kete wānanga representing the three baskets of knowledge. Part of the creation story of Tainui is also told in the designs.Manaia and takarangi patterns symbolise growth and development. The textured ngao matariki pattern on the sides of the doorway (whakawae) represents the welcoming of the cultures and peoples of the world.\n\n", R.drawable.pareandwhakawae));
            list.add(new CarvingModel(7, "Kōrupe", "The taniwha Tuheitia is carved on the window lintel (kōrupe) above the front window of Te Kākano a te Kaahu, along with ngao matariki and manaia designs.\nTuheitia holds guardianship of the Waipa river and was regarded with awe and respect.\n\n", R.drawable.korupe));

        recyclerView = findViewById(R.id.recyclerView);
//        image=findViewById(R.id.image1);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        final RecyclerAdapter adapter = new RecyclerAdapter();
//        recyclerView.setAdapter(adapter);
//
        gridOfCarvAdapter = new GridOfCarvAdapter(list);
        gridLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridOfCarvAdapter);
//        adapter.setItems(list);

    }
    public void more(View view)
    {
        Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wintec.ac.nz/about-wintec/m%C4%81ori-and-pasifika/wintec-marae/marae-carvings"));
        startActivity(link);

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_topmenu, menu);
        menu.removeItem(R.id.itemlist);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 16908332://back
                finish();
                return true;
            case R.id.itemhome:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                customType(this,"right-to-left");
                return true;
            case R.id.itemaboutus:
                intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}