package builder;

/**
 * @author zhuhh 2018/8/8
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart();
    }
}
