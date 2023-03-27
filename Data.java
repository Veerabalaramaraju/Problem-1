class Data {
    private String product;
    private double value;

    public Data(String product, double value) {
        this.product = product;
        this.value = value;
    }

    public double getvalue() {
        return value;
    }

    public String getproduct() {
        return product;
    }

    @Override
    public String toString() {
        return "{" + this.product + ":" + this.value + "}";
    }
}