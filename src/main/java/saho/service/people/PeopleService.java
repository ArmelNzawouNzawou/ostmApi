package saho.service.people;

import saho.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saho.repository.people.PeopleRepo;
import saho.service.ServiceInterface;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService implements ServiceInterface<People,String> {
    @Autowired
    private PeopleRepo peopleRepo;
    private static PeopleService peopleService;
    private PeopleService(){

    }
    public static  PeopleService getPeopleService(){
        if(peopleService==null){
            peopleService=new PeopleService();
        }return peopleService;
    }
    @Override
    public People create(People people) {
        return peopleRepo.save(people);
    }

    @Override
    public People read(String t) {
        Optional<People> result=peopleRepo.findById(t);
        return result.orElse(null);
    }

    @Override
    public People delete(String t) {
        Optional<People> result=peopleRepo.findById(t);
        if(result!=null) {
            peopleRepo.deleteById(t);
            return result.get();
        }
        return null;
    }

    @Override
    public People update(People people) {
        return peopleRepo.save(people);
    }

    @Override
    public List<People> readAll() {
        return  peopleRepo.findAll();
    }
}
