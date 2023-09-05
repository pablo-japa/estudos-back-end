import Model.FatorialModel;
import View.FatorialView;
import Controller.FatorialController;

public class Main {
    public static void main(String[] args) {
        FatorialModel fatorialModel = new FatorialModel();
        FatorialView fatorialView = new FatorialView();
        FatorialController fatorialController = new FatorialController(fatorialModel, fatorialView);

       fatorialController.calcularFatorial();
    }
}