package kr.ac.cnu.computer.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mbtn_url1;
    Button mbtn_url2;
    Button mbtn_url3;
    Button mbtn_url4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtn_url1 = findViewById(R.id.btn_url1);
        mbtn_url2 = findViewById(R.id.btn_url2);
        mbtn_url3 = findViewById(R.id.btn_url3);
        mbtn_url4 = findViewById(R.id.btn_url4);


        mbtn_url1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://smartstore.naver.com/sincero/"));
                startActivity(urlintent);
            }
        });
        mbtn_url2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://greenbliss.co.kr/"));
                startActivity(urlintent);
            }
        });
        mbtn_url3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://onlyeco.co.kr/"));
                startActivity(urlintent);
            }
        });
        mbtn_url4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aromatica.co.kr/"));
                startActivity(urlintent);
            }
        });

    }
}
