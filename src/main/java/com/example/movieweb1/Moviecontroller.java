package com.example.movieweb1;
// 
// import java.time.LocalDateTime;
import java.util.List;
// 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import jakarta.websocket.server.PathParam;
@RestController
// @RequestMapping("/movie")
public class Moviecontroller {
    private MovieService s;
    public Moviecontroller(MovieService s) {
        this.s = s;
    }
    @PostMapping("/save")
    public MovieApp save(@RequestBody MovieApp m) {
        return s.save(m);
}
    // @PostMapping("/findAll")
    // public Iterable<MovieApp> findAll() {
        // return s.findAll();
// }
@GetMapping("/savebulk")
public List<MovieApp> savebulk(@RequestBody List<MovieApp> m) {
    return s.savebulk(m);
  
}
// @GetMapping("/findByTitle")
// public List<MovieApp> findByTitle(@PathParam("name") String name) {
    // return s.findByTitle(name);
    //  }
     @DeleteMapping("/delete/{id}")
        public String deleteMovieApp( @PathVariable Long id) {
           
            return  s.deletemoMovieApp(id);
        }
        // @GetMapping("/findByRelease_date")
        // public List<MovieApp> findByRelease_date() {
            // return s.findByRelease_date(LocalDateTime.now());
    //  }
    }