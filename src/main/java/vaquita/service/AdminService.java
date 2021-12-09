package vaquita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vaquita.entity.Admin;
import vaquita.repository.AdminRepository;

@Service
public class AdminService
{
    @Autowired
    private AdminRepository adminRepository;

    @Transactional
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    @Transactional
    public Admin getAdminById(int id){
        return adminRepository.findById(id).isPresent() ? adminRepository.findById(id).get() : null;
    }

    @Transactional
    public  void addAdmin(Admin admin){
        adminRepository.save(admin);
    }

    @Transactional
    public void updateAdmin(Admin admin){
        adminRepository.save(admin);
    }

    @Transactional
    public void deleteAdmin(int id){
        adminRepository.deleteById(id);
    }


}