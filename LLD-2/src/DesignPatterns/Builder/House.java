package DesignPatterns.Builder;

public class House {
    private String name;
    private String address;
    private int houseNo;
    private boolean validation=false;

    private House(Builder builder){
        this.name=builder.getName();
        this.address=builder.getAddress();
        this.validation=builder.isValidation();
        this.houseNo=builder.getHouseNo();
    };

    public void getProfile(){
      System.out.println(this.name+"--"+this.address+"--"+this.validation+"--"+this.houseNo);
    };

    public static Builder getinstance(){
        return new Builder();
    };


    static class Builder {
        private String name;
        private String address;
        private int houseNo;
        private boolean validation;

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getHouseNo() {
            return houseNo;
        }

        public Builder setHouseNo(int houseNo) {
            this.houseNo = houseNo;
            return this;
        }

        public boolean isValidation() {
            return validation;
        }

        public Builder setValidation(boolean validation) {
            this.validation = validation;
            return this;
        };

        public House build(){
            return new House(this);
        }
    };


}
