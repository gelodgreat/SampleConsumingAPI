package co.angeloumali.sampleconsumingapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.angeloumali.sampleconsumingapi.api_handler.SampleFetch;
import co.angeloumali.sampleconsumingapi.api_handler.SamplePost;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.base_name)
    EditText base_name;
    @BindView(R.id.btn_submit)
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();
    }

    private void init() {
        SampleFetch.getBases();
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String base = base_name.getText().toString();
                SamplePost.sendPost(base);
            }
        });
    }
}
