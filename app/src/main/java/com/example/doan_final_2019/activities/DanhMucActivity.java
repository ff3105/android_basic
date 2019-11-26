package com.example.doan_final_2019.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.doan_final_2019.R;
import com.example.doan_final_2019.adapters.DanhMucAdapter;
import com.example.doan_final_2019.models.DanhMuc;

import java.util.ArrayList;
import java.util.Objects;

public class DanhMucActivity extends AppCompatActivity {
    private GridView gvDanhMuc;

    private DanhMucAdapter danhMucAdapter;
    public static ArrayList<DanhMuc> danhMucs = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhmuc);
        gvDanhMuc = findViewById(R.id.gvDanhMuc);

        //add all danhMuc
        ArrayList<DanhMuc> danhMucsTemp = new ArrayList<>();
        for (int i = 0; i < SanPhamActivity.sanPhams.size(); i++) {
            danhMucsTemp.add(SanPhamActivity.sanPhams.get(i).getDanhMuc());
        }

        //then delete duplicate danhMuc
        for (DanhMuc danhMuc : danhMucsTemp) {
            boolean isFound = false;
            for (DanhMuc e : danhMucs) {
                if (e.getTenDanhMuc().equals(danhMuc.getTenDanhMuc()) || (e.equals(danhMuc))) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) danhMucs.add(danhMuc);
        }

        danhMucAdapter = new DanhMucAdapter(danhMucs, getApplicationContext());
        gvDanhMuc.setAdapter(danhMucAdapter);

        gvDanhMuc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DanhMucItemActivity.class);
                TextView textView = view.findViewById(R.id.tv_tenDM);
                intent.putExtra("tenDM", textView.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_danhmuc, menu);
        Objects.requireNonNull(getSupportActionBar()).setElevation(0);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            case R.id.action_themDM:
                themDM();
                break;
            case R.id.action_sortDM:
        }
        return true;
    }

    private void themDM() {
        final Dialog dialog = new Dialog(DanhMucActivity.this, R.style.DiaLogThemHang);
        dialog.setContentView(R.layout.dialog_danhmuc_themdm);
        dialog.show();
        //
        final EditText etDialogTenDM = dialog.findViewById(R.id.etDialogTenDM);
        final EditText etDialogAnhDM = dialog.findViewById(R.id.etDialogAnhDM);
        Button btnDialogDMAddClick = dialog.findViewById(R.id.btnDialogDMAddClick);

        btnDialogDMAddClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etDialogTenDM.getText().toString().equals("")) {
                    Toast.makeText(DanhMucActivity.this, "Vui lòng nhập lại!", Toast.LENGTH_SHORT).show();
                } else {
                    danhMucs.add(new DanhMuc(etDialogAnhDM.getText().toString(), etDialogTenDM.getText().toString()));
                    danhMucAdapter.notifyDataSetChanged();
                    dialog.dismiss();
                }
            }
        });
    }
}
