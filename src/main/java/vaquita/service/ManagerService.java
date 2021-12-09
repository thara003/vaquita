package vaquita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import vaquita.entity.Manager;
import vaquita.repository.ManagerRepository;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepository managerRepository;

    @Transactional
    public List<Manager> getAllManager() {
        return managerRepository.findAll();
    }

    @Transactional
    public Manager getManagerById(int id){
        return managerRepository.findById(id).isPresent() ? managerRepository.findById(id).get() : null;
    }

    @Transactional
    public  void addManager(Manager manager){
        managerRepository.save(manager);
    }

    @Transactional
    public void updateManager(Manager manager){
        managerRepository.save(manager);
    }

    @Transactional
    public void deleteManager(int id){
        managerRepository.deleteById(id);
    }

}
