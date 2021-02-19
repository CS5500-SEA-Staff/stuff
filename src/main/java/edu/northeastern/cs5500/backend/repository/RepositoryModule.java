package edu.northeastern.cs5500.backend.repository;

import dagger.Module;
import dagger.Provides;
import edu.northeastern.cs5500.backend.model.Stuff;
import edu.northeastern.cs5500.backend.model.User;

//here, read codes in controller > StuffController 
@Module
public class RepositoryModule {
    @Provides
    public GenericRepository<Stuff> provideStuffRepository() {
        return new InMemoryRepository<>();
    }

    @Provides
    public GenericRepository<User> provideUserRepository() {
        return new InMemoryRepository<>();
    }
}

/*
// Here's an example of how you might swap out the in-memory repository for a database-backed
// repository:

package edu.northeastern.cs5500.backend.repository;

import dagger.Module;
import dagger.Provides;
import edu.northeastern.cs5500.backend.model.Stuff;
import edu.northeastern.cs5500.backend.service.MongoDBService;

@Module
public class RepositoryModule {
    @Provides
    public GenericRepository<Stuff> provideStuffRepository(MongoDBService mongoDBService) {
        return new MongoDBRepository<>(Stuff.class, mongoDBService);
    }
}

*/
