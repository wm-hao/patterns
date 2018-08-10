package prototype;

/**
 * @author zhuhh 2018/8/9
 */
public class ConcreteProptype2 implements  Proptype{
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Proptype clone() {
        ConcreteProptype2 concreteProptype2 = new ConcreteProptype2();
        concreteProptype2.setName(this.getName());
        return concreteProptype2;
    }
}
