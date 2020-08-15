package id.android.skripsi.damritest;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import id.android.skripsi.damritest.adapter.ApiConstant;
import id.android.skripsi.damritest.adapter.DataBranchService;
import id.android.skripsi.damritest.adapter.TokenService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TokenService tokenService;
    DataBranchService dataBranchService;
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tokenService = ApiConstant.getTokenDevice("http://devapitiket.damri.co.id/authtimeout/");
        getToken("test", "damri123");
    }

    private void getToken(String username, String password) {
        Call<Object> callToken = tokenService.getToken(username, password);
        callToken.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                if (response.isSuccessful()) {
                    token = response.body().toString();
                    Toast.makeText(MainActivity.this, "Token : " + token, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error get Token", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void getDataBranch(String token) {

        dataBranchService = ApiConstant.getDataBranch("http://devapitiket.damri.co.id/apps/damriapps/", token);
        Call<DataBranchModel> callDataBranch = dataBranchService.getListData();
        callDataBranch.enqueue(new Callback<DataBranchModel>() {
            @Override
            public void onResponse(Call<DataBranchModel> call, Response<DataBranchModel> response) {
                if (response.isSuccessful()) {
                    DataBranchModel dataBranchModel = response.body();


                }
            }

            @Override
            public void onFailure(Call<DataBranchModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error get Token", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
