package vaquita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vaquita.entity.Events;
import vaquita.entity.Review;
import vaquita.repository.EventsRepository;

@Service
public class EventsService {

    @Autowired
    private EventsRepository eventsRepository;

    @Transactional
    public List<Events> getAllEvents() {
        return eventsRepository.findAll();
    }

    @Transactional
    public Events getEventsById(int id){
        return eventsRepository.findById(id).isPresent() ? eventsRepository.findById(id).get() : null;
    }

    @Transactional
    public  void addEvents(Events events){
        eventsRepository.save(events);
    }

    @Transactional
    public void updateEvents(Events events){
        eventsRepository.save(events);
    }

    @Transactional
    public void deleteEvents(int id){
        eventsRepository.deleteById(id);
    }

//    @Transactional
//    public void remove(E review) {
//        eventsRepository.delete(review);
//    }
}
