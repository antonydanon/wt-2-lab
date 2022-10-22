package main.service;

import main.dao.ApplianceDAO;
import main.model.Appliance;
import main.model.Kettle;

import java.util.List;

public class ApplianceService {
    private final ApplianceDAO applianceDAO;

    public ApplianceService() {
        this.applianceDAO = new ApplianceDAO();
    }

    public Appliance getCheapestAppliance() {
        return applianceDAO.findCheapestAppliance();
    }

    public List<Kettle> getKettles() {
        return applianceDAO.findKettles();
    }
}
