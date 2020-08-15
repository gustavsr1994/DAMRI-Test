package id.android.skripsi.damritest.adapter;

public class ApiConstant {
//    private static final String BASE_URL = "http://devapitiket.damri.co.id/authtimeout/token";

    public static TokenService getTokenDevice(String url) {
        return RetrofitHandling.getClient(url).create(TokenService.class);
    }

    public static DataBranchService getDataBranch(String url, String token) {
        return RetrofitHandling.getClientData(url, token).create(DataBranchService.class);
    }

}
