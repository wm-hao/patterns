package facade.impl;

import facade.interfaces.IController;
import facade.interfaces.IDao;
import facade.interfaces.IFacade;
import facade.interfaces.IService;

/**
 * @author zhuhh 2018/8/8
 */
public class OneFacadeImpl implements IFacade {

    private IDao dao;
    private IService service;
    private IController controller;

    public OneFacadeImpl(IDao dao, IService service, IController controller) {
        this.dao = dao;
        this.service = service;
        this.controller = controller;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public IService getService() {
        return service;
    }

    public void setService(IService service) {
        this.service = service;
    }

    public IController getController() {
        return controller;
    }

    public void setController(IController controller) {
        this.controller = controller;
    }

    @Override
    public void d() {
        dao.d();
    }

    @Override
    public void s() {
        service.s();
    }

    @Override
    public void c() {
        controller.c();
    }

    @Override
    public void generateCode() {
        dao.generateDao();
        service.generateService();
        controller.generateControllerCode();
    }
}
