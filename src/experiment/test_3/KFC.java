package experiment.test_3;

/**
 * @Author Ardien
 * @Date 5/28/2020 9:02 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class KFC {
    private String hamburg;
    private String chicken;
    private String drinks;
    private String coke;

    public KFC(Builder builder) {
        this.chicken = builder.chicken;
        this.coke = builder.coke;
        this.drinks = builder.drinks;
        this.hamburg = builder.hamburg;
    }

    public String getHamburg() {
        return hamburg;
    }

    public void setHamburg(String hamburg) {
        this.hamburg = hamburg;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getCoke() {
        return coke;
    }

    public void setCoke(String coke) {
        this.coke = coke;
    }

    @Override
    public String toString() {
        return "您的下单的KFC套餐为：" +
                "hamburg='" + hamburg + '\'' +
                ", chicken='" + chicken + '\'' +
                ", drinks='" + drinks + '\'' +
                ", coke='" + coke + '\'' +
                "，稍后将为您送到。";
    }

    public static class Builder {
        private String hamburg = "烤鸡堡";
        private String chicken = "烤鸡";
        private String drinks = "樱之雪";
        private String coke = "可口可乐";

        public Builder() {
        }

        public Builder hamburg(String hamburg) {
            this.hamburg = hamburg;
            return this;
        }

        public Builder chicken(String chicken) {
            this.chicken = chicken;
            return this;
        }

        public Builder drinks(String drinks) {
            this.drinks = drinks;
            return this;
        }

        public Builder coke(String coke) {
            this.coke = coke;
            return this;
        }

        public KFC build() {
            return new KFC(this);
        }
    }
}
