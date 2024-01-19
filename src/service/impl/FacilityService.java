package service.impl;

import model.Facility;
import repository.IRepository;
import repository.impl.FacilityRepository;
import service.IService;

import java.util.ArrayList;
import java.util.Map;

public class FacilityService implements IService<Facility> {
    private IRepository<Facility> facilityRepo ;

    public FacilityService(IRepository<Facility> facilityRepo) {
        this.facilityRepo = facilityRepo;
    }

    @Override
    public ArrayList<Facility> getAll() {
        return facilityRepo.getAll();
    }

    @Override
    public void add(Facility facility) {
        facilityRepo.add(facility);
    }

    @Override
    public void delete(String id) {
        facilityRepo.delete(id);
    }

    @Override
    public void update(Facility facility) {
        facilityRepo.update(facility);
    }

    @Override
    public Facility get(String id) {
        return facilityRepo.get(id);
    }
    public ArrayList<Facility> getAllNeedMaintain() {
        FacilityRepository repo = (FacilityRepository) facilityRepo;
        return repo.getAllNeedMaintain();
    }

}
