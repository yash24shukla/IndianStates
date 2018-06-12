package com.example.hp.indianstates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

String[] indianStates = {"Andra Pradesh" , "Arunachal Pradesh" , "Assam" , "Bihar" , "Chhattisgarh" , "Goa" ,"delhi",
        "Gujarat" , "Haryana" , "Himachal Pradesh" , "Jammu and Kashmir" , "Jharkhand" , "Karnataka"
        ,"Kerala" , "Madya Pradesh" , "Maharashtra" , "Manipur" , "Meghalaya", "Mizoram" ,"Nagaland","Orissa","Punjab","Rajasthan","Sikkim","Tamil Nadu"
        ,"Tripura","Uttaranchal","Uttar Pradesh" , "West Bengal"
 };
 final String[] stateCM = {"Shri. Nara Chandrababu",   "Pema Khandu",   "Shri Sarbananda Sonowal",  "Shri Nitish Kumar",  "Dr. Raman Singh",  "Shri Arvind Kejriwal",  "Shri Manohar Parrikar", "Shri Vijaybhai R. Rupani", "Shri Manohar Lal", "Jai Ram Thakur", "Mehbooba Mufti Sayeed", "Shri Raghubar Das", "Sh. H.D. Kumaraswamy", "Shri Pinarayi Vijayan",  "Shri Shivraj Singh Chouhan",  "Shri Devendra Fadnavis", "Nongthombam Biren Singh", "Conrad Sangma",  "Shri Lal Thanhawla", "Neiphiu Rio",  "Shri Naveen Patnaik",  "Shri. V. Narayanasamy", "Shri Captain Amarinder Singh", "Smt. Vasundhara Raje", "Shri Pawan Kumar Chamling", "Edappadi K Palaniswami", "Shri K Chandrasekhar Rao", "Shri Biplab Kumar Deb", "Shri Yogi Adityanath", "Trivendra Singh Rawat", "Km. Mamata Banerjee",
 };
        ListView listView = (ListView) findViewById(R.id.myList);
        final ArrayList arrayList = new ArrayList(Arrays.asList(indianStates));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1 , arrayList );
        listView.setAdapter(arrayAdapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext() , "CM of " + arrayList.get(position) +" is " + stateCM[position] , Toast.LENGTH_SHORT).show();




    }
});





    }
}
