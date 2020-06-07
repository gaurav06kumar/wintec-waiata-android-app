package com.example.androidc3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidc3.Adapter.GridOfCharAdapter;
import com.example.androidc3.Adapter.ListOfCharAdapter;
import com.example.androidc3.Model.WaiataModel;

import java.util.ArrayList;

import static maes.tech.intentanim.CustomIntent.customType;

public class WaiataActivity extends AppCompatActivity {
    private ArrayList<WaiataModel> charList = new ArrayList<>();
    private GridOfCharAdapter gridOfCharAdapter;
    private ListOfCharAdapter listOfCharAdapter;
    private RecyclerView charRecyclerview;
    private Toolbar toolbar;
    private GridLayoutManager gridLayoutManager;
    private int span_count_1 = 1, span_count_2 = 2;
    Intent intent;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiata);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Waiata");



        //toolbar = findViewById(R.id.toolbarList);
        //store the value in the form of array


        charList.add(new WaiataModel(1,R.drawable.ekorekoeengaro, "E Kore Koe E Ngaro",
                "This waiata was composed by members of local kapahaka " +
                "Te Iti Kahurangi, as a tribute to the ongoing support the group has received from Wintec over the years.\n\n" +
                "It references names and stories associated with our marae, including the wharenui 'Te Kākano a te kaahu', " +
                "the interior carving 'Tāwhaki', the large memorial pillar dedicated to the late Māori Queen 'Te Atairangikaahu', " +
                "and the three buildings which represent 'Ngā Kete Wānanga', the three baskets of knowledge.\n\n" +
                "When performing this waiata, the last line 'E ko Te Kuratini o Waikato' may also be sung at the beginning as an intro, and also repeated at the end.",
                "To Waikato Institute of Technology\n\n" +
                        "You are not lost, seed of heaven\n" +
                        "Kākano a te kāhu stand tall\n" +
                        "Te Kōpū Mānia, cultivate new growth\n" +
                        "Foster this person of the world\n\n" +
                        "Matariki on display, draw in all canoes\n" +
                        "Bind them to the posts of support and care\n" +
                        "Te Atairangikaahu, fly above\n" +
                        "Kīngi Tūheitia, hold steadfast below\n\n" +
                        "Tāwhaki ascend, prepare the house\n" +
                        "For the three baskets of knowledge\n" +
                        "Bind them, fasten them\n" +
                        "To Waikato Institute of Technology",
                "E ko Te Kuratini o Waikato e\n\nE kore koe e ngaro he kākano i ruia\n" +
                "Kākano a te Kaahu e tū nei e\n" +
                "Te Kōpū Mānia, te ngāwhā whakatupu\n" +
                "Ka tupu he tangata, rere ki te ao\n\nHorahia Matariki, kūmea ngā waka\n" +
                "Herea ki te pou o te aroha e\n" +
                "Te Atairangikaahu, tāiri kei runga\n" +
                "Ko Kīngi Tūheitia ki te whenua e\n\nPiki ake Tāwhaki, tāhūhū matapū\n" +
                "Ngā kete wānanga e toru e\n" +
                "Whītikitia rā, ka turuturu iho\n" +
                "E ko Te Kuratini o Waikato e.", R.raw.ekorekoe_1 ));
        charList.add(new WaiataModel(2,R.drawable.hemaimaiarohanatawhiao, "He Maimai Aroha nā Tāwhiao",
                "After the devastation of the Waikato raupatu or land confiscations of 1863, Kingi Tāwhiao sought refuge in Maniapoto" +
                        "or the King Country. After nearly two decades, in the early 1880s he made an emotional return to Waikato.\n\n" +
                        "This lament express his deeply felt sorrow for the land and its meaning to him. It includes in the lyrics the name of our" +
                        "marae, Te Kōpū Mānia o Kirikiriroa.",
                "I look down on the valley of Waikato,\n" +
                        "As though to hold it in the hollow of my hand\n" +
                        "And caress its beauty\n" +
                        "Like some tender verdant thing.\n\n" +
                        "I reach out from the top of Pirongia\n" +
                        "As though to cover and protect its\n" +
                        "Substance with my own.\n\n" +
                        "See how it bursts through the full bosoms\n" +
                        "Of Maungatautari and Maungakawa,\n" +
                        "Hills of my inheritance\n" +
                        "The river of life, each curve more beautiful\n" +
                        "Than the last.\n\n" +
                        "Crossing the smooth belly of Kirikiriroa,\n" +
                        "Its gardens bursting with fullness of the rich\n" +
                        "Eart towards the meeting place at\n" +
                        "Ngāruawāhia.\n\n" +
                        "There on the fertile mound i would rest\n" +
                        "My head\n" +
                        "And look through the thighs of\n" +
                        "Taupiri\n\n" +
                        "There at the place of all creation\n" +
                        "Let the King come forth.",
                "Ka mātakitaki iho au ki te riu o Waikato\n" +
                        "Anō nei hei kapo kau ake māku\n" +
                        "Ki te kapu o taku ringa,\n" +
                        "Ka whakamiri noa I tōna aratau,\n" +
                        "E tia nei he tupu pua hou.\n\n" +
                        "Kia hiwa ake au I te tihi o Pirongia,\n" +
                        "Inā hei toronga whakaruruhau mōna\n" +
                        "Ki tōku tauawhirotanga.\n\n" +
                        "Anā! Te ngoto o tōna ngāwhā\n" +
                        "I ōna uma kīhai I ārikarika\n" +
                        "A Maungatautari, a Maungakawa,\n" +
                        "Ōku puke maunga, ngā taonga tuku iho:\n" +
                        "Hoki ake nei au ki tōku awa koiora\n" +
                        "Me ōna pikonga\n" +
                        "He kura tangihia o te mātāmuri.\n\n" +
                        "E whakawhiti atu ai I te kōpū mānia\n" +
                        "O Kirikiriroa\n" +
                        "Me ōna māra kai, te ngāwhā whakatupu\n" +
                        "Ake o te whenua mōmona,\n" +
                        "Hei kawe ki Ngāruawāhia,\n" +
                        "Te huinga o te tangata.\n\n" +
                        "Arā, te pae haumako, hei okiokinga mō\n" +
                        "Taku upoko,\n" +
                        "Hei tirohanga atu mā raro I ngā hūhā\n" +
                        "O Taupiri.\n\n" +
                        "Kei reira rā, kei te oroko hanganga o te tangata\n" +
                        "Wāhia te tungaroa o te whare,\n" +
                        "Te whakaputanga mō te Kīngi.", R.raw.hemaimaiaroha_1 ));
        charList.add(new WaiataModel(3,R.drawable.waikatoteawa, "Waikato Te Awa",
                "Mr Harrison, the author of this poem, writes that 'When working on the different hydro works on the Waikato River, " +
                        "I spent quite a few hours of leisure, marvelling at the greatness of the dams and lakes formed on this waterway. " +
                        "So, in my spare time i made up this poetry about the Waikato River'.\n\n" +
                        "This was published in the historical Te Ao Hou magazine in June 1962, issue 29. Over the years, there have been slight adjustments" +
                        "to the poem to suit the context of todays's communities. Wintec only sings the first three verses.",
                "Electric Shock",
                "Waikato te awa\n" +
                        "Katohia, katohia he wai māu\n" +
                        "Katohia he wai māu\n" +
                        "Ka eke ki Te Pūaha o Waikato\n" +
                        "Te awa; he piko, he taniwha\n" +
                        "He piko, he taniwha\n\n" +
                        "Kia tūpato rā kei tahuri koe\n" +
                        "I ngā au kaha o Waikato\n" +
                        "Whakamau tō titiro ki tawhiti rā\n" +
                        "Ko Taupiri te maunga\n" +
                        "Pōtatau te tangata\n" +
                        "Te mauri o te motu e\n\n" +
                        "E hoe tō waka ki Ngāruawāhia\n" +
                        "Tūrangawaewae mō te ao katoa\n" +
                        "Te tongi whakamutunga a Matutaera\n" +
                        "Auē hoki auē", R.raw.waikatoteawa_1 ));
        charList.add(new WaiataModel(4,R.drawable.tutiramaingaiwi, "Tūtira mai ngā iwi",
                "Wi Huata wrote this song and taught it to this children whilst on a family gathering to lake Tutira, north of Napier.\n\n" +
                        "He was explaing how the iwi came together here to support each other.\n\n" +
                        "Later he used this song to promote Moral Re-armament, uniting different cultures.",
                "Line up together, people\n" +
                        "All of us, all of us. \n" +
                        "Stand in rows, people \n" +
                        "All of us, all of us.\n" +
                        "Seek after knowledge\n" +
                        "and love of others, everybody!\n" +
                        "Be really virtuous\n" +
                        "And stay united. \n" +
                        "All of us, all of us.\n\n" +
                        "Line up together, people\n" +
                        "All of us, all of us. \n" +
                        "Stand in rows, people \n" +
                        "All of us, all of us.\n" +
                        "Seek after knowledge\n" +
                        "and love of others, everybody!\n" +
                        "Be really virtuous\n" +
                        "And stay united. \n" +
                        "All of us, all of us.\n\n" +
                        "All of us, all of us\n" +
                        "Hi aue hei",
                "Tūtira mai ngā iwi\n" +
                        "Tātou tātou e\n" +
                        "Tūtira mai ngā iwi\n" +
                        "Tātou tātou e\n" +
                        "Whaia te maramatanga\n" +
                        "Me te aroha, e ngā iwi\n" +
                        "Kia ko tapatahi\n" +
                        "Kia kotahi rā.\n" +
                        "Tātou tātou e.\n\n" +
                        "Tūtira mai ngā iwi\n" +
                        "Tātou tātou e\n" +
                        "Tūtira mai ngā iwi\n" +
                        "Tātou tātou e\n" +
                        "Whaia te maramatanga\n" +
                        "Me te aroha, e ngā iwi\n" +
                        "Kia ko tapatahi\n" +
                        "Kia kotahi rā.\n" +
                        "Tātou tātou e.\n\n" +
                        "Tātou, tātou E\n" +
                        "Hi aue hei" +
                        "", R.raw.tutiramainga_1 ));
        charList.add(new WaiataModel(5,R.drawable.pupuketehihiri, "Pupuke Te Hihiri",
                "Nā Nganehu Turner ngā kupu, nā Tania Oxenham te rangi © 2004 Nganehu Turner (Ngāti Maniapoto) held the position of pouako (tutor) " +
                        "of Te Reo Māori and kuia at Wintec for manny years.\n\n" +
                        "This was one of the songs she dedicated to the Māori students of Wintec, all who hoped to see their aspirations fulfilled.",
                "Ascend Son, Daughter\n To the pinnacle of Wintec\n Hold fast to quality principles\n" +
                        "That reflect your successes\n" +
                        "Ascend Son, Daughter\n To the pinnacle of Wintec\n Hold fast to quality principles\n" +
                        "That reflect your successes\n\n" +
                        "From conception the increase\n From increase the thought\n" +
                        "From throught the knowledge out of Chaos\n" +
                        "From conception the increase\n From increase the thought\n" +
                        "From throught the knowledge out of Chaos\n\n" +
                        "From the basets of knowledge Tāwhaki retrieved\n" +
                        "Comes spirit, life-force, power, language,\n" +
                        "Understanding and Knowledge\n" +
                        "The isthmus of Culture.\n\n" +
                        "From conception the increase\n From increase the thought\n" +
                        "From throught the knowledge out of Chaos\n" +
                        "From conception the increase\n From increase the thought\n" +
                        "From throught the knowledge out of Chaos\n\n" ,
                "Piki ake e tama e Hine\n" +
                        "I te ahurei o te Kuratini o Waikato\n" +
                        "He mātāpono whakaū kounga\n" +
                        "Ka whakaata i te angitū" +
                        "Piki ake e tama e Hine\n" +
                        "I te ahurei o te Kuratini o Waikato\n" +
                        "He mātāpono whakaū kounga\n" +
                        "Ka whakaata i te angitū\n\n" +
                        "Pupuke te hihiri\n" +
                        "Pupuke te mahara\n" +
                        "Pupuke te wānanga a te Kore\n" +
                        "Pupuke te hihiri\n" +
                        "Pupuke te mahara\n" +
                        "Pupuke te wānanga a te Kore\n\n" +
                        "Nō ngā kete i pikihia e Tāwhaki\n" +
                        "He wairua, he mauri, he mana, he reo\n" +
                        "He māramatanga, he mātauranga\n" +
                        "He iho o te ahurea\n\n" +
                        "Pupuke te hihiri\n" +
                        "Pupuke te mahara\n" +
                        "Pupuke te wānanga a te Kore\n" +
                        "Pupuke te hihiri\n" +
                        "Pupuke te mahara\n" +
                        "Pupuke te wānanga a te Kore", R.raw.pupuketehihiri_1 ));
        charList.add(new WaiataModel(6,R.drawable.itewharewhaapiri, "I Te Whare Whakapiri",
                "This waiata was written by past Wintec students who came to Wintec to learn Te Reo Māori.\n\n" +
                        "The song exposes the effects colonization has had on their lives and encourage Wintec to be a pillar by" +
                        "which they and others following can restore what was lost.\n\n" +
                        "In this instance, it is the language which is the doorway to their cultural inheritance and well being.",
                "Fire",
                "Attack + defence + Carry", R.raw.itewhare_1 ));
        charList.add(new WaiataModel(6,R.drawable.puateowhai, "Pua Te Kōwhai", "", "Fire","Attack + defence + Carry", R.raw.puatekowhai_1 ));

        gridOfCharAdapter = new GridOfCharAdapter(charList);
        listOfCharAdapter = new ListOfCharAdapter(charList);

        charRecyclerview = findViewById(R.id.recyclerview);

        //        for grid
        gridLayoutManager = new GridLayoutManager(this, span_count_2);
        charRecyclerview.setLayoutManager(gridLayoutManager);
        charRecyclerview.setItemAnimator(new DefaultItemAnimator());
        charRecyclerview.setAdapter(gridOfCharAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_topmenu, menu);
        menu.removeItem(R.id.itemhome);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 16908332://back
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                customType(this,"right-to-left");
                return true;
            case R.id.itemlist:
                swapView(item);
                return true;
            case R.id.itemaboutus:
                intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void swapView(MenuItem item){
        if(gridLayoutManager.getSpanCount() == span_count_2)
        {
            item.setIcon(R.drawable.ic_grid);
            gridLayoutManager.setSpanCount(span_count_1);
            charRecyclerview.setAdapter(listOfCharAdapter);
        }else if(gridLayoutManager.getSpanCount()==span_count_1)
        {
            item.setIcon(R.drawable.ic_list);
            gridLayoutManager.setSpanCount(span_count_2);
            charRecyclerview.setAdapter(gridOfCharAdapter);
        }

    }


}