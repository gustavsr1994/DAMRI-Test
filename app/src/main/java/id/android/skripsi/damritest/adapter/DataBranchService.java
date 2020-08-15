package id.android.skripsi.damritest.adapter;

import id.android.skripsi.damritest.DataBranchModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DataBranchService {
    @POST("getOrigin")
    Call<DataBranchModel> getListData();
}
