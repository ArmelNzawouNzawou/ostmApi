package saho.service.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saho.domain.Collection;
import saho.repository.Collection.CollectionRepo;
import saho.service.ServiceInterface;

import java.util.List;
import java.util.Optional;

@Service
public class CollectionService implements ServiceInterface <Collection,String> {

    @Autowired
    private CollectionRepo collectionRepo;
    private static CollectionService collectionService;

    private CollectionService(){

    }

    public static CollectionService getCollectionService(){
        if (collectionService==null){
            collectionService = new CollectionService();

    } return collectionService;
}
@Override
public Collection create (Collection collection){
    return collectionRepo.save(collection);
    }

    @Override
    public Collection read (String t) {

        Optional<Collection> result = collectionRepo.findById(t);
         return result.orElse(null);
        }

    @Override
    public  Collection delete (String t){
        Optional<Collection> result =  collectionRepo.findById(t);
        if (result != null){
            collectionRepo.deleteById(t);
            return result.get();

        }
        return  null;
    }
    @Override
    public Collection update (Collection collection){
        return collectionRepo.save(collection);


    }

    @Override
    public List<Collection> readAll() {
        return collectionRepo.findAll();
    }
}



