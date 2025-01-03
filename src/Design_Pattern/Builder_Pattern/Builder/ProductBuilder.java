package Design_Pattern.Builder_Pattern.Builder;

public class ProductBuilder {
    private final String CPU;
    private final String RAM;
    private final String STORAGE;
    private final boolean isGraphicsCardEnable;

    private ProductBuilder(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.STORAGE = builder.storage;
        this.isGraphicsCardEnable = builder.isGraphicsCardEnabled;
    }
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + STORAGE + ", GraphicsCard=" + isGraphicsCardEnable + "]";
    }
    // Static Builder Class
    public static class ComputerBuilder {
        private final String CPU;
        private final String RAM;
        private String storage;
        private boolean isGraphicsCardEnabled;

        // Constructor for mandatory fields
        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Optional setters for optional fields
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        // Build method to return the final object
        public ProductBuilder build() {
            return new ProductBuilder(this);
        }
    }
}
