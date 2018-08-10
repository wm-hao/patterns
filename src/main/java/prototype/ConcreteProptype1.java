package prototype;

/**
 * @author zhuhh 2018/8/9
 */
public class ConcreteProptype1 implements  Proptype{
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
        ConcreteProptype1 concreteProptype1 = new ConcreteProptype1();
        concreteProptype1.setName(this.getName());
        return concreteProptype1;
    }
}
