package id.android.skripsi.damritest.adapter;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface TokenService {
    @POST("token")
    Call<Object> getToken(@Field("username") String username,
                            @Field("password") String password);
}
