package co.angeloumali.sampleconsumingapi;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import co.angeloumali.sampleconsumingapi.api_handler.sampleFetch;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sampleFetch.getBases();
    }
}
