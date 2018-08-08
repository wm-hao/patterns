package facade;

import facade.impl.ControllerImpl;
import facade.impl.DaoImpl;
import facade.impl.OneFacadeImpl;
import facade.impl.ServiceImpl;
import facade.interfaces.IController;
import facade.interfaces.IDao;
import facade.interfaces.IFacade;
import facade.interfaces.IService;

/**
 * @author zhuhh 2018/8/8
 */
public class FacadeFacotry {

    public static IFacade createFacade() {
        IDao dao = new DaoImpl();
        IService service = new ServiceImpl();
        IController controller = new ControllerImpl();
        return new OneFacadeImpl(dao,service, controller);
    }
}
