package service;

import models.Hopital;
import models.Medecin;

interface IService {
    void addHopital(Hopital hopital);
    void listerHopital();
    Hopital seachHopital(int id);
    void addMedecin(Medecin medecin,Hopital hopital);
    //surcharge
    void listerMedecin();
    void listerMedecin(Hopital hopital);
    
}
