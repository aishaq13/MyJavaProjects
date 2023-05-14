package Chapter6Assingmnet;
    public class Customer {
        private String name;
        private int creditScore;
        
        // constructor
        public Customer(String name, int creditScore) {
            setName(name);
            setCreditScore(creditScore);
        }
        
        // setter methods
        public void setName(String name) {
            this.name = name;
        }
        
        public void setCreditScore(int creditScore) {
            // validate credit score
            if(creditScore < 300) {
                this.creditScore = 300;
            } else {
                this.creditScore = creditScore;
            }
        }
        
        // getter methods
        public String getName() {
            return this.name;
        }
        
        public int getCreditScore() {
            return this.creditScore;
        }
        
        public String getCreditRating() {
            if(this.creditScore < 630) {
                return "Bad";
            } else if(this.creditScore < 690) {
                return "Fair";
            } else if(this.creditScore < 720) {
                return "Good";
            } else {
                return "Excellent";
            }
        }
    }
    


