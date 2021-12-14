package vaquita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vaquita.entity.Client;
import vaquita.repository.ClientRepository;

@Service
public class ClientService
{
    @Autowired
    private ClientRepository clientRepository;

    @Transactional
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Transactional
    public Client getAllClientById(int id){
        return clientRepository.findById(id).isPresent() ? clientRepository.findById(id).get() : null;
    }

    @Transactional
    public  void addClient(Client client){
         clientRepository.save(client);
    }

    @Transactional
    public void updateClient(Client client){
        clientRepository.save(client);
    }

    @Transactional
    public void deleteClient(int id){
        clientRepository.deleteById(id);
    }

//    public Course findById(int id) {
//        return courseRepository.findById(id).get();
//    }
//
//    @Transactional
//    public Course save(Course course) {
//        return courseRepository.save(course);
//    }
}