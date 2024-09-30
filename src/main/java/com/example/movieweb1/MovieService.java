package com.example.movieweb1;
// import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    
   private final MovieRepository f;
   
   public MovieService(MovieRepository f) {
    this.f = f;
}

public MovieApp save(MovieApp m) {
    //    f.save(m);
       return f.save(m);

   }
// public Iterable<MovieApp> findAll() {
    // return f.findAll();
// }   
public List<MovieApp> savebulk(List<MovieApp> m) {
    return f.saveAll(m);
}
// public List<MovieApp> findByTitle(String name) {
    // return (List<MovieApp>) f.findByTitle(name);
// }
// public List<MovieApp> findByTitle MovieService(String name) {
    // return (List<MovieApp>) f.findByTitleLike(name);
// }
 public  String deletemoMovieApp(Long id){
    f.deleteById(id);
    return "deleted";
 }
//  public List<MovieApp> findByRelease_date(LocalDateTime today) {
    // LocalDateTime now = LocalDateTime.now();
    // return  f.findByRelease_date(today);
// }
 } 
    
     
     
    
   

