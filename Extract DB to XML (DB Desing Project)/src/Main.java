import javax.xml.parsers.ParserConfigurationException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws SQLException, ParserConfigurationException {
        ArrayList<Orders> orderList=new ArrayList<>();
        DB ToExtract=new DB();
        ToExtract.makeJDBCConnection();
        ToExtract.getOrders(orderList);
        ToXML.extractToXML(orderList);
    }
    static class Orders{
        int ID;
        String Name;
        String Gender;
        String BIRTH_DATE;
        String MARITAL_STATUS;
        String INCOME_LEVEL;
        int CREDIT_LIMIT;
        String EMAIL;
        String USER_CREATED;
        String DATE_CREATED;
        String USER_MODIFIED;
        String DATE_MODIFIED;
        int ORDER_ID;
        int CUSTOMER_ID;
        int TOTAL_GAIN;
        int TOTAL_COST;

        public Orders(int ID, String name, String gender, String BIRTH_DATE, String MARITAL_STATUS, String INCOME_LEVEL, int CREDIT_LIMIT, String EMAIL, String USER_CREATED, String DATE_CREATED, String USER_MODIFIED, String DATE_MODIFIED, int ORDER_ID, int CUSTOMER_ID, int TOTAL_GAIN, int TOTAL_COST) {
            this.ID = ID;
            Name = name;
            Gender = gender;
            this.BIRTH_DATE = BIRTH_DATE;
            this.MARITAL_STATUS = MARITAL_STATUS;
            this.INCOME_LEVEL = INCOME_LEVEL;
            this.CREDIT_LIMIT = CREDIT_LIMIT;
            this.EMAIL = EMAIL;
            this.USER_CREATED = USER_CREATED;
            this.DATE_CREATED = DATE_CREATED;
            this.USER_MODIFIED = USER_MODIFIED;
            this.DATE_MODIFIED = DATE_MODIFIED;
            this.ORDER_ID = ORDER_ID;
            this.CUSTOMER_ID = CUSTOMER_ID;
            this.TOTAL_GAIN = TOTAL_GAIN;
            this.TOTAL_COST = TOTAL_COST;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        public void setBIRTH_DATE(String BIRTH_DATE) {
            this.BIRTH_DATE = BIRTH_DATE;
        }

        public void setMARITAL_STATUS(String MARITAL_STATUS) {
            this.MARITAL_STATUS = MARITAL_STATUS;
        }

        public void setINCOME_LEVEL(String INCOME_LEVEL) {
            this.INCOME_LEVEL = INCOME_LEVEL;
        }

        public void setCREDIT_LIMIT(int CREDIT_LIMIT) {
            this.CREDIT_LIMIT = CREDIT_LIMIT;
        }

        public void setEMAIL(String EMAIL) {
            this.EMAIL = EMAIL;
        }

        public void setUSER_CREATED(String USER_CREATED) {
            this.USER_CREATED = USER_CREATED;
        }

        public void setDATE_CREATED(String DATE_CREATED) {
            this.DATE_CREATED = DATE_CREATED;
        }

        public void setUSER_MODIFIED(String USER_MODIFIED) {
            this.USER_MODIFIED = USER_MODIFIED;
        }

        public void setDATE_MODIFIED(String DATE_MODIFIED) {
            this.DATE_MODIFIED = DATE_MODIFIED;
        }

        public void setORDER_ID(int ORDER_ID) {
            this.ORDER_ID = ORDER_ID;
        }

        public void setCUSTOMER_ID(int CUSTOMER_ID) {
            this.CUSTOMER_ID = CUSTOMER_ID;
        }

        public void setTOTAL_GAIN(int TOTAL_GAIN) {
            this.TOTAL_GAIN = TOTAL_GAIN;
        }

        public void setTOTAL_COST(int TOTAL_COST) {
            this.TOTAL_COST = TOTAL_COST;
        }

        public int getID() {
            return ID;
        }

        public String getName() {
            return Name;
        }

        public String getGender() {
            return Gender;
        }

        public String getBIRTH_DATE() {
            return BIRTH_DATE;
        }

        public String getMARITAL_STATUS() {
            return MARITAL_STATUS;
        }

        public String getINCOME_LEVEL() {
            return INCOME_LEVEL;
        }

        public int getCREDIT_LIMIT() {
            return CREDIT_LIMIT;
        }

        public String getEMAIL() {
            return EMAIL;
        }

        public String getUSER_CREATED() {
            return USER_CREATED;
        }

        public String getDATE_CREATED() {
            return DATE_CREATED;
        }

        public String getUSER_MODIFIED() {
            return USER_MODIFIED;
        }

        public String getDATE_MODIFIED() {
            return DATE_MODIFIED;
        }

        public int getORDER_ID() {
            return ORDER_ID;
        }

        public int getCUSTOMER_ID() {
            return CUSTOMER_ID;
        }

        public int getTOTAL_GAIN() {
            return TOTAL_GAIN;
        }

        public int getTOTAL_COST() {
            return TOTAL_COST;
        }
    }
}
