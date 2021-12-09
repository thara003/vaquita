package vaquita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vaquita.entity.Userrequest;
import vaquita.repository.UserrequestRepository;

@Service
public class UserrequestService
{
    @Autowired
    private UserrequestRepository userrequestRepository;

    @Transactional
    public List<Userrequest> getAllUserrequest() {
        return userrequestRepository.findAll();
    }

    @Transactional
    public Userrequest getUserrequestById(int id){
        return userrequestRepository.findById(id).isPresent() ? userrequestRepository.findById(id).get() : null;
    }

    @Transactional
    public  void addUserrequest(Userrequest userrequest){
        userrequestRepository.save(userrequest);
    }



    @Transactional
    public void deleteUserrequest(int id){
        userrequestRepository.deleteById(id);
    }


}