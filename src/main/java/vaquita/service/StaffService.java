package vaquita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vaquita.entity.Staff;
import vaquita.repository.StaffRepository;

@Service
public class StaffService
{
    @Autowired
    private StaffRepository staffRepository;

    @Transactional
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    @Transactional
    public Staff getStaffById(int id){
        return staffRepository.findById(id).isPresent() ? staffRepository.findById(id).get() : null;
    }

    @Transactional
    public  void addStaff(Staff staff){
        staffRepository.save(staff);
    }

    @Transactional
    public void updateStaff(Staff staff){
        staffRepository.save(staff);
    }

    @Transactional
    public void deleteStaff(int id){
        staffRepository.deleteById(id);
    }


}