package aurelliofishandy.jwork_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SelesaiJobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai_job);

        TextView etId        = findViewById(R.id.tvSelesaiId);
        TextView etJobseeker = findViewById(R.id.tvSelesaiJobseeker);
        TextView etDate      = findViewById(R.id.tvSelesaiDate);
        TextView etPayment   = findViewById(R.id.tvSelesaiPayment);
        TextView etStatus    = findViewById(R.id.tvSelesaiStatus);
        TextView etReferral  = findViewById(R.id.tvSelesaiReferral);
        TextView etJobname   = findViewById(R.id.tvSelesaiJobname);
        TextView etJobfee    = findViewById(R.id.tvSelesaiJobfee);
        TextView etTotalfee  = findViewById(R.id.tvSelesaiTotalfee);
    }

    public void onCancelledButtonClick(View view) {}
    public void onFinishedButtonClick(View view) {}

}