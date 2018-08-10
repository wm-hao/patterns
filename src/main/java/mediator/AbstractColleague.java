package mediator;

/**
 * @author zhuhh 2018/8/9
 */
public abstract class AbstractColleague {

    private IMediator mediator;

    public AbstractColleague(IMediator mediator) {
        this.mediator = mediator;
    }

    public IMediator getMediator() {
        return  this.mediator;
    }
}
