package vaquita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vaquita.entity.Feedback;
import vaquita.repository.FeedbackRepository;

@Service
public class FeedbackService
{
    @Autowired
    private FeedbackRepository feedbackRepository;

    @Transactional
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    @Transactional
    public Feedback getFeedbackById(int id){
        return feedbackRepository.findById(id).isPresent() ? feedbackRepository.findById(id).get() : null;
    }

    @Transactional
    public  void addFeedback(Feedback feedback){
       feedbackRepository.save(feedback);
    }

   

    @Transactional
    public void deleteFeedback(int id){
        feedbackRepository.deleteById(id);
    }


}