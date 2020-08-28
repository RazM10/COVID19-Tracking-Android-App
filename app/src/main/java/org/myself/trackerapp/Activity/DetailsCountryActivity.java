package org.myself.trackerapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.myself.trackerapp.R;

public class DetailsCountryActivity extends AppCompatActivity {

    private  int positionCountry;
    TextView tvCountry,
            tvCases,
            tvRecovered,
            tvCritical,
            tvActive,
            tvTodayCases,
            tvTotalDeaths,
            tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_country);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+AffectedCountriesActivity.countryStaticList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(AffectedCountriesActivity.countryStaticList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountriesActivity.countryStaticList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountriesActivity.countryStaticList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountriesActivity.countryStaticList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountriesActivity.countryStaticList.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountriesActivity.countryStaticList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountriesActivity.countryStaticList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountriesActivity.countryStaticList.get(positionCountry).getTodayDeaths());
    }
}
