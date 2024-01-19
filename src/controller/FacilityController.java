package controller;

import model.Facility;
import service.impl.FacilityService;

import javax.swing.*;
import java.util.ArrayList;

public class FacilityController {
    private FacilityService facilityService;

    public FacilityController(FacilityService facilityService) {
        this.facilityService = facilityService;
    }
    public ArrayList<Facility> getAll() {
        return facilityService.getAll();
    }
    public Facility get(String id) {
        return facilityService.get(id);
    }
    public String add(Facility facility) {
        if (facilityService.get(facility.getServiceId())==null) {
            facilityService.add(facility);
        return "Thêm mới thành công !";
        }
        return "Đã tồn tại !";
    }
    public String update(Facility facility) {
        if (facilityService.get(facility.getServiceId())!=null) {
            facilityService.update(facility);
            return "Sửa thành công !";
        }
        return "Không tồn tại !";
    }
    public String delete(String id) {
        if (facilityService.get(id)!=null) {
            facilityService.delete(id);
            return "Xóa thành công !";
        }
        return "Không tồn tại !";
    }
    public ArrayList<Facility> getAllNeedMaintain() {
        return facilityService.getAllNeedMaintain();
    }

}
