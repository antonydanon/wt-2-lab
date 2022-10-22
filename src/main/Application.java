package main;

import main.service.ApplianceService;

public class Application {
    public static void main(String[] args) {
        ApplianceService applianceService = new ApplianceService();
        System.out.println(applianceService.getCheapestAppliance());
        System.out.println(applianceService.getKettles());
    }
}
