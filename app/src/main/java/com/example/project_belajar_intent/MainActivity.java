package com.example.project_belajar_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void panggil(View view) {
        String nomor = "09667347" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void buka(View view) {
        String url = "https://badoystudio.com" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

    public void tentang(View view) {
        Intent tentang= new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }

    public void msc(View view) {
        String url = "https://workspace.google.com/intl/id/products/drive/?utm_source=google&utm_medium=cpc&utm_campaign=1011352-Workspace-APAC-ID-id-BKWS-EXA-HV&utm_content=text-ad-none-none-DEV_c-CRE_614448685403-ADGP_Hybrid%20%7C%20BKWS%20-%20EXA%20%7C%20Txt%20~%20Drive-KWID_43700072415566813-aud-1589252136686:kwd-2833008900&userloc_9125145-network_g&utm_term=KW_google%20drive&gclid=EAIaIQobChMIvqL50ten-gIVLpFmAh0cAwTfEAAYASABEgLhd_D_BwE&gclsrc=aw.ds" ;
        Intent bukadrive = new Intent(Intent. ACTION_VIEW);
        bukadrive.setData(Uri. parse(url));
        startActivity(bukadrive);
    }

    public void open(View view) {
        Intent open= new Intent(MainActivity.this, drive.class);
        startActivity(open);
    }
    //Button kembali = findViewById(R.id.kembali);

        //kembali.setOnClickListener(new View.OnClickListener() {
       // @Override
        //public void onClick(View view) {
           // finish();
       // }
//}
}
