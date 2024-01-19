package repository.impl;

import model.Facility;
import model.House;
import model.Person;
import model.Villa;
import repository.IRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IRepository<Facility> {
    private static LinkedHashMap<Facility, Integer> facilitys = new LinkedHashMap<>();

    static {
        facilitys.put(new Villa("SVVL-0001", "Villa1", 50, 1000, 5, Facility.RentalType.BY_DAY, "Standard", 30, 3), 0);
        facilitys.put(new Villa("SVVL-0001", "Villa2", 100, 1500, 5, Facility.RentalType.BY_DAY, "Vip", 50, 4), 0);
        facilitys.put(new House("SVHO-0002", "House1", 40, 400, 3, Facility.RentalType.BY_DAY, "Vip", 4), 10);

    }

    public FacilityRepository() {
    }

    @Override
    public Facility get(String id) {
        for (Map.Entry<Facility, Integer> entry : facilitys.entrySet()) {
            if (entry.getKey().getServiceId().equals(id)) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public ArrayList<Facility> getAll() {
        ArrayList<Facility> facilityArrayList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : facilitys.entrySet()) {
            facilityArrayList.add(entry.getKey());
        }
        return facilityArrayList;
    }

    @Override
    public void add(Facility facility) {
        if (!facilitys.containsKey(facility)) {
            facilitys.put(facility, 0);
        }
    }

    @Override
    public void delete(String id) {
        Facility facility = get(id);
        if (facility != null) {
            facilitys.remove(facility);
        }
    }

    @Override
    public void update(Facility facility) {
        if (facilitys.containsKey(facility)) {
            facilitys.replace(facility, 0);
        }
    }

    @Override
    public ArrayList<String> listToCsv(ArrayList<Facility> list) {
        return null;
    }
    public ArrayList<Facility> getAllNeedMaintain() {
        ArrayList<Facility> facilityArrayList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : facilitys.entrySet()) {
            if (entry.getValue()>5) {
                facilityArrayList.add(entry.getKey());
            }
        }
        return facilityArrayList;
    }
    public void increaseUsedTime(Facility facility) {
        Integer usedTime = facilitys.get(facility);
        facilitys.replace(facility,usedTime+1);
    }
}


