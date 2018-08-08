package builder;

/**
 * @author zhuhh 2018/8/8
 */
public class ConcreteBuilder implements Builder{

    private Product resultProduct;

    @Override
    public void buildPart() {

    }

    public Product getResultProduct() {
        return resultProduct;
    }
}
