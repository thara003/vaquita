package vaquita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vaquita.entity.Billing;
import vaquita.repository.BillingRepository;

@Service
public class BillingService
{
    @Autowired
    private BillingRepository billingRepository;

    @Transactional
    public List<Billing> getAllBilling() {
        return billingRepository.findAll();
    }

    @Transactional
    public Billing getBillingById(int id){
        return billingRepository.findById(id).isPresent() ? billingRepository.findById(id).get() : null;
    }

    @Transactional
    public  void addBilling(Billing billing){
        billingRepository.save(billing);
    }

    @Transactional
    public void updateBilling(Billing billing){
        billingRepository.save(billing);
    }

    @Transactional
    public void deleteBilling(int id){
        billingRepository.deleteById(id);
    }


}