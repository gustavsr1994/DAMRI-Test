package id.android.skripsi.damritest;

import java.util.ArrayList;

public class DataBranchModel {
    public class Application {
        private String status;
        private String response_code;
        ArrayList<Object> data = new ArrayList<Object>();

        // Getter Methods

        public String getStatus() {
            return status;
        }

        public String getResponse_code() {
            return response_code;
        }

        // Setter Methods

        public void setStatus( String status ) {
            this.status = status;
        }

        public void setResponse_code( String response_code ) {
            this.response_code = response_code;
        }
    }
}
