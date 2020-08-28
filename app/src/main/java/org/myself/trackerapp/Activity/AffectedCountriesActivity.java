package org.myself.trackerapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import com.leo.simplearcloader.SimpleArcLoader;

import org.myself.trackerapp.Adapter.CountryAdapter;
import org.myself.trackerapp.Model.Country;
import org.myself.trackerapp.R;

import java.util.ArrayList;
import java.util.List;

public class AffectedCountriesActivity extends AppCompatActivity {

    EditText edtSearch;
    ListView listView;
    SimpleArcLoader simpleArcLoader;

    public static List<Country> countryModelsList = new ArrayList<>();
    Country countryModel;
    CountryAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
    }
}
